/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "ACCOUNT")
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE")
    private Long code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "ACCOUNTSHIFR")
    private String accountshifr;
    @Size(max = 32)
    @Column(name = "F")
    private String f;
    @Size(max = 32)
    @Column(name = "I")
    private String i;
    @Size(max = 32)
    @Column(name = "O")
    private String o;
    @Size(max = 0)
    @Column(name = "FIO")
    private String fio;
    @Size(max = 16)
    @Column(name = "INN")
    private String inn;
    @Column(name = "BEGINDATE")
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Column(name = "FLAT")
    private Integer flat;
    @Size(max = 16)
    @Column(name = "FLATLITERA")
    private String flatlitera;
    @Column(name = "ACCOUNTFLOOR")
    private Integer accountfloor;
    @Column(name = "ENTRANCE")
    private Integer entrance;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 48)
    @Column(name = "PHONE2")
    private String phone2;
    @Column(name = "DISINTEGRATE")
    private Integer disintegrate;
    @Column(name = "HIDDEN")
    private Integer hidden;
    @Column(name = "RECALCPROCDATE")
    private Integer recalcprocdate;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    @Column(name = "DOCCODE")
    private Integer doccode;
    @Column(name = "DOCPOS")
    private Integer docpos;
    @Column(name = "RVERSION")
    private BigInteger rversion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HEAT_PERCENT")
    private BigDecimal heatPercent;
    @Column(name = "WATER_PERCENT")
    private BigDecimal waterPercent;
    @Column(name = "WATER_HEATER")
    private Integer waterHeater;
    @Size(max = 64)
    @Column(name = "WARRANT")
    private String warrant;
    @Size(max = 64)
    @Column(name = "PRIVATIZATION")
    private String privatization;
    @Column(name = "CORNER_APARTMENT")
    private Integer cornerApartment;
    @Column(name = "OWNERSHIP")
    private Integer ownership;
    @JoinColumn(name = "HOUSE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private House house;

    public Account() {
    }

    public Account(Long code) {
        this.code = code;
    }

    public Account(Long code, String accountshifr) {
        this.code = code;
        this.accountshifr = accountshifr;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getAccountshifr() {
        return accountshifr;
    }

    public void setAccountshifr(String accountshifr) {
        this.accountshifr = accountshifr;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public String getFlatlitera() {
        return flatlitera;
    }

    public void setFlatlitera(String flatlitera) {
        this.flatlitera = flatlitera;
    }

    public Integer getAccountfloor() {
        return accountfloor;
    }

    public void setAccountfloor(Integer accountfloor) {
        this.accountfloor = accountfloor;
    }

    public Integer getEntrance() {
        return entrance;
    }

    public void setEntrance(Integer entrance) {
        this.entrance = entrance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Integer getDisintegrate() {
        return disintegrate;
    }

    public void setDisintegrate(Integer disintegrate) {
        this.disintegrate = disintegrate;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getRecalcprocdate() {
        return recalcprocdate;
    }

    public void setRecalcprocdate(Integer recalcprocdate) {
        this.recalcprocdate = recalcprocdate;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
    }

    public BigDecimal getHeatPercent() {
        return heatPercent;
    }

    public void setHeatPercent(BigDecimal heatPercent) {
        this.heatPercent = heatPercent;
    }

    public BigDecimal getWaterPercent() {
        return waterPercent;
    }

    public void setWaterPercent(BigDecimal waterPercent) {
        this.waterPercent = waterPercent;
    }

    public Integer getWaterHeater() {
        return waterHeater;
    }

    public void setWaterHeater(Integer waterHeater) {
        this.waterHeater = waterHeater;
    }

    public String getWarrant() {
        return warrant;
    }

    public void setWarrant(String warrant) {
        this.warrant = warrant;
    }

    public String getPrivatization() {
        return privatization;
    }

    public void setPrivatization(String privatization) {
        this.privatization = privatization;
    }

    public Integer getCornerApartment() {
        return cornerApartment;
    }

    public void setCornerApartment(Integer cornerApartment) {
        this.cornerApartment = cornerApartment;
    }

    public Integer getOwnership() {
        return ownership;
    }

    public void setOwnership(Integer ownership) {
        this.ownership = ownership;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Account[ code=" + code + " ]";
    }
    
}
