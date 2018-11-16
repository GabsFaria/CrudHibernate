package Controller;

import Model.CarroDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CarroController {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("carro");
        EntityManager em = emf.createEntityManager();

        public void inserir(CarroDAO carroDAO) {
            em.getTransaction().begin();
            em.persist(carroDAO);
            em.getTransaction().commit();
            emf.close();
        }

        public void deletar(CarroDAO carroDAO){
            em.getTransaction().begin();
            Query q = em.createNativeQuery("delete from carro where placa = '"+carroDAO.getPlaca()+"'");
            q.executeUpdate();
            em.getTransaction().commit();
            emf.close();
        }

        public List<CarroDAO> listar(){
            em.getTransaction().begin();
            Query consulta = em.createQuery("select c from CarroDAO c");
            List<CarroDAO> lista = consulta.getResultList();
            em.getTransaction().commit();
            emf.close();
            return lista;
        }

        public void atualizar(CarroDAO carroDAO){
            em.getTransaction().begin();
            em.merge(carroDAO);
            em.getTransaction().commit();
            emf.close();
        }
}

