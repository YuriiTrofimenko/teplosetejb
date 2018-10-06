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
import org.tyaa.teplosetejb.entity.SaldoDetail;

/**
 *
 * @author yurii
 */
@Stateless
public class SaldoDetailFacade extends AbstractFacade<SaldoDetail> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SaldoDetailFacade() {
        super(SaldoDetail.class);
    }
    
    /* Добавленные методы */
    
    public List<SaldoDetail> findByAccountCode(long _accountcode) {
    
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<SaldoDetail> saldoRoot =
                cq.from(SaldoDetail.class);
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(
            cb.equal(saldoRoot.get("accountcode"), _accountcode));
        
        cq.select(saldoRoot)
            .where(predicateList.toArray(new Predicate[]{}))
                .orderBy(cb.desc(saldoRoot.get("code")));
        
        TypedQuery<SaldoDetail> q = em.createQuery(cq);
        //q.setMaxResults(SELECT_BILLS_LIMIT);
        
        return q.getResultList();
    }
}
