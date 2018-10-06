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
public class AccountRevise {
    
    //Дата (месяц и год)
    public String monthYear;
    //Сумма долга в начале месяца
    public BigDecimal beginningDebt;
    //Сумма долга в конце месяца
    public BigDecimal endDebt;
    //Сумма к оплате за горячую воду
    public BigDecimal waterInvoice;
    //Сумма, оплаченная за горячую воду
    public BigDecimal waterPayment;
    //Сумма к оплате за отопление
    public BigDecimal heatInvoice;
    //Сумма, оплаченная за отопление
    public BigDecimal heatPayment;

    public AccountRevise() {
    }
    
    public AccountRevise(AccountRevise sourceAccountRevise) {
        
        this.monthYear = sourceAccountRevise.monthYear;
        this.beginningDebt = sourceAccountRevise.beginningDebt;
        this.endDebt = sourceAccountRevise.endDebt;
        this.waterInvoice = sourceAccountRevise.waterInvoice;
        this.waterPayment = sourceAccountRevise.waterPayment;
        this.heatInvoice = sourceAccountRevise.heatInvoice;
        this.heatPayment = sourceAccountRevise.heatPayment;
    }

    public AccountRevise(Date monthYear, BigDecimal beginningDebt, BigDecimal endDebt, BigDecimal waterInvoice, BigDecimal waterPayment, BigDecimal heatInvoice, BigDecimal heatPayment) {
        
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("MM.yyyy");
        this.monthYear = dateFormat.format(monthYear);
        this.beginningDebt = beginningDebt;
        this.endDebt = endDebt;
        this.waterInvoice = waterInvoice;
        this.waterPayment = waterPayment;
        this.heatInvoice = heatInvoice;
        this.heatPayment = heatPayment;
    }

    //Правило слияния двух объектов этого типа
    public AccountRevise merge(AccountRevise anotherAccountRevise) {
        
        if (anotherAccountRevise.beginningDebt != null) {
            this.beginningDebt =
                this.beginningDebt.add(anotherAccountRevise.beginningDebt);
        }
        
        if (anotherAccountRevise.endDebt != null) {
            this.endDebt =
                this.endDebt.add(anotherAccountRevise.endDebt);
        }
        
        if (anotherAccountRevise.heatInvoice != null) {
            this.heatInvoice = anotherAccountRevise.heatInvoice;
        }
        if (anotherAccountRevise.heatPayment != null) {
            this.heatPayment = anotherAccountRevise.heatPayment;
        }
        if (anotherAccountRevise.waterInvoice != null) {
            this.waterInvoice = anotherAccountRevise.waterInvoice;
        }
        if (anotherAccountRevise.waterPayment != null) {
            this.waterPayment = anotherAccountRevise.waterPayment;
        }
        return this;
    }

    public String getMonthYear() {
        return monthYear;
    }
    
    public String getMonthYearReversed() {
        return monthYear.substring(2) + monthYear.substring(0, 2);
    }
}
