/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.model;

import java.util.List;
import org.tyaa.teplosetejb.entity.AccountDogRestr;

/**
 *
 * @author yurii
 */
public class AccountAll {
    
    //
    public AccountDetails accountDetails;
    //
    public AccountDogRestr accountDogRestr;
    //
    public List<AccountPayments> accountPayments;
    //
    public List<AccountBill> accountBills;
    //
    public List<AccountRevise> accountRevises;
    //
    public List<AccountSubsidy> accountSubsidies;

    public AccountAll() {
    }

    public AccountAll(
            AccountDetails accountDetails
            , AccountDogRestr accountDogRestr
            , List<AccountPayments> accountPayments
            , List<AccountBill> accountBills
            , List<AccountRevise> accountRevises
            , List<AccountSubsidy> accountSubsidies
    ) {
        this.accountDetails = accountDetails;
        this.accountDogRestr = accountDogRestr;
        this.accountPayments = accountPayments;
        this.accountBills = accountBills;
        this.accountRevises = accountRevises;
        this.accountSubsidies = accountSubsidies;
    }
}
