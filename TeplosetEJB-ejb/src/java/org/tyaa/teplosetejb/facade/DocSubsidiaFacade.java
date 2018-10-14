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
import org.tyaa.teplosetejb.entity.DocSubsidia;
import org.tyaa.teplosetejb.entity.SaldoDetail;

/**
 *
 * @author yurii
 */
@Stateless
public class DocSubsidiaFacade extends AbstractFacade<DocSubsidia> {
    
    private final int SELECT_SUBSIDY_LIMIT = 12;

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocSubsidiaFacade() {
        super(DocSubsidia.class);
    }
    
    /* Добавленные методы */
    
    public List<DocSubsidia> findByAccountCode(long _accountcode) {
    
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<DocSubsidia> subsidyRoot =
                cq.from(DocSubsidia.class);
        
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(
            cb.equal(subsidyRoot.get("accountcode"), _accountcode));
        
        cq.select(subsidyRoot)
            .where(predicateList.toArray(new Predicate[]{}))
                .orderBy(cb.desc(subsidyRoot.get("sDat2")));
        
        TypedQuery<DocSubsidia> q = em.createQuery(cq);
        q.setMaxResults(SELECT_SUBSIDY_LIMIT);
        
        return q.getResultList();
    }
}
