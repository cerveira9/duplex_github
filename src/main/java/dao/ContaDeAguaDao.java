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
import model.ContaDeAgua;

/**
 *
 * @author fernandocerveira
 */
@Stateless
public class ContaDeAguaDao {
    @PersistenceContext
    EntityManager em;
    

    public List<ContaDeAgua> getList() {
        Query q = em.createQuery("select ca from ContaDeAgua ca");
        return q.getResultList();
    }
    
    public List<ContaDeAgua> getList(Long id) {
        Query q = em.createQuery("select ca from ContaDeAgua ca");
        return q.getResultList();
    }

    public void gravar(ContaDeAgua object, boolean i) {
        if (i == true) {
            em.persist(object);
        } else {
            em.merge(object);
        }
    }

    public void excluir(ContaDeAgua object) {
        em.remove(em.merge(object));
    }

}