/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "H_ACCOUNT_FAMILY")
@NamedQueries({
    @NamedQuery(name = "HAccountFamily.findAll", query = "SELECT h FROM HAccountFamily h")})
public class HAccountFamily implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    @Column(name = "ACCOUNT_FAMILY_CODE")
    private Integer accountFamilyCode;
    private BigInteger accountcode;
    @Column(name = "DATE_FROM")
    @Temporal(TemporalType.DATE)
    private Date dateFrom;
    @Column(name = "DATE_TILL")
    @Temporal(TemporalType.DATE)
    private Date dateTill;
    @Size(max = 64)
    private String fio;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @Size(max = 16)
    private String inn;
    @Size(max = 16)
    @Column(name = "PHONE_1")
    private String phone1;
    @Size(max = 16)
    @Column(name = "PHONE_2")
    private String phone2;
    @Column(name = "IS_MASTER")
    private Integer isMaster;
    @Column(name = "FIRMS_CODE")
    private Integer firmsCode;
    @Size(max = 64)
    @Column(name = "ADD_DATA")
    private String addData;
    @Size(max = 128)
    private String remark;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    @Column(name = "RELATIVE_CODE")
    private Integer relativeCode;
    @Column(name = "SUBS_DATE_FROM")
    @Temporal(TemporalType.DATE)
    private Date subsDateFrom;
    @Column(name = "SUBS_DATE_TILL")
    @Temporal(TemporalType.DATE)
    private Date subsDateTill;
    @Column(name = "IS_RECIPIENT")
    private Integer isRecipient;
    @Size(max = 16)
    private String numb;

    public HAccountFamily() {
    }

    public HAccountFamily(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getHProcdate() {
        return hProcdate;
    }

    public void setHProcdate(Integer hProcdate) {
        this.hProcdate = hProcdate;
    }

    public Integer getSetRversion() {
        return setRversion;
    }

    public void setSetRversion(Integer setRversion) {
        this.setRversion = setRversion;
    }

    public Integer getAccountFamilyCode() {
        return accountFamilyCode;
    }

    public void setAccountFamilyCode(Integer accountFamilyCode) {
        this.accountFamilyCode = accountFamilyCode;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTill() {
        return dateTill;
    }

    public void setDateTill(Date dateTill) {
        this.dateTill = dateTill;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Integer getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
    }

    public Integer getFirmsCode() {
        return firmsCode;
    }

    public void setFirmsCode(Integer firmsCode) {
        this.firmsCode = firmsCode;
    }

    public String getAddData() {
        return addData;
    }

    public void setAddData(String addData) {
        this.addData = addData;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getRelativeCode() {
        return relativeCode;
    }

    public void setRelativeCode(Integer relativeCode) {
        this.relativeCode = relativeCode;
    }

    public Date getSubsDateFrom() {
        return subsDateFrom;
    }

    public void setSubsDateFrom(Date subsDateFrom) {
        this.subsDateFrom = subsDateFrom;
    }

    public Date getSubsDateTill() {
        return subsDateTill;
    }

    public void setSubsDateTill(Date subsDateTill) {
        this.subsDateTill = subsDateTill;
    }

    public Integer getIsRecipient() {
        return isRecipient;
    }

    public void setIsRecipient(Integer isRecipient) {
        this.isRecipient = isRecipient;
    }

    public String getNumb() {
        return numb;
    }

    public void setNumb(String numb) {
        this.numb = numb;
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
        if (!(object instanceof HAccountFamily)) {
            return false;
        }
        HAccountFamily other = (HAccountFamily) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountFamily[ code=" + code + " ]";
    }
    
}
