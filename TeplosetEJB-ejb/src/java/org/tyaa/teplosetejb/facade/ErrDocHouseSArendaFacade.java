/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.tyaa.teplosetejb.entity.ErrDocHouseSArenda;

/**
 *
 * @author yurii
 */
@Stateless
public class ErrDocHouseSArendaFacade extends AbstractFacade<ErrDocHouseSArenda> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ErrDocHouseSArendaFacade() {
        super(ErrDocHouseSArenda.class);
    }
    
}
