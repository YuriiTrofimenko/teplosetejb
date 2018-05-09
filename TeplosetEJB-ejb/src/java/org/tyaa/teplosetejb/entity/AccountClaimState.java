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
@Table(name = "ACCOUNT_CLAIM_STATE")
@NamedQueries({
    @NamedQuery(name = "AccountClaimState.findAll", query = "SELECT a FROM AccountClaimState a")})
public class AccountClaimState implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
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

    public AccountClaimState() {
    }

    public AccountClaimState(Integer code) {
        this.code = code;
    }

    public AccountClaimState(Integer code, int claimcode, int claimListnumber, int procdate) {
        this.code = code;
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
        if (!(object instanceof AccountClaimState)) {
            return false;
        }
        AccountClaimState other = (AccountClaimState) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.AccountClaimState[ code=" + code + " ]";
    }
    
}
