/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.tyaa.teplosetejb.entity.AccountService;

/**
 *
 * @author yurii
 */
@Stateless
public class AccountServiceFacade extends AbstractFacade<AccountService> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountServiceFacade() {
        super(AccountService.class);
    }
    
    /* Добавленные методы */
    
    public AccountService findByAccountCode(Long _accountCode) {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<AccountService> accountServiceRoot = cq.from(AccountService.class);
        
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(cb.equal(accountServiceRoot.get("accountcode"), _accountCode));
        //
        //Date date = cb.coalesce(accountServiceRoot.<Date>get("enddate"), new Date()).a;
        
        //cb.coalesce(accountServiceRoot.<Date>get("enddate"), new Date());
        //predicateList.add(cb.greaterThanOrEqualTo(accountServiceRoot.<Date>get("enddate"), cb.literal(new Date())));
        
        cq.select(accountServiceRoot).where(predicateList.toArray(new Predicate[]{}));
        TypedQuery<AccountService> q = em.createQuery(cq);
        
        return q.getResultList().get(0);
    }
}
