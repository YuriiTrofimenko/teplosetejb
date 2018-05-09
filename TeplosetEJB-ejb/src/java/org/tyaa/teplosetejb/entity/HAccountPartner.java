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
@Table(name = "H_ACCOUNT_PARTNER")
@NamedQueries({
    @NamedQuery(name = "HAccountPartner.findAll", query = "SELECT h FROM HAccountPartner h")})
public class HAccountPartner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNT_PARTNERCODE")
    private int accountPartnercode;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Basic(optional = false)
    @NotNull
    private int partnercode;
    @Size(max = 16)
    @Column(name = "ACCOUNT_FIRMS")
    private String accountFirms;
    @Column(name = "TYPE_LINK")
    private Integer typeLink;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Size(max = 128)
    @Column(name = "FIO_FIRMS")
    private String fioFirms;
    @Size(max = 128)
    private String remark;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;

    public HAccountPartner() {
    }

    public HAccountPartner(Integer code) {
        this.code = code;
    }

    public HAccountPartner(Integer code, int accountPartnercode, long accountcode, int procdate, int partnercode) {
        this.code = code;
        this.accountPartnercode = accountPartnercode;
        this.accountcode = accountcode;
        this.procdate = procdate;
        this.partnercode = partnercode;
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

    public int getAccountPartnercode() {
        return accountPartnercode;
    }

    public void setAccountPartnercode(int accountPartnercode) {
        this.accountPartnercode = accountPartnercode;
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

    public int getPartnercode() {
        return partnercode;
    }

    public void setPartnercode(int partnercode) {
        this.partnercode = partnercode;
    }

    public String getAccountFirms() {
        return accountFirms;
    }

    public void setAccountFirms(String accountFirms) {
        this.accountFirms = accountFirms;
    }

    public Integer getTypeLink() {
        return typeLink;
    }

    public void setTypeLink(Integer typeLink) {
        this.typeLink = typeLink;
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

    public String getFioFirms() {
        return fioFirms;
    }

    public void setFioFirms(String fioFirms) {
        this.fioFirms = fioFirms;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HAccountPartner)) {
            return false;
        }
        HAccountPartner other = (HAccountPartner) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountPartner[ code=" + code + " ]";
    }
    
}
