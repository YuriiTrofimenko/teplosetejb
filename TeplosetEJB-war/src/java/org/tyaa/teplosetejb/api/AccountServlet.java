/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.api;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.tyaa.teplosetejb.dao.WebAccountDAO;
import org.tyaa.teplosetejb.entity.Account;
import org.tyaa.teplosetejb.entity.AccountService;
import org.tyaa.teplosetejb.entity.Pipe;
import org.tyaa.teplosetejb.entity.PipeEntry;
import org.tyaa.teplosetejb.entity.PipeTopology;
import org.tyaa.teplosetejb.entity.SprBoiler;
import org.tyaa.teplosetejb.entity.SprHeatpoint;
import org.tyaa.teplosetejb.facade.AccountFacade;
import org.tyaa.teplosetejb.facade.AccountServiceFacade;
import org.tyaa.teplosetejb.facade.PipeEntryFacade;
import org.tyaa.teplosetejb.facade.PipeFacade;
import org.tyaa.teplosetejb.facade.PipeTopologyFacade;
import org.tyaa.teplosetejb.facade.SprBoilerFacade;
import org.tyaa.teplosetejb.facade.SprHeatpointFacade;
import org.tyaa.teplosetejb.model.AccountDetails;
import org.tyaa.teplosetejb.model.AccountTitle;
import org.tyaa.teplosetejb.model.Result;

/**
 *
 * @author yurii
 */
@WebServlet(name = "AccountServlet", urlPatterns = {"/account"})
public class AccountServlet extends HttpServlet {

    @EJB
    private AccountFacade mAccountFacade;
    @EJB
    private AccountServiceFacade mAccountServiceFacade;
    @EJB
    private PipeFacade mPipeFacade;
    @EJB
    private PipeTopologyFacade mPipeTopologyFacade;
    @EJB
    private PipeEntryFacade mPipeEntryFacade;
    @EJB
    private SprHeatpointFacade mSprHeatpointFacade;
    @EJB
    private SprBoilerFacade mSprBoilerFacade;
    
    @EJB
    private WebAccountDAO mWebAccountDAO;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        Gson gson = new Gson();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            if (request.getParameterMap().containsKey("action")) {
                
                String action = request.getParameter("action");
                
                switch(action){
                
                    case "fetch-range":{
                    
                        int from = Integer.parseInt(request.getParameter("from"));
                        int to = Integer.parseInt(request.getParameter("to"));
                        
                        Result result =
                            new Result(
                                mAccountFacade.findRange(new int[]{from, to}).stream().map((account) -> {
                                    return new AccountTitle(account.getCode(), account.getFio());
                                }).collect(Collectors.toList())
                            );
                        out.println(gson.toJson(result));
                        break;
                    }
                    
                    case "fetch-range-proc":{
                    
                        //int from = Integer.parseInt(request.getParameter("from"));
                        //int to = Integer.parseInt(request.getParameter("to"));
                        
                        Result result =
                            new Result(
                                mWebAccountDAO.testProcCursor()
                            );
                        out.println(gson.toJson(result));
                        break;
                    }
                    
                    //Старая версия выдавала сущность "Аккаунт"
                    //с данными всех полей, но
                    //без дополнительных данных
                    /*case "fetch-by-id":{
                    
                        Long id = Long.parseLong(request.getParameter("id"));
                        out.println(gson.toJson(mAccountFacade.find(id)));
                        break;
                    }*/
                    
                    case "fetch-by-id":{
                    
                        Long id = Long.parseLong(request.getParameter("id"));
                        
                        //
                        Account account = mAccountFacade.find(id);
                        
                        //Получаем из БД сущность службы для аккаунта
                        //по его коду
                        AccountService accountService =
                                mAccountServiceFacade.findByAccountCode(id);
                        
                        Integer accountPipecode = accountService.getAccountPipecode();
                        Pipe pipe = mPipeFacade.find(accountPipecode);
                        PipeTopology pipeTopology = mPipeTopologyFacade.findByPipecode(pipe);
                        
                        //List_Heatpointhousename
                        Pipe ownerPipecode = pipeTopology.getOwnerPipecode();
                        List<PipeTopology> pipeTopologiesByOwner = mPipeTopologyFacade.findByPipecode2(ownerPipecode);
                        List<Pipe> pipesByOwners =
                                pipeTopologiesByOwner.stream().map((pt) -> {
                                    return mPipeFacade.find(pt.getOwnerPipecode().getCode());
                                })
                                .collect(Collectors.toList());
                        
                        PipeEntry pipeEntry = mPipeEntryFacade.findByOwnerPipecode(pipesByOwners, 30);
                        Long pipeObject = pipeEntry.getPipeObject();
                        SprHeatpoint sprHeatpoint = mSprHeatpointFacade.find(pipeObject.intValue());
                        
                        //List_Boilerhousename
                        Pipe ownerPipecode2 = pipeEntry.getPipecode();
                        List<PipeTopology> pipeTopologiesByOwner2 =
                                mPipeTopologyFacade.findByPipecode2(ownerPipecode2);
                        List<Pipe> pipesByOwners2 =
                                pipeTopologiesByOwner2.stream().map((pt) -> {
                                    return mPipeFacade.find(pt.getOwnerPipecode().getCode());
                                })
                                .collect(Collectors.toList());
                        
                        PipeEntry pipeEntry2 = mPipeEntryFacade.findByOwnerPipecode(pipesByOwners2, 40);
                        Integer pipeObject2 = Integer.parseInt(String.valueOf(pipeEntry2.getPipeObject()));
                        SprBoiler sprBoiler = mSprBoilerFacade.find(pipeObject2);
                        
                        AccountDetails accountDetails =
                                new AccountDetails(
                                        id
                                        , account.getFio()
                                        , "Адрес: "
                                            + account.getHouse().getStreet().getKind()
                                            + " "
                                            + account.getHouse().getStreet().getName()
                                            + " дом "
                                            + account.getHouse().getNumber()
                                            + " кв. "
                                            + account.getFlat()
                                        , account.getHouse().getArea().getName()
                                        , account.getPhone()
                                        , "Адрес и телефон абонентного участка: "
                                            + account.getHouse().getArea().getAddress()
                                            + ", "
                                            + account.getHouse().getArea().getRemark()
                                            + " "
                                            + account.getHouse().getArea().getPhone()
                                            + ", "
                                            + account.getHouse().getArea().getPhoneTi()
                                        , (sprHeatpoint != null)
                                                ? (sprHeatpoint.getShifr()
                                                    + " "
                                                    + sprHeatpoint.getName())
                                                : "-"
                                        , (sprBoiler != null)
                                                ? (sprBoiler.getShifr()
                                                    + " "
                                                    + sprBoiler.getName())
                                                : "-");
                        /*AccountDetails accountDetails =
                                new AccountDetails(
                                        id
                                        , account.getFio()
                                        , "Адрес: "
                                            + account.getHouse().getStreet().getKind()
                                            + " "
                                            + account.getHouse().getStreet().getName()
                                            + " дом "
                                            + account.getHouse().getNumber()
                                            + " кв. "
                                            + account.getFlat()
                                        , "Район: "
                                            + account.getHouse().getArea().getName()
                                        , "Адрес и телефон абонентного участка: "
                                            + account.getHouse().getArea().getAddress()
                                            + ", "
                                            + account.getHouse().getArea().getRemark()
                                            + " "
                                            + account.getHouse().getArea().getPhone()
                                            + ", "
                                            + account.getHouse().getArea().getPhoneTi()
                                        , String.valueOf(pipeObject)
                                        , "ToDo: boilername");*/
                        
                        out.println(gson.toJson(accountDetails));
                        break;
                    }
                    
                    case "fetch-by-id-test":{
                    
                        Long id = Long.parseLong(request.getParameter("id"));
                        
                        //
                        Account account = mAccountFacade.find(id);
                        
                        //Получаем из БД сущность службы для аккаунта
                        //по его коду
                        /*AccountService accountService =
                                mAccountServiceFacade.findByAccountCode(id);
                        Integer accountPipecode = accountService.getAccountPipecode();
                        Pipe pipe = mPipeFacade.find(accountPipecode);
                        PipeTopology pipeTopology = mPipeTopologyFacade.findByPipecode(pipe);
                        Pipe ownerPipecode = pipeTopology.getOwnerPipecode();
                        PipeEntry pipeEntry = mPipeEntryFacade.findByOwnerPipecode(ownerPipecode);
                        Long pipeObject = pipeEntry.getPipeObject();
                        SprHeatpoint sprHeatpoint = mSprHeatpointFacade.find(pipeObject.intValue());
                        
                        AccountDetails accountDetails =
                                new AccountDetails(
                                        id
                                        , account.getFio()
                                        , "Адрес: "
                                            + account.getHouse().getStreet().getKind()
                                            + " "
                                            + account.getHouse().getStreet().getName()
                                            + " дом "
                                            + account.getHouse().getNumber()
                                            + " кв. "
                                            + account.getFlat()
                                        , account.getHouse().getArea().getName()
                                        , account.getPhone()
                                        , "Адрес и телефон абонентного участка: "
                                            + account.getHouse().getArea().getAddress()
                                            + ", "
                                            + account.getHouse().getArea().getRemark()
                                            + " "
                                            + account.getHouse().getArea().getPhone()
                                            + ", "
                                            + account.getHouse().getArea().getPhoneTi()
                                        , (sprHeatpoint != null)
                                                ? (sprHeatpoint.getShifr()
                                                    + " "
                                                    + sprHeatpoint.getName())
                                                : "-"
                                        , "ToDo: boilername");*/
                        
                        List<AccountService> accountServices =
                                mAccountServiceFacade.findByAccountCodeTest(id);
                        
                        //Collections.reverse(accountServices.subList(0, accountServices.size()));
                        
                        out.println(gson.toJson(accountServices));
                        break;
                    }
                }
            } else {
            
                out.println(gson.toJson(mAccountFacade.findAll().get(100)));
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
