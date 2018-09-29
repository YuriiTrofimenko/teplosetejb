/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author yurii
 */
public class AccountPayments {
    
    //Дата оплаты
    public Date dateaction;
    //Сумма оплаты
    public BigDecimal summ;
    //
    public String procdate;
    //
    public String payerName;
    //
    public String paymentType;
    //
    public String service;

    public AccountPayments() {
    }

    public AccountPayments(
            Date dateaction
            , BigDecimal summ
            , Date procdate
            , String payerName
            , String paymentType
            , String service
    ) {
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("MM.yyyy");
        
        this.dateaction = dateaction;
        this.summ = summ;
        this.procdate = dateFormat.format(procdate);
        this.payerName = payerName;
        this.paymentType = paymentType;
        this.service = service;
    }

    
}
