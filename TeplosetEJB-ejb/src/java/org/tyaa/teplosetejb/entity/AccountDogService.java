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
@Table(name = "ACCOUNT_DOG_SERVICE")
@NamedQueries({
    @NamedQuery(name = "AccountDogService.findAll", query = "SELECT a FROM AccountDogService a")})
public class AccountDogService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int saldokind;
    @Basic(optional = false)
    @NotNull
    private int firmcode;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Column(name = "DOG_SERVICE_KIND")
    private Integer dogServiceKind;
    @Size(max = 16)
    @Column(name = "DOG_NUMBER")
    private String dogNumber;
    @Column(name = "DOG_DATE")
    @Temporal(TemporalType.DATE)
    private Date dogDate;
    @Column(name = "BEGIN_DATE")
    @Temporal(TemporalType.DATE)
    private Date beginDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Size(max = 16)
    @Column(name = "DOCUMENT_NUMBER")
    private String documentNumber;
    @Size(max = 256)
    @Column(name = "DOCUMENT_DATA")
    private String documentData;
    @Size(max = 128)
    private String fio;
    @Size(max = 16)
    private String inn;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    private String phone;
    private Integer well;
    private Integer project;
    private Integer security;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal s1;
    private BigDecimal s2;
    private BigDecimal s3;
    private BigDecimal s4;
    private BigDecimal rooms;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    @Size(max = 16)
    @Column(name = "DOCUMENT_TYPE")
    private String documentType;

    public AccountDogService() {
    }

    public AccountDogService(Integer code) {
        this.code = code;
    }

    public AccountDogService(Integer code, int saldokind, int firmcode, long accountcode, int procdate) {
        this.code = code;
        this.saldokind = saldokind;
        this.firmcode = firmcode;
        this.accountcode = accountcode;
        this.procdate = procdate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(int saldokind) {
        this.saldokind = saldokind;
    }

    public int getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(int firmcode) {
        this.firmcode = firmcode;
    }

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public Integer getDogServiceKind() {
        return dogServiceKind;
    }

    public void setDogServiceKind(Integer dogServiceKind) {
        this.dogServiceKind = dogServiceKind;
    }

    public String getDogNumber() {
        return dogNumber;
    }

    public void setDogNumber(String dogNumber) {
        this.dogNumber = dogNumber;
    }

    public Date getDogDate() {
        return dogDate;
    }

    public void setDogDate(Date dogDate) {
        this.dogDate = dogDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentData() {
        return documentData;
    }

    public void setDocumentData(String documentData) {
        this.documentData = documentData;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getWell() {
        return well;
    }

    public void setWell(Integer well) {
        this.well = well;
    }

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    public Integer getSecurity() {
        return security;
    }

    public void setSecurity(Integer security) {
        this.security = security;
    }

    public BigDecimal getS1() {
        return s1;
    }

    public void setS1(BigDecimal s1) {
        this.s1 = s1;
    }

    public BigDecimal getS2() {
        return s2;
    }

    public void setS2(BigDecimal s2) {
        this.s2 = s2;
    }

    public BigDecimal getS3() {
        return s3;
    }

    public void setS3(BigDecimal s3) {
        this.s3 = s3;
    }

    public BigDecimal getS4() {
        return s4;
    }

    public void setS4(BigDecimal s4) {
        this.s4 = s4;
    }

    public BigDecimal getRooms() {
        return rooms;
    }

    public void setRooms(BigDecimal rooms) {
        this.rooms = rooms;
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

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
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
        if (!(object instanceof AccountDogService)) {
            return false;
        }
        AccountDogService other = (AccountDogService) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.AccountDogService[ code=" + code + " ]";
    }
    
}
