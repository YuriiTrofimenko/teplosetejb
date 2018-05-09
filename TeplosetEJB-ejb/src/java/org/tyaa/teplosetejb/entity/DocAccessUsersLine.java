/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_ACCESS_USERS_LINE")
@NamedQueries({
    @NamedQuery(name = "DocAccessUsersLine.findAll", query = "SELECT d FROM DocAccessUsersLine d")})
public class DocAccessUsersLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int doc;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "ACCOUNT_CODE")
    private BigInteger accountCode;
    @Column(name = "HOUSE_CODE")
    private Integer houseCode;
    @Column(name = "AREA_CODE")
    private Integer areaCode;
    @Column(name = "DISTRICT_CODE")
    private Integer districtCode;
    @Column(name = "USER_CODE")
    private Integer userCode;
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocAccessUsers> errDocAccessUsersList;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne
    private DocAccessUsers pos;

    public DocAccessUsersLine() {
    }

    public DocAccessUsersLine(Integer code) {
        this.code = code;
    }

    public DocAccessUsersLine(Integer code, int doc, int state) {
        this.code = code;
        this.doc = doc;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public BigInteger getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(BigInteger accountCode) {
        this.accountCode = accountCode;
    }

    public Integer getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(Integer houseCode) {
        this.houseCode = houseCode;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    public List<ErrDocAccessUsers> getErrDocAccessUsersList() {
        return errDocAccessUsersList;
    }

    public void setErrDocAccessUsersList(List<ErrDocAccessUsers> errDocAccessUsersList) {
        this.errDocAccessUsersList = errDocAccessUsersList;
    }

    public DocAccessUsers getPos() {
        return pos;
    }

    public void setPos(DocAccessUsers pos) {
        this.pos = pos;
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
        if (!(object instanceof DocAccessUsersLine)) {
            return false;
        }
        DocAccessUsersLine other = (DocAccessUsersLine) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccessUsersLine[ code=" + code + " ]";
    }
    
}
