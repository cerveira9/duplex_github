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
import model.Aluguel;

/**
 *
 * @author fernandocerveira
 */
@Stateless
public class AluguelDao {
    @PersistenceContext
    EntityManager em;
    

    public List<Aluguel> getList() {
        Query q = em.createQuery("select a from Aluguel a");
        return q.getResultList();
    }

    public void gravar(Aluguel object, boolean edit) {
        if (edit == false) {
            em.persist(object);
        } else {
            em.merge(object);
        }
    }

    public void excluir(Aluguel object) {
        em.remove(em.merge(object));
    }
}