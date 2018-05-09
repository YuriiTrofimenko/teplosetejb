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
@Table(name = "SPR_PAYMENTTYPE")
@NamedQueries({
    @NamedQuery(name = "SprPaymenttype.findAll", query = "SELECT s FROM SprPaymenttype s")})
public class SprPaymenttype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String shifr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    private String name;
    @Size(max = 16)
    private String shortname;
    private Integer pskindcode;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    @Size(max = 128)
    private String remark;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    private BigInteger rversion;
    private Integer hidden;
    private Integer algoritm;
    @Column(name = "ONLY_GROUP_SERVICE")
    private Integer onlyGroupService;
    @Column(name = "GROUP_SERVICE_NOT_OTHER")
    private Integer groupServiceNotOther;

    public SprPaymenttype() {
    }

    public SprPaymenttype(Integer code) {
        this.code = code;
    }

    public SprPaymenttype(Integer code, String shifr, String name) {
        this.code = code;
        this.shifr = shifr;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public Integer getPskindcode() {
        return pskindcode;
    }

    public void setPskindcode(Integer pskindcode) {
        this.pskindcode = pskindcode;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSystemuser() {
        return systemuser;
    }

    public void setSystemuser(Integer systemuser) {
        this.systemuser = systemuser;
    }

    public Date getLastuserchange() {
        return lastuserchange;
    }

    public void setLastuserchange(Date lastuserchange) {
        this.lastuserchange = lastuserchange;
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

    public Integer getAlgoritm() {
        return algoritm;
    }

    public void setAlgoritm(Integer algoritm) {
        this.algoritm = algoritm;
    }

    public Integer getOnlyGroupService() {
        return onlyGroupService;
    }

    public void setOnlyGroupService(Integer onlyGroupService) {
        this.onlyGroupService = onlyGroupService;
    }

    public Integer getGroupServiceNotOther() {
        return groupServiceNotOther;
    }

    public void setGroupServiceNotOther(Integer groupServiceNotOther) {
        this.groupServiceNotOther = groupServiceNotOther;
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
        if (!(object instanceof SprPaymenttype)) {
            return false;
        }
        SprPaymenttype other = (SprPaymenttype) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprPaymenttype[ code=" + code + " ]";
    }
    
}
