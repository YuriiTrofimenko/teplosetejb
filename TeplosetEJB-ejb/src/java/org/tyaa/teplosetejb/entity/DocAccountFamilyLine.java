/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "DOC_ACCOUNT_FAMILY_LINE")
@NamedQueries({
    @NamedQuery(name = "DocAccountFamilyLine.findAll", query = "SELECT d FROM DocAccountFamilyLine d")})
public class DocAccountFamilyLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
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
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocAccountFamily> errDocAccountFamilyList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne
    private DocAccountFamily pos;

    public DocAccountFamilyLine() {
    }

    public DocAccountFamilyLine(Integer code) {
        this.code = code;
    }

    public DocAccountFamilyLine(Integer code, int state) {
        this.code = code;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    public List<ErrDocAccountFamily> getErrDocAccountFamilyList() {
        return errDocAccountFamilyList;
    }

    public void setErrDocAccountFamilyList(List<ErrDocAccountFamily> errDocAccountFamilyList) {
        this.errDocAccountFamilyList = errDocAccountFamilyList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public DocAccountFamily getPos() {
        return pos;
    }

    public void setPos(DocAccountFamily pos) {
        this.pos = pos;
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
        if (!(object instanceof DocAccountFamilyLine)) {
            return false;
        }
        DocAccountFamilyLine other = (DocAccountFamilyLine) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccountFamilyLine[ code=" + code + " ]";
    }
    
}
