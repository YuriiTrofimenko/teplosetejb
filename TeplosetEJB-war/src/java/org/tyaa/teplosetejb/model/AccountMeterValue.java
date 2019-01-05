/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.model;

import java.math.BigDecimal;

/**
 *
 * @author yurii
 */
public class AccountMeterValue {
    
    //
    public String accountshifr;
    //
    public Integer procdate;
    //
    public String serviceShifr;
    //
    public String serviceName;
    //
    public Integer pipecode;
    //
    public Integer tt;
    //
    public BigDecimal endvalue;

    public AccountMeterValue() {
    }
    
    public AccountMeterValue(
            String accountshifr
            , String serviceShifr
            , String serviceName) {
        this.accountshifr = accountshifr;
        this.serviceShifr = serviceShifr;
        this.serviceName = serviceName;
    }

    public AccountMeterValue(
            String accountshifr
            , Integer procdate
            , String serviceShifr
            , String serviceName
            , Integer pipecode
            , Integer tt
            , BigDecimal endvalue) {
        this.accountshifr = accountshifr;
        this.procdate = procdate;
        this.serviceShifr = serviceShifr;
        this.serviceName = serviceName;
        this.pipecode = pipecode;
        this.tt = tt;
        this.endvalue = endvalue;
    }
}
