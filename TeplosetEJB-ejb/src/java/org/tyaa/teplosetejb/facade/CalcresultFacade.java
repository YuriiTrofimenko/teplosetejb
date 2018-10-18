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
import org.tyaa.teplosetejb.entity.Calcresult;

/**
 *
 * @author yurii
 */
@Stateless
public class CalcresultFacade extends AbstractFacade<Calcresult> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalcresultFacade() {
        super(Calcresult.class);
    }
    
    /* Добавленные методы */
    
    public List<Calcresult> findByAccountCode(long _accountcode) {
    
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<Calcresult> calcresultRoot =
                cq.from(Calcresult.class);
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(
            cb.equal(calcresultRoot.get("accountcode"), _accountcode));
        predicateList.add(
            calcresultRoot.get("ps").in(new Object[]{"40"}));
        cq.select(calcresultRoot)
                .where(predicateList.toArray(new Predicate[]{}));
        TypedQuery<Calcresult> q = em.createQuery(cq);
        
        List<Calcresult> calcresults = q.getResultList();
        /*System.out.println("Result: ");
        calcresults.forEach((t) -> {
            System.out.println(t.getSumm());
        });*/
        
        return calcresults;
    }
}
