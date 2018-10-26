/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Casa;

/**
 *
 * @author fernandocerveira
 */
@Stateless
public class CasaDao {
    @PersistenceContext
    EntityManager em;
    

    public List<Casa> getList() {
        Query q = em.createQuery("select c from Casa c");
        return q.getResultList();
    }

    
    public void excluir(Object obj) throws Exception {
        em.remove(em.merge(obj));
    }

    
    public void gravar(Object obj, boolean inc) throws Exception {
         if (inc == true) {
            em.persist(obj);
        } else {
            em.merge(obj);
        }
    }

      

}