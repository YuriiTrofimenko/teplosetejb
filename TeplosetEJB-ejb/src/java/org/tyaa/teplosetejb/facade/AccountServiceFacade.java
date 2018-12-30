/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.Coalesce;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
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
        
        predicateList.add(
                cb.or(
                    cb.isNull(accountServiceRoot.<Date>get("enddate"))
                    , cb.greaterThanOrEqualTo(accountServiceRoot.<Date>get("enddate"), new Date())
                )
        );
        
        cq.select(accountServiceRoot).where(predicateList.toArray(new Predicate[]{}));
        TypedQuery<AccountService> q = em.createQuery(cq);
        
        return q.getResultList().get(0);
    }
    
    public AccountService findByAccountCode(Long _accountCode, Integer _meterType) {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<AccountService> accountServiceRoot = cq.from(AccountService.class);
        
        List<Predicate> predicateList = new ArrayList<>();
        
        predicateList.add(
                cb.equal(accountServiceRoot.get("accountcode"), _accountCode)
        );
        predicateList.add(
                cb.equal(accountServiceRoot.get("service"), _meterType)
        );
        /*predicateList.add(
                cb.or(
                    cb.isNull(accountServiceRoot.<Date>get("enddate"))
                    , cb.greaterThanOrEqualTo(accountServiceRoot.<Date>get("enddate"), new Date())
                )
        );*/
        
        cq.select(accountServiceRoot).where(predicateList.toArray(new Predicate[]{}));
        TypedQuery<AccountService> q = em.createQuery(cq);
        
        List<AccountService> accountServices =
                q.getResultList();
        
        return (accountServices != null && accountServices.size() > 0)
                ? q.getResultList().get(0)
                : null;
    }
    
    public List<AccountService> findByAccountCodeTest(Long _accountCode) {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<AccountService> accountServiceRoot = cq.from(AccountService.class);
        
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(cb.equal(accountServiceRoot.get("accountcode"), _accountCode));
        //
        
        predicateList.add(
                cb.or(
                    cb.isNull(accountServiceRoot.<Date>get("enddate"))
                    , cb.greaterThanOrEqualTo(accountServiceRoot.<Date>get("enddate"), new Date())
                )
        );
        
        
        
        //cb.greaterThanOrEqualTo(cb.coalesce(accountServiceRoot.<Date>get("enddate"), new Date()), cb.currentDate());
        
        //predicateList.add(cb.greaterThanOrEqualTo(cb.coalesce(accountServiceRoot.<Date>get("enddate"), new Date()).getCompoundSelectionItems(), cb.currentDate()));
        
        /*Coalesce<Date> coalesce = cb.coalesce();
        coalesce.value(accountServiceRoot.<Date>get("enddate"));
        coalesce.value(cb.currentDate());
        cq.select(cb.construct(AccountService.class, accountServiceRoot.<Date>get("code")));*/
        
        cq.select(accountServiceRoot);
        
        cq.where(predicateList.toArray(new Predicate[]{}));
        //cq.orderBy(cb.desc(accountServiceRoot.<Date>get("enddate")));
        
        /*List<Date> accountServiceDates =
                em.createQuery(cq).getResultList();
        
        Collections.reverse(accountServiceDates.subList(0, accountServiceDates.size()));*/
        
        TypedQuery<AccountService> q = em.createQuery(cq);
        
        return q.getResultList();
    }
}
