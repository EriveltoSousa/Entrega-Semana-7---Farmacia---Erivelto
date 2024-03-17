package br.com.alura.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("farmacia");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();

    }

 }
