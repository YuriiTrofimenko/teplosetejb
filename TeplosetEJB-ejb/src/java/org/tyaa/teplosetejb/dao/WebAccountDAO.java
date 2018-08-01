/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.dao;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.tyaa.teplosetejb.entity.Account;
import org.tyaa.teplosetejb.facade.AbstractFacade;

/**
 *
 * @author yurii
 */
@Stateless
public class WebAccountDAO {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public WebAccountDAO() {
    }
    
    /*
* Run Proc with scalar input and cursor output
     */
    @SuppressWarnings("unchecked")
    public List testProcCursor() {
        /*final StoredProcedureCall call = new StoredProcedureCall();
        call.setProcedureName("LOGIN");
        call.addUnamedArgument("USER_NAME"); // .addNamedArgument doesn't work
        call.addUnamedArgument("USER_PASSWORD");

        final DataReadQuery query = new DataReadQuery();
        query.setCall(call);
        query.addArgument("USER_NAME");
        query.addArgument("USER_PASSWORD");

        final List<String> queryArgs = new ArrayList<String>();
        queryArgs.add("onlinetester");
        queryArgs.add("test");

        final List outList = (List) session.executeQuery(query, queryArgs);
        final ListIterator<DatabaseRecord> listIterator = ((List<DatabaseRecord>) outList).listIterator();
        while (listIterator.hasNext()) {
            final DatabaseRecord databaseRecord = listIterator.next();
            System.out.println("Value -->" + databaseRecord.getValues());
        }*/

        StoredProcedureQuery query = em
                .createStoredProcedureQuery("WEB_ACCOUNT")
                .registerStoredProcedureParameter(
                        "PROCDATE", Date.class, ParameterMode.IN)
                .registerStoredProcedureParameter(
                        "MODE", Integer.class, ParameterMode.IN)
                .setParameter("PROCDATE", new Date())
                .setParameter("MODE", 0)
                .registerStoredProcedureParameter(
                        "CODE", Integer.class, ParameterMode.OUT)
                .registerStoredProcedureParameter(
                        "CODE", Integer.class, ParameterMode.OUT);
        //query.setFirstResult(0);
        //query.setMaxResults(20);
        query.execute();
        
        List results = query.getResultList();
        return results;
    }
}
