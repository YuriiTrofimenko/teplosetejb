/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.MathContext;
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

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import org.tyaa.teplosetejb.entity.AccountDogRestr;
import org.tyaa.teplosetejb.entity.Calcresult;
import org.tyaa.teplosetejb.entity.DocMtpsBill;
import org.tyaa.teplosetejb.entity.SaldoDetail;
import org.tyaa.teplosetejb.entity.SprBillType;
import org.tyaa.teplosetejb.facade.AccountDogRestrFacade;
import org.tyaa.teplosetejb.facade.AccountFamilyFacade;
import org.tyaa.teplosetejb.facade.CalcresultFacade;
import org.tyaa.teplosetejb.facade.DocMtpsBillFacade;
import org.tyaa.teplosetejb.facade.ProcdateFacade;
import org.tyaa.teplosetejb.facade.SaldoDetailFacade;
import org.tyaa.teplosetejb.facade.SprBillTypeFacade;
import org.tyaa.teplosetejb.facade.SprPayerFacade;
import org.tyaa.teplosetejb.facade.SprPaymenttypeFacade;
import org.tyaa.teplosetejb.facade.SprServiceFacade;
import org.tyaa.teplosetejb.model.AccountAll;
import org.tyaa.teplosetejb.model.AccountBill;
import org.tyaa.teplosetejb.model.AccountPayments;
import org.tyaa.teplosetejb.model.AccountRevise;

/**
 *
 * @author yurii
 */
@WebServlet(name = "AccountServlet", urlPatterns = {"/account"})
public class AccountServlet extends HttpServlet {

    //General account info
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
    private AccountFamilyFacade mAccountFamilyFacade;
    
    //Dogovor info
    @EJB
    private AccountDogRestrFacade mAccountDogRestrFacade;
    //Payments
    @EJB
    private CalcresultFacade mCalcresultFacade;
    //Procedure date
    @EJB
    private ProcdateFacade mProcdateFacade;
    //Bank
    @EJB
    private SprPayerFacade mSprPayerFacade;
    //Payment type
    @EJB
    private SprPaymenttypeFacade mSprPaymenttypeFacade;
    //Service
    @EJB
    private SprServiceFacade mSprServiceFacade;
    //Bill
    @EJB
    private DocMtpsBillFacade mMtpsBillFacade;
    //Bill type
    @EJB
    private SprBillTypeFacade mBillTypeFacade;
    //Revise data (month saldo)
    @EJB
    private SaldoDetailFacade mSaldoDetailFacade;
    
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
        //Gson gson = new Gson();
        
        Gson gson =
            new GsonBuilder()
                .setDateFormat("dd-MM-yyyy").create();
        
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
                        
                        String surname = "";
                        //
                        if(request.getParameterMap().containsKey("surname")){
                            
                            surname =
                                URLDecoder.decode(
                                    request.getParameter("surname"), "UTF-8"
                                );
                        }
                        
                        if(account != null
                            && account.getF().toUpperCase().equals(surname.toUpperCase())){
                        
                            //Получаем из БД сущность службы для аккаунта
                            //по его коду
                            AccountDetails accountDetails =
                                    getAccountDetails(account);

                            out.println(gson.toJson(accountDetails));
                        } else {
                        
                            out.println(gson.toJson("not_found"));
                        }
                        
                        break;
                    }
                    
                    case "fetch-all-by-id":{
                    
                        try{
                        //System.out.println(request.getParameter("id"));
                            Long id = Long.parseLong(request.getParameter("id"));

                            //
                            Account account = mAccountFacade.find(id);

                            String surname = "";
                            //
                            if(request.getParameterMap().containsKey("surname")){

                                surname =
                                    URLDecoder.decode(
                                        request.getParameter("surname"), "UTF-8"
                                    );
                            }

                            if(account != null
                                && account.getF()
                                    .toUpperCase()
                                    .equals(surname.toUpperCase())){
                                
                                AccountDetails accountDetails =
                                    getAccountDetails(account);
                                
                                AccountDogRestr accountDogRestr =
                                        getAccountDogRestr(account);
                                
                                List<AccountPayments> accountPayments =
                                        getAccountPayments(account);
                                
                                List<AccountBill> accountBills =
                                        getAccountBills(account);
                                
                                List<AccountRevise> accountRevises =
                                        getAccountRevise(account);
                                
                                AccountAll accountAll =
                                        new AccountAll(
                                                accountDetails
                                                , accountDogRestr
                                                , accountPayments
                                                , accountBills
                                                , accountRevises
                                        );
                                
                                out.println(gson.toJson(accountAll));
                            } else {

                                out.println(gson.toJson("not_found"));
                            }
                        } catch(Exception ex){
                        
                            out.println(gson.toJson(ex.getMessage()));
                        }
                        break;
                    }
                    
                    case "fetch-by-id-test":{
                    
                        Long id = Long.parseLong(request.getParameter("id"));
                        
                        //
                        Account account = mAccountFacade.find(id);
                        
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
    
    //Получение суб-модели основных данных аккаунта
    private AccountDetails getAccountDetails(Account _account){
    
        Long id = _account.getCode();
        
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
        
        Integer tenantCount =
            mAccountFamilyFacade.tenantsCountByAccountCode(_account.getCode());

        AccountDetails accountDetails =
            new AccountDetails(
                    id
                    , _account.getFio()
                    , _account.getHouse().getStreet().getKind()
                        + " "
                        + _account.getHouse().getStreet().getName()
                        + " дом "
                        + _account.getHouse().getNumber()
                        + " кв. "
                        + _account.getFlat()
                    , _account.getHouse().getArea().getName()
                    , _account.getPhone()
                    , _account.getHouse().getArea().getAddress()
                        + ", "
                        + _account.getHouse().getArea().getRemark()
                        + " "
                        + _account.getHouse().getArea().getPhone()
                        + ", "
                        + _account.getHouse().getArea().getPhoneTi()
                    , (sprHeatpoint != null)
                            ? (sprHeatpoint.getShifr()
                                + " "
                                + sprHeatpoint.getName())
                            : "-"
                    , (sprBoiler != null)
                            ? (sprBoiler.getShifr()
                                + " "
                                + sprBoiler.getName())
                            : "-"
                    , tenantCount
            );
        return accountDetails;
    }
    //Получение суб-модели данных о договоре аккаунта
    private AccountDogRestr getAccountDogRestr(Account _account){
    
        List<AccountDogRestr> accountDogRestrs =
            mAccountDogRestrFacade.findByAccountCode(_account.getCode());
        
        AccountDogRestr accountDogRestr =
            (accountDogRestrs != null && accountDogRestrs.size() > 0)
            ? accountDogRestrs.stream().sorted((dog1, dog2) -> {
                return dog2.getEndDate().compareTo(dog1.getEndDate());
            }).collect(Collectors.toList()).get(0)
            : null;
        
        return accountDogRestr;
    }
    
    //Получение суб-модели данных о платежах аккаунта
    private List<AccountPayments> getAccountPayments(Account _account){
    
        List<Calcresult> calcresults =
            mCalcresultFacade.findByAccountCode(_account.getCode());
        
        /*System.out.println("Result: ");
        calcresults.forEach((t) -> {
            System.out.println(t.getSumm());
        });*/
        
        List<AccountPayments> accountPayments =
            calcresults.stream()
                .map((c) -> {
                            Date procDate =
                                    mProcdateFacade.find(c.getProcdate())
                                    .getProcdate();
                            
                            String payerName =
                                mSprPayerFacade.find(c.getCode1()).getName();
                            
                            String paymentType =
                                mSprPaymenttypeFacade.find(c.getCode2()).getName();
                            
                            String service = "";
                            if (c.getService() != null) {
                                service =
                                    mSprServiceFacade.find(c.getService()).getName();
                            }
                            
                            return new AccountPayments(
                                    c.getDateaction()
                                    , c.getSumm()
                                    , procDate
                                    , payerName
                                    , paymentType
                                    , service
                            );
                            /*return new AccountPayments(
                                    new Date()
                                    , new BigDecimal(12)
                            );*/
                        })
                .collect(Collectors.toList());
        
        accountPayments =
            (accountPayments != null && accountPayments.size() > 0)
            ? accountPayments.stream()
                .sorted((p1, p2) -> {
                    return p2.dateaction.compareTo(p1.dateaction);
                })
                .limit(12)
                .collect(Collectors.toList())
            : null;
        
        return accountPayments;
    }
    
    //Получение суб-модели данных аккаунта для заполнения квитанций
    private List<AccountBill> getAccountBills(Account _account){
        
        List<AccountBill> accountBillsResult = new ArrayList<>();
    
        List<DocMtpsBill> accountBills =
            mMtpsBillFacade.findLastListByAccountCode(_account.getCode());
        
        /*System.out.println("Result: ");
        accountBills.forEach((b) -> {
            System.out.println(b.getBillType());
        });*/
        
        if (accountBills != null && accountBills.size() > 0) {
            
            Integer firstElementCode = 0;
            List<DocMtpsBill> accountBillsSelected = new ArrayList<>();
            for (DocMtpsBill accountBill : accountBills) {
                if (!accountBill.getBillType().equals(firstElementCode)) {
                    accountBillsSelected.add(accountBill);
                    firstElementCode = accountBill.getCode();
                }
            }
            
            /*System.out.println("Result: ");
            accountBillsSelected.forEach((b) -> {
                System.out.println(b.getBillType());
            });*/

            accountBillsResult =
                accountBillsSelected.stream()
                    .map((b) -> {
                        
                        String type = "";
                        String titleLong = "";
                        String titleShort = "";
                        BigDecimal beginMeter = b.getBeginMeterValue();
                        BigDecimal volume = b.getVolume();
                        BigDecimal endMeter = null;
                        if (beginMeter != null) {
                            endMeter = beginMeter.add(volume);
                        }
                        String tariff = b.getTariffTxt();
                        BigDecimal subsidyAmount = b.getSubsSumm();
                        BigDecimal amountToBePaid = b.getKOplateSumm();
                        
                        BigDecimal heatedArea = b.getS2();

                        Integer typeId = b.getBillType();
                        if (typeId != null) {
                            SprBillType billType =
                                mBillTypeFacade.find(b.getBillType());

                            type = billType.getRemark();
                            //title = billType.getName() + " " + billType.getShifr();
                            titleLong = billType.getName();
                            titleShort = billType.getShifr();
                        }

                        return new AccountBill(
                                type
                                , typeId
                                , titleLong
                                , titleShort
                                , beginMeter
                                , volume
                                , endMeter
                                , tariff
                                , subsidyAmount
                                , amountToBePaid
                                , heatedArea
                        );
                    })
                .collect(Collectors.toList());
            
                if (accountBillsResult != null && accountBillsResult.size() > 1) {
                
                    if (accountBillsResult.get(0).typeId.equals(accountBillsResult.get(1).typeId)) {
                        
                        accountBillsResult.remove(1);
                    }
                }
        }
        
        return accountBillsResult;
    }
    
    //Получение суб-модели данных сверки аккаунта по месяцам
    private List<AccountRevise> getAccountRevise(Account _account){
        
        List<AccountRevise> accountRevisesResult = new ArrayList<>();
    
        List<SaldoDetail> accountSaldoDetails =
            mSaldoDetailFacade.findByAccountCode(_account.getCode());
        
        //System.out.println("Result: ");
        /*accountSaldoDetails.forEach((s) -> {
            System.out.println(s.getGroupservice());
        });*/
        
        if (accountSaldoDetails != null && accountSaldoDetails.size() > 0) {
            
            try{
                accountRevisesResult =
                    accountSaldoDetails.stream()
                        .map((s) -> {

                            Date monthYearDate =
                                mProcdateFacade.find(s.getProcdate())
                                    .getProcdate();
                            BigDecimal invoice = s.getNachSumm();
                            BigDecimal payment = s.getPaySumm();

                            //Heat
                            if (s.getGroupservice().equals(2)) {

                                return new AccountRevise(
                                    monthYearDate
                                    , s.getSaldoin()
                                    , s.getSaldoout()
                                    , null
                                    , null
                                    , invoice
                                    , payment
                                );
                            //Water
                            } else if (s.getGroupservice().equals(1)) {

                                return new AccountRevise(
                                    monthYearDate
                                    , s.getSaldoin()
                                    , s.getSaldoout()
                                    , invoice
                                    , payment
                                    , null
                                    , null
                                );
                            } else {

                                return new AccountRevise(
                                    monthYearDate
                                    , s.getSaldoin()
                                    , s.getSaldoout()
                                    , null
                                    , null
                                    , null
                                    , null
                                );
                            }
                        })
                    .collect(
                        Collectors.collectingAndThen(    
                            Collectors.toMap(
                                AccountRevise::getMonthYear, // use month as key
                                AccountRevise::new,      // use copy constructor => don't mutate original revises
                                AccountRevise::merge
                            )
                            ,(m) -> {
                                return new ArrayList<>(m.values());
                            }
                        )
                    )
                    .stream()
                    .sorted((o1, o2) -> {
                        return o2.getMonthYearReversed().compareTo(o1.getMonthYearReversed());
                    })
                    .limit(12)
                    .collect(Collectors.toList());
            } catch(Exception ex){
            
                ex.printStackTrace(new PrintStream(System.out));
            }
        }
        
        return accountRevisesResult;
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
