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
public class AccountSubsidy {
    
    public String dateFrom;
    public String dateTo;
    public BigDecimal sum;

    public AccountSubsidy() {
    }

    public AccountSubsidy(Date dateFrom, Date dateTo, BigDecimal sum) {
        
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("dd.MM.yyyy");
        
        this.dateFrom = dateFormat.format(dateFrom);
        this.dateTo = dateFormat.format(dateTo);
        this.sum = sum;
    }
}
