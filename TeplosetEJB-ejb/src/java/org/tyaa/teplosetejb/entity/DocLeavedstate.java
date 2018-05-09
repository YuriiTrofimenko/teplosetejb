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
@Table(name = "DOC_LEAVEDSTATE")
@NamedQueries({
    @NamedQuery(name = "DocLeavedstate.findAll", query = "SELECT d FROM DocLeavedstate d")})
public class DocLeavedstate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer quantity;
    private Integer lgoternumber;
    @Size(max = 128)
    private String fio;
    @Size(max = 16)
    private String inn;
    @Size(max = 128)
    private String remark;
    private Integer leavedstatecode;
    private Integer hidden;
    @Column(name = "LGOTASTATE_CODE")
    private Integer lgotastateCode;
    private Integer pos;
    @Column(name = "IS_CHANGEACCOUNT_VV")
    private Integer isChangeaccountVv;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocLeavedstate> errDocLeavedstateList;

    public DocLeavedstate() {
    }

    public DocLeavedstate(Integer code) {
        this.code = code;
    }

    public DocLeavedstate(Integer code, int state) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getLgoternumber() {
        return lgoternumber;
    }

    public void setLgoternumber(Integer lgoternumber) {
        this.lgoternumber = lgoternumber;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getLeavedstatecode() {
        return leavedstatecode;
    }

    public void setLeavedstatecode(Integer leavedstatecode) {
        this.leavedstatecode = leavedstatecode;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getLgotastateCode() {
        return lgotastateCode;
    }

    public void setLgotastateCode(Integer lgotastateCode) {
        this.lgotastateCode = lgotastateCode;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getIsChangeaccountVv() {
        return isChangeaccountVv;
    }

    public void setIsChangeaccountVv(Integer isChangeaccountVv) {
        this.isChangeaccountVv = isChangeaccountVv;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocLeavedstate> getErrDocLeavedstateList() {
        return errDocLeavedstateList;
    }

    public void setErrDocLeavedstateList(List<ErrDocLeavedstate> errDocLeavedstateList) {
        this.errDocLeavedstateList = errDocLeavedstateList;
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
        if (!(object instanceof DocLeavedstate)) {
            return false;
        }
        DocLeavedstate other = (DocLeavedstate) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocLeavedstate[ code=" + code + " ]";
    }
    
}
