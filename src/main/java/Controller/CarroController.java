package Controller;

import Model.CarroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CarroController {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("carro");
        EntityManager em = emf.createEntityManager();

        public void inserir(CarroEntity carroEntity) {
            em.getTransaction().begin();
            em.persist(carroEntity);
            em.getTransaction().commit();
            emf.close();
        }

        public void deletar(CarroEntity carroEntity){
            em.getTransaction().begin();
            Query q = em.createNativeQuery("delete from carro where placa = '"+ carroEntity.getPlaca()+"'");
            q.executeUpdate();
            em.getTransaction().commit();
            emf.close();
        }

        public List<CarroEntity> listar(){
            em.getTransaction().begin();
            Query consulta = em.createQuery("select c from CarroEntity c");
            List<CarroEntity> lista = consulta.getResultList();
            em.getTransaction().commit();
            emf.close();
            return lista;
        }

        public void atualizar(CarroEntity carroEntity){
            em.getTransaction().begin();
            em.merge(carroEntity);
            em.getTransaction().commit();
            emf.close();
        }
}

