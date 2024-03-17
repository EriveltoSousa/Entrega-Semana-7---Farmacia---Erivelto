package br.com.alura;

import br.com.alura.dao.FabricanteDao;
import br.com.alura.dao.ProdutoDao;
import br.com.alura.modelo.Fabricante;
import br.com.alura.modelo.Produto;
import br.com.alura.util.JPAutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAutil.getEntityManager();
        em.getTransaction().begin();

        FabricanteDao fabricanteDao = new FabricanteDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);

        Fabricante fabricante = new Fabricante("Hypera");
        fabricanteDao.cadstrar(fabricante);

        Produto produto = new Produto("Dipirona", "Para febre", 10, fabricante);
        produtoDao.cadastrar(produto);

        em.getTransaction().commit();
        em.close();
    }
}