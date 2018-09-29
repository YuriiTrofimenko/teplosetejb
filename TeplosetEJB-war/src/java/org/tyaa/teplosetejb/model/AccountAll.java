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

    public AccountAll() {
    }

    public AccountAll(
            AccountDetails accountDetails
            , AccountDogRestr accountDogRestr
            , List<AccountPayments> accountPayments
    ) {
        this.accountDetails = accountDetails;
        this.accountDogRestr = accountDogRestr;
        this.accountPayments = accountPayments;
    }
}
