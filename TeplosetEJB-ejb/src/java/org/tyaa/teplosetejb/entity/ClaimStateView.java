/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
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
@Table(name = "CLAIM_STATE_VIEW")
@NamedQueries({
    @NamedQuery(name = "ClaimStateView.findAll", query = "SELECT c FROM ClaimStateView c")})
public class ClaimStateView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    private int claimcode;
    @Temporal(TemporalType.DATE)
    private Date dateaction;
    private Integer claimstatecode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String claimstateshifr;
    @Size(max = 64)
    private String claimstatename;
    private Integer claimstateowner;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String claimstateownershifr;
    @Size(max = 64)
    private String claimstateownername;
    private Integer claimeexecutive;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String claimeexecutiveshifr;
    @Size(max = 64)
    private String claimeexecutivename;
    @Size(max = 128)
    private String remark;
    @Size(max = 32)
    private String docnumber;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    @Size(max = 64)
    private String username;
    private Integer code;
    private Integer doc;
    private Integer pos;
    private Integer posadd;
    private Integer state;
    private Integer article;
    @Column(name = "CLAIM_REFEREE")
    private Integer claimReferee;
    @Size(max = 48)
    @Column(name = "ARTICLE_NAME")
    private String articleName;
    @Size(max = 64)
    @Column(name = "CLAIM_REFEREE_NAME")
    private String claimRefereeName;

    public ClaimStateView() {
    }

    public int getClaimcode() {
        return claimcode;
    }

    public void setClaimcode(int claimcode) {
        this.claimcode = claimcode;
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

    public String getClaimstateshifr() {
        return claimstateshifr;
    }

    public void setClaimstateshifr(String claimstateshifr) {
        this.claimstateshifr = claimstateshifr;
    }

    public String getClaimstatename() {
        return claimstatename;
    }

    public void setClaimstatename(String claimstatename) {
        this.claimstatename = claimstatename;
    }

    public Integer getClaimstateowner() {
        return claimstateowner;
    }

    public void setClaimstateowner(Integer claimstateowner) {
        this.claimstateowner = claimstateowner;
    }

    public String getClaimstateownershifr() {
        return claimstateownershifr;
    }

    public void setClaimstateownershifr(String claimstateownershifr) {
        this.claimstateownershifr = claimstateownershifr;
    }

    public String getClaimstateownername() {
        return claimstateownername;
    }

    public void setClaimstateownername(String claimstateownername) {
        this.claimstateownername = claimstateownername;
    }

    public Integer getClaimeexecutive() {
        return claimeexecutive;
    }

    public void setClaimeexecutive(Integer claimeexecutive) {
        this.claimeexecutive = claimeexecutive;
    }

    public String getClaimeexecutiveshifr() {
        return claimeexecutiveshifr;
    }

    public void setClaimeexecutiveshifr(String claimeexecutiveshifr) {
        this.claimeexecutiveshifr = claimeexecutiveshifr;
    }

    public String getClaimeexecutivename() {
        return claimeexecutivename;
    }

    public void setClaimeexecutivename(String claimeexecutivename) {
        this.claimeexecutivename = claimeexecutivename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDocnumber() {
        return docnumber;
    }

    public void setDocnumber(String docnumber) {
        this.docnumber = docnumber;
    }

    public Date getLastuserchange() {
        return lastuserchange;
    }

    public void setLastuserchange(Date lastuserchange) {
        this.lastuserchange = lastuserchange;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getDoc() {
        return doc;
    }

    public void setDoc(Integer doc) {
        this.doc = doc;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getPosadd() {
        return posadd;
    }

    public void setPosadd(Integer posadd) {
        this.posadd = posadd;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getClaimRefereeName() {
        return claimRefereeName;
    }

    public void setClaimRefereeName(String claimRefereeName) {
        this.claimRefereeName = claimRefereeName;
    }
    
}
