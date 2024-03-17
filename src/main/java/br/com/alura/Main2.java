package br.com.alura;

import br.com.alura.dao.ProdutoDao;
import br.com.alura.modelo.Produto;
import br.com.alura.util.JPAutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        EntityManager em = JPAutil.getEntityManager();
        em.getTransaction().begin();

        ProdutoDao produtoDao = new ProdutoDao(em);
        List<Produto> lista = produtoDao.lista();
        System.out.println(lista);

        em.getTransaction().commit();
        em.close();
    }
}
