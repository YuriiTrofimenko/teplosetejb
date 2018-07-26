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
public class AccountDetails {
    
    //Номер счета
    public Long code;
    //ФИО
    public String fio;
    //Адрес
    public String address;
    //Район
    public String area;
    //Телефоны абонента
    public String phone;
    //Адрес и телефон абонентного участка
    public String areaAddress;
    //ЦТП
    public String heatpoint;
    //Котельная
    public String boiler;

    public AccountDetails() {
    }

    public AccountDetails(Long code, String fio, String address, String area, String phone, String areaAddress, String heatpoint, String boiler) {
        this.code = code;
        this.fio = fio;
        this.address = address;
        this.area = area;
        this.phone = phone;
        this.areaAddress = areaAddress;
        this.heatpoint = heatpoint;
        this.boiler = boiler;
    }
}
