package br.com.alura.dao;

import br.com.alura.modelo.Fabricante;

import javax.persistence.EntityManager;

public class FabricanteDao {
    private EntityManager em;
    public FabricanteDao(EntityManager em){
        this.em = em;
    }

    public void cadstrar(Fabricante fabricante){
        this.em.persist(fabricante);
    }

}
