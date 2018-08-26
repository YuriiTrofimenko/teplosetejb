/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.model;

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

    public AccountAll() {
    }

    public AccountAll(AccountDetails accountDetails, AccountDogRestr accountDogRestr) {
        this.accountDetails = accountDetails;
        this.accountDogRestr = accountDogRestr;
    }
}
