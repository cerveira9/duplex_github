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
import model.Saida;

/**
 *
 * @author fernandocerveira
 */
@Stateless
public class SaidaDao {
    @PersistenceContext
    EntityManager em;
    

    public List<Saida> getList() {
        Query q = em.createQuery("select s from Saida s");
        return q.getResultList();
    }

    public void gravar(Saida object, boolean edit) {
        if (edit == false) {
            em.persist(object);
        } else {
            em.merge(object);
        }
    }

    public void excluir(Saida object) {
        em.remove(em.merge(object));
    }
}