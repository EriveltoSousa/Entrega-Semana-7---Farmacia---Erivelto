package br.com.alura.dao;

import br.com.alura.modelo.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {
    private EntityManager em;
    public ProdutoDao(EntityManager em){
        this.em = em;

    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

    public List<Produto> lista(){
        String jpql = "SELECT p FROM Produto p";
        return  em.createQuery(jpql, Produto.class).getResultList();
    }
    public Produto buscarPorid(int id){
        return em.find(Produto.class, id);
   }

   public void atualiza(Produto produto){
   this.em.merge(produto);
   }
}




