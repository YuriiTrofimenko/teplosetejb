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
@Table(name = "H_ACCOUNT_CLAIM")
@NamedQueries({
    @NamedQuery(name = "HAccountClaim.findAll", query = "SELECT h FROM HAccountClaim h")})
public class HAccountClaim implements Serializable {

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
    @Column(name = "ACCOUNT_CLAIMCODE")
    private int accountClaimcode;
    private Integer firmcode;
    private Integer saldokind;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Column(name = "CLAIM_KIND")
    private Integer claimKind;
    @Size(max = 16)
    private String regnumber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal summ1;
    private BigDecimal summ2;
    private BigDecimal summ3;
    private BigDecimal summ4;
    @Temporal(TemporalType.DATE)
    private Date periodfrom;
    @Temporal(TemporalType.DATE)
    private Date periodtill;
    @Size(max = 16)
    private String claimnumber;
    private BigDecimal claimsumm1;
    private BigDecimal claimsumm2;
    private BigDecimal claimsumm3;
    private BigDecimal claimsumm4;
    @Size(max = 128)
    private String remark;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    private BigDecimal summ5;
    private BigDecimal claimsumm5;
    @Temporal(TemporalType.DATE)
    private Date claimdate;
    @Size(max = 16)
    private String reestrnumber;
    @Temporal(TemporalType.DATE)
    private Date claimperiodfrom;
    @Temporal(TemporalType.DATE)
    private Date claimperiodtill;
    private Integer pr1;
    private Integer pr2;
    private Integer pr3;
    private Integer pr4;
    private Integer pr5;

    public HAccountClaim() {
    }

    public HAccountClaim(Integer code) {
        this.code = code;
    }

    public HAccountClaim(Integer code, int accountClaimcode, long accountcode, int procdate) {
        this.code = code;
        this.accountClaimcode = accountClaimcode;
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

    public Integer getSetRversion() {
        return setRversion;
    }

    public void setSetRversion(Integer setRversion) {
        this.setRversion = setRversion;
    }

    public int getAccountClaimcode() {
        return accountClaimcode;
    }

    public void setAccountClaimcode(int accountClaimcode) {
        this.accountClaimcode = accountClaimcode;
    }

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
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

    public Integer getClaimKind() {
        return claimKind;
    }

    public void setClaimKind(Integer claimKind) {
        this.claimKind = claimKind;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public BigDecimal getSumm1() {
        return summ1;
    }

    public void setSumm1(BigDecimal summ1) {
        this.summ1 = summ1;
    }

    public BigDecimal getSumm2() {
        return summ2;
    }

    public void setSumm2(BigDecimal summ2) {
        this.summ2 = summ2;
    }

    public BigDecimal getSumm3() {
        return summ3;
    }

    public void setSumm3(BigDecimal summ3) {
        this.summ3 = summ3;
    }

    public BigDecimal getSumm4() {
        return summ4;
    }

    public void setSumm4(BigDecimal summ4) {
        this.summ4 = summ4;
    }

    public Date getPeriodfrom() {
        return periodfrom;
    }

    public void setPeriodfrom(Date periodfrom) {
        this.periodfrom = periodfrom;
    }

    public Date getPeriodtill() {
        return periodtill;
    }

    public void setPeriodtill(Date periodtill) {
        this.periodtill = periodtill;
    }

    public String getClaimnumber() {
        return claimnumber;
    }

    public void setClaimnumber(String claimnumber) {
        this.claimnumber = claimnumber;
    }

    public BigDecimal getClaimsumm1() {
        return claimsumm1;
    }

    public void setClaimsumm1(BigDecimal claimsumm1) {
        this.claimsumm1 = claimsumm1;
    }

    public BigDecimal getClaimsumm2() {
        return claimsumm2;
    }

    public void setClaimsumm2(BigDecimal claimsumm2) {
        this.claimsumm2 = claimsumm2;
    }

    public BigDecimal getClaimsumm3() {
        return claimsumm3;
    }

    public void setClaimsumm3(BigDecimal claimsumm3) {
        this.claimsumm3 = claimsumm3;
    }

    public BigDecimal getClaimsumm4() {
        return claimsumm4;
    }

    public void setClaimsumm4(BigDecimal claimsumm4) {
        this.claimsumm4 = claimsumm4;
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

    public BigDecimal getSumm5() {
        return summ5;
    }

    public void setSumm5(BigDecimal summ5) {
        this.summ5 = summ5;
    }

    public BigDecimal getClaimsumm5() {
        return claimsumm5;
    }

    public void setClaimsumm5(BigDecimal claimsumm5) {
        this.claimsumm5 = claimsumm5;
    }

    public Date getClaimdate() {
        return claimdate;
    }

    public void setClaimdate(Date claimdate) {
        this.claimdate = claimdate;
    }

    public String getReestrnumber() {
        return reestrnumber;
    }

    public void setReestrnumber(String reestrnumber) {
        this.reestrnumber = reestrnumber;
    }

    public Date getClaimperiodfrom() {
        return claimperiodfrom;
    }

    public void setClaimperiodfrom(Date claimperiodfrom) {
        this.claimperiodfrom = claimperiodfrom;
    }

    public Date getClaimperiodtill() {
        return claimperiodtill;
    }

    public void setClaimperiodtill(Date claimperiodtill) {
        this.claimperiodtill = claimperiodtill;
    }

    public Integer getPr1() {
        return pr1;
    }

    public void setPr1(Integer pr1) {
        this.pr1 = pr1;
    }

    public Integer getPr2() {
        return pr2;
    }

    public void setPr2(Integer pr2) {
        this.pr2 = pr2;
    }

    public Integer getPr3() {
        return pr3;
    }

    public void setPr3(Integer pr3) {
        this.pr3 = pr3;
    }

    public Integer getPr4() {
        return pr4;
    }

    public void setPr4(Integer pr4) {
        this.pr4 = pr4;
    }

    public Integer getPr5() {
        return pr5;
    }

    public void setPr5(Integer pr5) {
        this.pr5 = pr5;
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
        if (!(object instanceof HAccountClaim)) {
            return false;
        }
        HAccountClaim other = (HAccountClaim) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountClaim[ code=" + code + " ]";
    }
    
}
