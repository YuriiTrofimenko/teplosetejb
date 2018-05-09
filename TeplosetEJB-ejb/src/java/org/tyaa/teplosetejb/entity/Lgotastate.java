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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Lgotastate.findAll", query = "SELECT l FROM Lgotastate l")})
public class Lgotastate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int number;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Basic(optional = false)
    @NotNull
    private int lgotacode;
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
    private Integer hidden;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hostnumber2;
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    private Integer calcsortorder;

    public Lgotastate() {
    }

    public Lgotastate(Integer code) {
        this.code = code;
    }

    public Lgotastate(Integer code, long accountcode, int number, Date begindate, int lgotacode) {
        this.code = code;
        this.accountcode = accountcode;
        this.number = number;
        this.begindate = begindate;
        this.lgotacode = lgotacode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getLgotacode() {
        return lgotacode;
    }

    public void setLgotacode(int lgotacode) {
        this.lgotacode = lgotacode;
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

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lgotastate)) {
            return false;
        }
        Lgotastate other = (Lgotastate) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Lgotastate[ code=" + code + " ]";
    }
    
}
