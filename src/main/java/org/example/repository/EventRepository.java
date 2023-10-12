package org.example.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.domain.Event;

public class EventRepository {
    private final EntityManagerFactory entityManagerFactory;
    public EventRepository(){
        entityManagerFactory= Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void save(Event event){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(event);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


}
