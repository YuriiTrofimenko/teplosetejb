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
import org.tyaa.teplosetejb.entity.AccountDogRestr;

/**
 *
 * @author yurii
 */
@Stateless
public class AccountDogRestrFacade extends AbstractFacade<AccountDogRestr> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountDogRestrFacade() {
        super(AccountDogRestr.class);
    }
    
    /* Добавленные методы */
    
    public List<AccountDogRestr> findByAccountCode(long _accountcode) {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<AccountDogRestr> accountDogRestrRoot =
                cq.from(AccountDogRestr.class);
        
        List<Predicate> predicateList = new ArrayList<>();
        System.out.println("id: " + _accountcode);//217788L
        predicateList.add(
            cb.equal(accountDogRestrRoot.get("accountcode"), _accountcode)
        );
        
        /*predicateList.add(
                cb.or(
                    cb.isNull(pipeTopologyRoot.<Date>get("enddate"))
                    , cb.greaterThanOrEqualTo(pipeTopologyRoot.<Date>get("enddate"), new Date())
                )
        );*/
        
        cq.select(accountDogRestrRoot)
                .where(predicateList.toArray(new Predicate[]{}));
        TypedQuery<AccountDogRestr> q = em.createQuery(cq);
        
        return q.getResultList();
    }
}
