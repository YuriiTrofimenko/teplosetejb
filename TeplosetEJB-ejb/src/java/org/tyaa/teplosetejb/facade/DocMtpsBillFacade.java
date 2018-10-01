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
import org.tyaa.teplosetejb.entity.DocMtpsBill;

/**
 *
 * @author yurii
 */
@Stateless
public class DocMtpsBillFacade extends AbstractFacade<DocMtpsBill> {
    
    private final static int SELECT_BILLS_LIMIT = 2;

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocMtpsBillFacade() {
        super(DocMtpsBill.class);
    }
    
    /* Добавленные методы */
    
    public List<DocMtpsBill> findLastListByAccountCode(long _accountcode) {
    
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<DocMtpsBill> billRoot =
                cq.from(DocMtpsBill.class);
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(
            cb.equal(billRoot.get("accountcode"), _accountcode));
        
        cq.select(billRoot)
            .where(predicateList.toArray(new Predicate[]{}))
                .orderBy(cb.desc(billRoot.get("code")));
        
        TypedQuery<DocMtpsBill> q = em.createQuery(cq);
        q.setMaxResults(SELECT_BILLS_LIMIT);
        
        return q.getResultList();
    }
}
