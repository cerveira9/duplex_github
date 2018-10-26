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
import model.Morador;

/**
 *
 * @author fernandocerveira
 */
@Stateless
public class MoradorDao {
    @PersistenceContext
    EntityManager em;
    

    public List<Morador> getList() {
        Query q = em.createQuery("select m from Morador m");
        return q.getResultList();
    }

    public void gravar(Morador object, boolean edit) {
        if (edit == false) {
            em.persist(object);
        } else {
            em.merge(object);
        }
    }

    public void excluir(Morador object) {
        em.remove(em.merge(object));
    }
}
