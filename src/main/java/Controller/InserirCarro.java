package Controller;

import Model.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InserirCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setNome("Gol Bolinha");
        carro.setMarca("Volkswagem");
        carro.setAno("1998");
        carro.setPlaca("ABC-4568");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("carro");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(carro);

        em.getTransaction().commit();
        em.close();
    }
}
