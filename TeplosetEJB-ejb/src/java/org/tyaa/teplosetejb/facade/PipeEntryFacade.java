/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.facade;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.tyaa.teplosetejb.entity.Pipe;
import org.tyaa.teplosetejb.entity.PipeEntry;
import org.tyaa.teplosetejb.entity.PipeTopology;

/**
 *
 * @author yurii
 */
@Stateless
public class PipeEntryFacade extends AbstractFacade<PipeEntry> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PipeEntryFacade() {
        super(PipeEntry.class);
    }
    
    /* Добавленные методы */
    
    public PipeEntry findByOwnerPipecode(List<Pipe> _ownerPipes, Integer _level) {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<PipeEntry> pipeEntryRoot = cq.from(PipeEntry.class);
        
        List<Predicate> predicateList = new ArrayList<>();
        //predicateList.add(cb.equal(pipeEntryRoot.get("pipecode"), _ownerPipecode));
        predicateList.add(pipeEntryRoot.get("pipecode").in(_ownerPipes));
        predicateList.add(cb.equal(pipeEntryRoot.get("pipeLevel"), _level));
        
        cq.select(pipeEntryRoot).where(predicateList.toArray(new Predicate[]{}));
        cq.orderBy(cb.asc(pipeEntryRoot.get("pipeObject")));
        TypedQuery<PipeEntry> q = em.createQuery(cq);
                
        return q.getResultList().get(0);
    }
}
