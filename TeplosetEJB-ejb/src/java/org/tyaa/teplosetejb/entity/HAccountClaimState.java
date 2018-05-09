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
@Table(name = "H_ACCOUNT_CLAIM_STATE")
@NamedQueries({
    @NamedQuery(name = "HAccountClaimState.findAll", query = "SELECT h FROM HAccountClaimState h")})
public class HAccountClaimState implements Serializable {

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
    @Column(name = "ACCOUNT_CLAIM_STATECODE")
    private int accountClaimStatecode;
    @Basic(optional = false)
    @NotNull
    private int claimcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLAIM_LISTNUMBER")
    private int claimListnumber;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Temporal(TemporalType.DATE)
    private Date dateaction;
    private Integer claimstatecode;
    private Integer claimstateowner;
    private Integer claimeexecutive;
    @Size(max = 128)
    private String remark;
    private Integer hidden;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer article;
    @Column(name = "CLAIM_REFEREE")
    private Integer claimReferee;

    public HAccountClaimState() {
    }

    public HAccountClaimState(Integer code) {
        this.code = code;
    }

    public HAccountClaimState(Integer code, int accountClaimStatecode, int claimcode, int claimListnumber, int procdate) {
        this.code = code;
        this.accountClaimStatecode = accountClaimStatecode;
        this.claimcode = claimcode;
        this.claimListnumber = claimListnumber;
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

    public int getAccountClaimStatecode() {
        return accountClaimStatecode;
    }

    public void setAccountClaimStatecode(int accountClaimStatecode) {
        this.accountClaimStatecode = accountClaimStatecode;
    }

    public int getClaimcode() {
        return claimcode;
    }

    public void setClaimcode(int claimcode) {
        this.claimcode = claimcode;
    }

    public int getClaimListnumber() {
        return claimListnumber;
    }

    public void setClaimListnumber(int claimListnumber) {
        this.claimListnumber = claimListnumber;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public Date getDateaction() {
        return dateaction;
    }

    public void setDateaction(Date dateaction) {
        this.dateaction = dateaction;
    }

    public Integer getClaimstatecode() {
        return claimstatecode;
    }

    public void setClaimstatecode(Integer claimstatecode) {
        this.claimstatecode = claimstatecode;
    }

    public Integer getClaimstateowner() {
        return claimstateowner;
    }

    public void setClaimstateowner(Integer claimstateowner) {
        this.claimstateowner = claimstateowner;
    }

    public Integer getClaimeexecutive() {
        return claimeexecutive;
    }

    public void setClaimeexecutive(Integer claimeexecutive) {
        this.claimeexecutive = claimeexecutive;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getArticle() {
        return article;
    }

    public void setArticle(Integer article) {
        this.article = article;
    }

    public Integer getClaimReferee() {
        return claimReferee;
    }

    public void setClaimReferee(Integer claimReferee) {
        this.claimReferee = claimReferee;
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
        if (!(object instanceof HAccountClaimState)) {
            return false;
        }
        HAccountClaimState other = (HAccountClaimState) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountClaimState[ code=" + code + " ]";
    }
    
}
