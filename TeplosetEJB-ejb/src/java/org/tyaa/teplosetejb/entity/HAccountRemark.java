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
@Table(name = "H_ACCOUNT_REMARK")
@NamedQueries({
    @NamedQuery(name = "HAccountRemark.findAll", query = "SELECT h FROM HAccountRemark h")})
public class HAccountRemark implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNT_REMARKCODE")
    private int accountRemarkcode;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Temporal(TemporalType.DATE)
    private Date remarkdate;
    private Integer remarkkindcode;
    @Size(max = 128)
    private String remark;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    private Integer createuser;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    private BigInteger rversion;
    private Integer hidden;
    @Size(max = 48)
    @Column(name = "PHONE_1")
    private String phone1;
    @Size(max = 48)
    @Column(name = "PHONE_2")
    private String phone2;

    public HAccountRemark() {
    }

    public HAccountRemark(Integer code) {
        this.code = code;
    }

    public HAccountRemark(Integer code, int accountRemarkcode, long accountcode, int procdate) {
        this.code = code;
        this.accountRemarkcode = accountRemarkcode;
        this.accountcode = accountcode;
        this.procdate = procdate;
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

    public int getAccountRemarkcode() {
        return accountRemarkcode;
    }

    public void setAccountRemarkcode(int accountRemarkcode) {
        this.accountRemarkcode = accountRemarkcode;
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

    public Date getRemarkdate() {
        return remarkdate;
    }

    public void setRemarkdate(Date remarkdate) {
        this.remarkdate = remarkdate;
    }

    public Integer getRemarkkindcode() {
        return remarkkindcode;
    }

    public void setRemarkkindcode(Integer remarkkindcode) {
        this.remarkkindcode = remarkkindcode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HAccountRemark)) {
            return false;
        }
        HAccountRemark other = (HAccountRemark) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountRemark[ code=" + code + " ]";
    }
    
}
