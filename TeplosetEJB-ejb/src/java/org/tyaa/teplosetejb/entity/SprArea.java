/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "SPR_AREA")
@NamedQueries({
    @NamedQuery(name = "SprArea.findAll", query = "SELECT s FROM SprArea s")})
public class SprArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE")
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "SHIFR")
    private String shifr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "NAME")
    private String name;
    @Size(max = 16)
    @Column(name = "SHORTNAME")
    private String shortname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DISTRICT")
    private int district;
    @Size(max = 128)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 1048)
    @Column(name = "BILLREMARK")
    private String billremark;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    @Column(name = "EXPORT")
    private Integer export;
    @Size(max = 128)
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "SYSTEMUSER")
    private Integer systemuser;
    @Column(name = "LASTUSERCHANGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    @Column(name = "RVERSION")
    private BigInteger rversion;
    @Column(name = "HIDDEN")
    private Integer hidden;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 48)
    @Column(name = "PHONE_TI")
    private String phoneTi;
    @Size(max = 64)
    @Column(name = "FIO_1")
    private String fio1;
    @Size(max = 64)
    @Column(name = "FIO_2")
    private String fio2;
    @OneToMany(mappedBy = "area")
    private transient Collection<House> houseCollection;

    public SprArea() {
    }

    public SprArea(Integer code) {
        this.code = code;
    }

    public SprArea(Integer code, String shifr, String name, int district) {
        this.code = code;
        this.shifr = shifr;
        this.name = name;
        this.district = district;
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

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBillremark() {
        return billremark;
    }

    public void setBillremark(String billremark) {
        this.billremark = billremark;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public Integer getExport() {
        return export;
    }

    public void setExport(Integer export) {
        this.export = export;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneTi() {
        return phoneTi;
    }

    public void setPhoneTi(String phoneTi) {
        this.phoneTi = phoneTi;
    }

    public String getFio1() {
        return fio1;
    }

    public void setFio1(String fio1) {
        this.fio1 = fio1;
    }

    public String getFio2() {
        return fio2;
    }

    public void setFio2(String fio2) {
        this.fio2 = fio2;
    }

    public Collection<House> getHouseCollection() {
        return houseCollection;
    }

    public void setHouseCollection(Collection<House> houseCollection) {
        this.houseCollection = houseCollection;
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
        if (!(object instanceof SprArea)) {
            return false;
        }
        SprArea other = (SprArea) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprArea[ code=" + code + " ]";
    }
    
}
