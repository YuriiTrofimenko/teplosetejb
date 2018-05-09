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
@Table(name = "H_HOUSE")
@NamedQueries({
    @NamedQuery(name = "HHouse.findAll", query = "SELECT h FROM HHouse h")})
public class HHouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    private int housecode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String shifr;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Size(max = 16)
    private String postindex;
    @Basic(optional = false)
    @NotNull
    private int street;
    @Basic(optional = false)
    @NotNull
    private int number;
    @Size(max = 16)
    private String litera;
    private Integer area;
    private Integer zhek;
    private Integer zhsk;
    private Integer maxfloor;
    private Integer entrance;
    private Integer flatcount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HEAT_LOAD")
    private BigDecimal heatLoad;
    @Column(name = "CEILING_HEIGHT")
    private BigDecimal ceilingHeight;
    @Size(max = 128)
    private String remark;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    @Column(name = "BEGIN_YEAR")
    private Integer beginYear;
    @Column(name = "TPS_BOILER")
    private Integer tpsBoiler;
    private Integer inspector;
    @Column(name = "P_S1")
    private BigDecimal pS1;
    @Column(name = "P_S2")
    private BigDecimal pS2;
    @Column(name = "P_S3")
    private BigDecimal pS3;
    @Column(name = "P_S4")
    private BigDecimal pS4;
    @Column(name = "P_S5")
    private BigDecimal pS5;
    @Column(name = "P_S6")
    private BigDecimal pS6;

    public HHouse() {
    }

    public HHouse(Integer code) {
        this.code = code;
    }

    public HHouse(Integer code, int housecode, String shifr, Date begindate, int street, int number) {
        this.code = code;
        this.housecode = housecode;
        this.shifr = shifr;
        this.begindate = begindate;
        this.street = street;
        this.number = number;
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

    public int getHousecode() {
        return housecode;
    }

    public void setHousecode(int housecode) {
        this.housecode = housecode;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
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

    public String getPostindex() {
        return postindex;
    }

    public void setPostindex(String postindex) {
        this.postindex = postindex;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLitera() {
        return litera;
    }

    public void setLitera(String litera) {
        this.litera = litera;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getZhek() {
        return zhek;
    }

    public void setZhek(Integer zhek) {
        this.zhek = zhek;
    }

    public Integer getZhsk() {
        return zhsk;
    }

    public void setZhsk(Integer zhsk) {
        this.zhsk = zhsk;
    }

    public Integer getMaxfloor() {
        return maxfloor;
    }

    public void setMaxfloor(Integer maxfloor) {
        this.maxfloor = maxfloor;
    }

    public Integer getEntrance() {
        return entrance;
    }

    public void setEntrance(Integer entrance) {
        this.entrance = entrance;
    }

    public Integer getFlatcount() {
        return flatcount;
    }

    public void setFlatcount(Integer flatcount) {
        this.flatcount = flatcount;
    }

    public BigDecimal getHeatLoad() {
        return heatLoad;
    }

    public void setHeatLoad(BigDecimal heatLoad) {
        this.heatLoad = heatLoad;
    }

    public BigDecimal getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(BigDecimal ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
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

    public Integer getBeginYear() {
        return beginYear;
    }

    public void setBeginYear(Integer beginYear) {
        this.beginYear = beginYear;
    }

    public Integer getTpsBoiler() {
        return tpsBoiler;
    }

    public void setTpsBoiler(Integer tpsBoiler) {
        this.tpsBoiler = tpsBoiler;
    }

    public Integer getInspector() {
        return inspector;
    }

    public void setInspector(Integer inspector) {
        this.inspector = inspector;
    }

    public BigDecimal getPS1() {
        return pS1;
    }

    public void setPS1(BigDecimal pS1) {
        this.pS1 = pS1;
    }

    public BigDecimal getPS2() {
        return pS2;
    }

    public void setPS2(BigDecimal pS2) {
        this.pS2 = pS2;
    }

    public BigDecimal getPS3() {
        return pS3;
    }

    public void setPS3(BigDecimal pS3) {
        this.pS3 = pS3;
    }

    public BigDecimal getPS4() {
        return pS4;
    }

    public void setPS4(BigDecimal pS4) {
        this.pS4 = pS4;
    }

    public BigDecimal getPS5() {
        return pS5;
    }

    public void setPS5(BigDecimal pS5) {
        this.pS5 = pS5;
    }

    public BigDecimal getPS6() {
        return pS6;
    }

    public void setPS6(BigDecimal pS6) {
        this.pS6 = pS6;
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
        if (!(object instanceof HHouse)) {
            return false;
        }
        HHouse other = (HHouse) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HHouse[ code=" + code + " ]";
    }
    
}
