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
@Table(name = "DOC_ACCOUNT_PARTNER")
@NamedQueries({
    @NamedQuery(name = "DocAccountPartner.findAll", query = "SELECT d FROM DocAccountPartner d")})
public class DocAccountPartner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    private Integer partnercode;
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
    private Integer hidden;
    @Column(name = "ACCOUNT_PARTNER_CODE")
    private Integer accountPartnerCode;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocAccountPartner> errDocAccountPartnerList;

    public DocAccountPartner() {
    }

    public DocAccountPartner(Integer code) {
        this.code = code;
    }

    public DocAccountPartner(Integer code, int state) {
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

    public Integer getPartnercode() {
        return partnercode;
    }

    public void setPartnercode(Integer partnercode) {
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

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getAccountPartnerCode() {
        return accountPartnerCode;
    }

    public void setAccountPartnerCode(Integer accountPartnerCode) {
        this.accountPartnerCode = accountPartnerCode;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocAccountPartner> getErrDocAccountPartnerList() {
        return errDocAccountPartnerList;
    }

    public void setErrDocAccountPartnerList(List<ErrDocAccountPartner> errDocAccountPartnerList) {
        this.errDocAccountPartnerList = errDocAccountPartnerList;
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
        if (!(object instanceof DocAccountPartner)) {
            return false;
        }
        DocAccountPartner other = (DocAccountPartner) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccountPartner[ code=" + code + " ]";
    }
    
}
