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
import org.tyaa.teplosetejb.entity.MeterPipeValue;

/**
 *
 * @author yurii
 */
@Stateless
public class MeterPipeValueFacade extends AbstractFacade<MeterPipeValue> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;
    
    private int SELECT_VALUES_LIMIT = 1;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MeterPipeValueFacade() {
        super(MeterPipeValue.class);
    }
    
    //
    public List<MeterPipeValue> findByPipeCodeAndType(long _pipecode) {
    
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<MeterPipeValue> meterValueRoot =
                cq.from(MeterPipeValue.class);
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(
            cb.equal(meterValueRoot.get("pipecode"), _pipecode));
        //При построении запроса задаем обратную сортировку по первичному ключу,
        //чтобы получить самые новые результаты
        cq.select(meterValueRoot)
            .where(predicateList.toArray(new Predicate[]{}))
                .orderBy(cb.desc(meterValueRoot.get("code")));
        
        TypedQuery<MeterPipeValue> q = em.createQuery(cq);
        q.setMaxResults(SELECT_VALUES_LIMIT);
        
        return q.getResultList();
    }
    
}
