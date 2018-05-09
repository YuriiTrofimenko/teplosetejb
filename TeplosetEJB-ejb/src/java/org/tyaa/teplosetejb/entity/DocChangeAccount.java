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
@Table(name = "DOC_CHANGE_ACCOUNT")
@NamedQueries({
    @NamedQuery(name = "DocChangeAccount.findAll", query = "SELECT d FROM DocChangeAccount d")})
public class DocChangeAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    @Size(max = 16)
    private String accountshifr;
    @Size(max = 32)
    private String f;
    @Size(max = 32)
    private String i;
    @Size(max = 32)
    private String o;
    @Size(max = 16)
    private String inn;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer house;
    private Integer flat;
    @Size(max = 16)
    private String flatlitera;
    private Integer accountfloor;
    private Integer entrance;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    private String phone;
    @Size(max = 48)
    private String phone2;
    private Integer disintegrate;
    private Integer hidden;
    private Integer recalcprocdate;
    private BigInteger rversion;
    @Column(name = "HOUSE_STREET")
    private Integer houseStreet;
    @Column(name = "HOUSE_NUMBER")
    private Integer houseNumber;
    @Size(max = 16)
    @Column(name = "HOUSE_LITERA")
    private String houseLitera;
    @Column(name = "HOUSE_AREA")
    private Integer houseArea;
    @Column(name = "HOUSE_ZHEK")
    private Integer houseZhek;
    @Size(max = 128)
    private String remark;
    private Integer lodgers;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal s1;
    private BigDecimal s2;
    private BigDecimal s3;
    private BigDecimal s4;
    private BigDecimal s5;
    private BigDecimal s6;
    private BigDecimal rooms;
    @Column(name = "TYPE_VALUE")
    private Integer typeValue;
    @Column(name = "DATE_FROM")
    @Temporal(TemporalType.DATE)
    private Date dateFrom;
    @Column(name = "DATE_TILL")
    @Temporal(TemporalType.DATE)
    private Date dateTill;
    @Column(name = "IS_CHANGED_FIO")
    private Integer isChangedFio;
    @Column(name = "WATER_HEATER")
    private Integer waterHeater;
    @Column(name = "PROPERTY_CODE")
    private Integer propertyCode;
    @Size(max = 64)
    private String warrant;
    @Size(max = 64)
    private String privatization;
    @Column(name = "CORNER_APARTMENT")
    private Integer cornerApartment;
    private Integer ownership;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocChangeAccount> errDocChangeAccountList;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocChangeAccountVv> errDocChangeAccountVvList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocChangeAccount() {
    }

    public DocChangeAccount(Integer code) {
        this.code = code;
    }

    public DocChangeAccount(Integer code, int state) {
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

    public String getAccountshifr() {
        return accountshifr;
    }

    public void setAccountshifr(String accountshifr) {
        this.accountshifr = accountshifr;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
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

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public String getFlatlitera() {
        return flatlitera;
    }

    public void setFlatlitera(String flatlitera) {
        this.flatlitera = flatlitera;
    }

    public Integer getAccountfloor() {
        return accountfloor;
    }

    public void setAccountfloor(Integer accountfloor) {
        this.accountfloor = accountfloor;
    }

    public Integer getEntrance() {
        return entrance;
    }

    public void setEntrance(Integer entrance) {
        this.entrance = entrance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Integer getDisintegrate() {
        return disintegrate;
    }

    public void setDisintegrate(Integer disintegrate) {
        this.disintegrate = disintegrate;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getRecalcprocdate() {
        return recalcprocdate;
    }

    public void setRecalcprocdate(Integer recalcprocdate) {
        this.recalcprocdate = recalcprocdate;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
    }

    public Integer getHouseStreet() {
        return houseStreet;
    }

    public void setHouseStreet(Integer houseStreet) {
        this.houseStreet = houseStreet;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseLitera() {
        return houseLitera;
    }

    public void setHouseLitera(String houseLitera) {
        this.houseLitera = houseLitera;
    }

    public Integer getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Integer houseArea) {
        this.houseArea = houseArea;
    }

    public Integer getHouseZhek() {
        return houseZhek;
    }

    public void setHouseZhek(Integer houseZhek) {
        this.houseZhek = houseZhek;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getLodgers() {
        return lodgers;
    }

    public void setLodgers(Integer lodgers) {
        this.lodgers = lodgers;
    }

    public BigDecimal getS1() {
        return s1;
    }

    public void setS1(BigDecimal s1) {
        this.s1 = s1;
    }

    public BigDecimal getS2() {
        return s2;
    }

    public void setS2(BigDecimal s2) {
        this.s2 = s2;
    }

    public BigDecimal getS3() {
        return s3;
    }

    public void setS3(BigDecimal s3) {
        this.s3 = s3;
    }

    public BigDecimal getS4() {
        return s4;
    }

    public void setS4(BigDecimal s4) {
        this.s4 = s4;
    }

    public BigDecimal getS5() {
        return s5;
    }

    public void setS5(BigDecimal s5) {
        this.s5 = s5;
    }

    public BigDecimal getS6() {
        return s6;
    }

    public void setS6(BigDecimal s6) {
        this.s6 = s6;
    }

    public BigDecimal getRooms() {
        return rooms;
    }

    public void setRooms(BigDecimal rooms) {
        this.rooms = rooms;
    }

    public Integer getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Integer typeValue) {
        this.typeValue = typeValue;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTill() {
        return dateTill;
    }

    public void setDateTill(Date dateTill) {
        this.dateTill = dateTill;
    }

    public Integer getIsChangedFio() {
        return isChangedFio;
    }

    public void setIsChangedFio(Integer isChangedFio) {
        this.isChangedFio = isChangedFio;
    }

    public Integer getWaterHeater() {
        return waterHeater;
    }

    public void setWaterHeater(Integer waterHeater) {
        this.waterHeater = waterHeater;
    }

    public Integer getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(Integer propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getWarrant() {
        return warrant;
    }

    public void setWarrant(String warrant) {
        this.warrant = warrant;
    }

    public String getPrivatization() {
        return privatization;
    }

    public void setPrivatization(String privatization) {
        this.privatization = privatization;
    }

    public Integer getCornerApartment() {
        return cornerApartment;
    }

    public void setCornerApartment(Integer cornerApartment) {
        this.cornerApartment = cornerApartment;
    }

    public Integer getOwnership() {
        return ownership;
    }

    public void setOwnership(Integer ownership) {
        this.ownership = ownership;
    }

    public List<ErrDocChangeAccount> getErrDocChangeAccountList() {
        return errDocChangeAccountList;
    }

    public void setErrDocChangeAccountList(List<ErrDocChangeAccount> errDocChangeAccountList) {
        this.errDocChangeAccountList = errDocChangeAccountList;
    }

    public List<ErrDocChangeAccountVv> getErrDocChangeAccountVvList() {
        return errDocChangeAccountVvList;
    }

    public void setErrDocChangeAccountVvList(List<ErrDocChangeAccountVv> errDocChangeAccountVvList) {
        this.errDocChangeAccountVvList = errDocChangeAccountVvList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
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
        if (!(object instanceof DocChangeAccount)) {
            return false;
        }
        DocChangeAccount other = (DocChangeAccount) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocChangeAccount[ code=" + code + " ]";
    }
    
}
