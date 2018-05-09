/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "DOC_LGOTASTATE")
@NamedQueries({
    @NamedQuery(name = "DocLgotastate.findAll", query = "SELECT d FROM DocLgotastate d")})
public class DocLgotastate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    private Integer number;
    private Integer lgotacode;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Size(max = 128)
    private String fio;
    @Size(max = 16)
    private String inn;
    private Integer hostnumber;
    private Integer relativecode;
    @Size(max = 48)
    private String doclgnumber;
    @Temporal(TemporalType.DATE)
    private Date doclgdate;
    @Size(max = 48)
    private String doclgsource;
    @Size(max = 48)
    private String doclgtype;
    @Column(name = "CONFIRMATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date confirmationDate;
    @Size(max = 16)
    private String post;
    @Size(max = 128)
    private String remark;
    private Integer sourcenumber;
    private Integer lgotastatecode;
    private Integer hidden;
    private Integer recalcprocdate;
    private Integer hostnumber2;
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    private Integer calcsortorder;
    @Size(max = 16)
    @Column(name = "INN_HOSTNUMBER2")
    private String innHostnumber2;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocLgotastate> errDocLgotastateList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocLgotastate() {
    }

    public DocLgotastate(Integer code) {
        this.code = code;
    }

    public DocLgotastate(Integer code, int state) {
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

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getLgotacode() {
        return lgotacode;
    }

    public void setLgotacode(Integer lgotacode) {
        this.lgotacode = lgotacode;
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

    public Integer getHostnumber() {
        return hostnumber;
    }

    public void setHostnumber(Integer hostnumber) {
        this.hostnumber = hostnumber;
    }

    public Integer getRelativecode() {
        return relativecode;
    }

    public void setRelativecode(Integer relativecode) {
        this.relativecode = relativecode;
    }

    public String getDoclgnumber() {
        return doclgnumber;
    }

    public void setDoclgnumber(String doclgnumber) {
        this.doclgnumber = doclgnumber;
    }

    public Date getDoclgdate() {
        return doclgdate;
    }

    public void setDoclgdate(Date doclgdate) {
        this.doclgdate = doclgdate;
    }

    public String getDoclgsource() {
        return doclgsource;
    }

    public void setDoclgsource(String doclgsource) {
        this.doclgsource = doclgsource;
    }

    public String getDoclgtype() {
        return doclgtype;
    }

    public void setDoclgtype(String doclgtype) {
        this.doclgtype = doclgtype;
    }

    public Date getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSourcenumber() {
        return sourcenumber;
    }

    public void setSourcenumber(Integer sourcenumber) {
        this.sourcenumber = sourcenumber;
    }

    public Integer getLgotastatecode() {
        return lgotastatecode;
    }

    public void setLgotastatecode(Integer lgotastatecode) {
        this.lgotastatecode = lgotastatecode;
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

    public Integer getHostnumber2() {
        return hostnumber2;
    }

    public void setHostnumber2(Integer hostnumber2) {
        this.hostnumber2 = hostnumber2;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getCalcsortorder() {
        return calcsortorder;
    }

    public void setCalcsortorder(Integer calcsortorder) {
        this.calcsortorder = calcsortorder;
    }

    public String getInnHostnumber2() {
        return innHostnumber2;
    }

    public void setInnHostnumber2(String innHostnumber2) {
        this.innHostnumber2 = innHostnumber2;
    }

    public List<ErrDocLgotastate> getErrDocLgotastateList() {
        return errDocLgotastateList;
    }

    public void setErrDocLgotastateList(List<ErrDocLgotastate> errDocLgotastateList) {
        this.errDocLgotastateList = errDocLgotastateList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
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
        if (!(object instanceof DocLgotastate)) {
            return false;
        }
        DocLgotastate other = (DocLgotastate) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocLgotastate[ code=" + code + " ]";
    }
    
}
