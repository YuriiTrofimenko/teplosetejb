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
@Table(name = "DOC_ACCESS_USERS")
@NamedQueries({
    @NamedQuery(name = "DocAccessUsers.findAll", query = "SELECT d FROM DocAccessUsers d")})
public class DocAccessUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
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
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocAccessUsers> errDocAccessUsersList;
    @OneToMany(mappedBy = "pos")
    private List<DocAccessUsersLine> docAccessUsersLineList;

    public DocAccessUsers() {
    }

    public DocAccessUsers(Integer code) {
        this.code = code;
    }

    public DocAccessUsers(Integer code, int state) {
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

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocAccessUsers> getErrDocAccessUsersList() {
        return errDocAccessUsersList;
    }

    public void setErrDocAccessUsersList(List<ErrDocAccessUsers> errDocAccessUsersList) {
        this.errDocAccessUsersList = errDocAccessUsersList;
    }

    public List<DocAccessUsersLine> getDocAccessUsersLineList() {
        return docAccessUsersLineList;
    }

    public void setDocAccessUsersLineList(List<DocAccessUsersLine> docAccessUsersLineList) {
        this.docAccessUsersLineList = docAccessUsersLineList;
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
        if (!(object instanceof DocAccessUsers)) {
            return false;
        }
        DocAccessUsers other = (DocAccessUsers) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccessUsers[ code=" + code + " ]";
    }
    
}
