/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.tyaa.teplosetejb.entity.SprExampl1Line;

/**
 *
 * @author yurii
 */
@Stateless
public class SprExampl1LineFacade extends AbstractFacade<SprExampl1Line> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SprExampl1LineFacade() {
        super(SprExampl1Line.class);
    }
    
}
