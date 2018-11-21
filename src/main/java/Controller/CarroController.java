package Controller;

import Model.CarroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.*;
import java.util.List;

public class CarroController {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("carro");
        EntityManager em = emf.createEntityManager();

        public void inserir(CarroEntity carroEntity) {
            try {
                em.getTransaction().begin();
                em.persist(carroEntity);
                em.getTransaction().commit();
                emf.close();
                JOptionPane.showMessageDialog(null, "Carro inserido com sucesso");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possível inserir um novo carro no sistema");
            }
        }

        public void deletar(CarroEntity carroEntity){
            try {
                em.getTransaction().begin();
                carroEntity = em.find(CarroEntity.class,carroEntity.getId());
                em.remove(carroEntity);
                em.getTransaction().commit();
                emf.close();
                JOptionPane.showMessageDialog(null, "Carro deletado com sucesso");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possível deletar o carro do sistema");
            }
        }

        public List<CarroEntity> listar(){
            try {
                em.getTransaction().begin();
                Query consulta = em.createQuery("select c from CarroEntity c");
                List<CarroEntity> lista = consulta.getResultList();
                em.getTransaction().commit();
                emf.close();
                return lista;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possível receber os dados do sistema");
                return null;
            }
        }

        public void atualizar(CarroEntity carroEntity){
            try {
                em.getTransaction().begin();
                em.merge(carroEntity);
                em.getTransaction().commit();
                emf.close();
                JOptionPane.showMessageDialog(null, "Carro atualizado com sucesso");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados do sistema");
            }
        }
}

