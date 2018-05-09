/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.tyaa.teplosetejb.entity.ErrDocDogovorService;

/**
 *
 * @author yurii
 */
@Stateless
public class ErrDocDogovorServiceFacade extends AbstractFacade<ErrDocDogovorService> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ErrDocDogovorServiceFacade() {
        super(ErrDocDogovorService.class);
    }
    
}
