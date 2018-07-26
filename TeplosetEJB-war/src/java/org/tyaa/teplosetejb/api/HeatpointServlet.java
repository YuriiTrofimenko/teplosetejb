/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.api;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.tyaa.teplosetejb.facade.AccountFacade;
import org.tyaa.teplosetejb.facade.HSprBoilerFacade;
import org.tyaa.teplosetejb.facade.SprBoilerFacade;
import org.tyaa.teplosetejb.facade.SprBoilerhouseFacade;
import org.tyaa.teplosetejb.facade.SprHeatpointFacade;
import org.tyaa.teplosetejb.facade.SprTpsBoilerFacade;
import org.tyaa.teplosetejb.model.AccountTitle;
import org.tyaa.teplosetejb.model.Result;

/**
 *
 * @author yurii
 */
@WebServlet(name = "BoilerServlet", urlPatterns = {"/heatpoints"})
public class HeatpointServlet extends HttpServlet {
    
    @EJB
    private SprHeatpointFacade mSprHeatpointFacade;
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
                    
                        /*int from = Integer.parseInt(request.getParameter("from"));
                        int to = Integer.parseInt(request.getParameter("to"));
                        
                        Result result =
                            new Result(
                                mAccountFacade.findRange(new int[]{from, to}).stream().map((account) -> {
                                    return new AccountTitle(account.getCode(), account.getFio());
                                }).collect(Collectors.toList())
                            );
                        out.println(gson.toJson(result));*/
                        break;
                    }
                    
                    case "fetch-by-id":{
                    
                        /*Long id = Long.parseLong(request.getParameter("id"));
                        out.println(gson.toJson(mAccountFacade.find(id)));*/
                        break;
                    }
                }
            } else {
            
                out.println(gson.toJson(mSprHeatpointFacade.findRange(new int[]{100, 150})));
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
