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
import org.tyaa.teplosetejb.entity.AccountFamily;

/**
 *
 * @author yurii
 */
@Stateless
public class AccountFamilyFacade extends AbstractFacade<AccountFamily> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFamilyFacade() {
        super(AccountFamily.class);
    }
    
    /* Добавленные методы */
    
    public Integer tenantsCountByAccountCode(long _accountcode) {
    
        Integer tenantsCount = 0;
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<AccountFamily> familyRoot =
                cq.from(AccountFamily.class);
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(
            cb.equal(familyRoot.get("accountcode"), _accountcode));
        
        cq.select(familyRoot)
            .where(predicateList.toArray(new Predicate[]{}));
        
        TypedQuery<AccountFamily> q = em.createQuery(cq);
        
        List<AccountFamily> accountTenants = q.getResultList();
        if (accountTenants != null && accountTenants.size() > 0) {
            tenantsCount = accountTenants.size();
        }
        
        return tenantsCount;
    }
}
