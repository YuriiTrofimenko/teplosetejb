/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.model;

/**
 *
 * @author yurii
 */
public class AccountTitle {
    
    public Long code;
    public String fio;

    public AccountTitle() {
    }

    public AccountTitle(Long code, String fio) {
        this.code = code;
        this.fio = fio;
    }
}
