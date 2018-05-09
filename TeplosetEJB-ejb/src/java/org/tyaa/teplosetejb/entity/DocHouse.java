/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "DOC_HOUSE")
@NamedQueries({
    @NamedQuery(name = "DocHouse.findAll", query = "SELECT d FROM DocHouse d")})
public class DocHouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer housecode;
    @Size(max = 16)
    @Column(name = "SHIFR_OLD")
    private String shifrOld;
    @Size(max = 16)
    private String shifr;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Size(max = 16)
    private String postindex;
    private Integer street;
    private Integer number;
    @Size(max = 16)
    private String litera;
    private Integer area;
    private Integer zhek;
    private Integer maxfloor;
    private Integer entrance;
    private Integer flatcount;
    @Size(max = 128)
    private String remark;
    private Integer zhsk;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HEAT_LOAD")
    private BigDecimal heatLoad;
    @Column(name = "CEILING_HEIGHT")
    private BigDecimal ceilingHeight;
    private Integer hidden;
    @Column(name = "LINK_CODE")
    private Integer linkCode;
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
    @OneToMany(mappedBy = "pos")
    private List<ErrDocHouse> errDocHouseList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pos")
    private List<DocHouseentry> docHouseentryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pos")
    private List<DocHousemeter> docHousemeterList;

    public DocHouse() {
    }

    public DocHouse(Integer code) {
        this.code = code;
    }

    public DocHouse(Integer code, int state) {
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

    public Integer getHousecode() {
        return housecode;
    }

    public void setHousecode(Integer housecode) {
        this.housecode = housecode;
    }

    public String getShifrOld() {
        return shifrOld;
    }

    public void setShifrOld(String shifrOld) {
        this.shifrOld = shifrOld;
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

    public Integer getStreet() {
        return street;
    }

    public void setStreet(Integer street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getZhsk() {
        return zhsk;
    }

    public void setZhsk(Integer zhsk) {
        this.zhsk = zhsk;
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

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(Integer linkCode) {
        this.linkCode = linkCode;
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

    public List<ErrDocHouse> getErrDocHouseList() {
        return errDocHouseList;
    }

    public void setErrDocHouseList(List<ErrDocHouse> errDocHouseList) {
        this.errDocHouseList = errDocHouseList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<DocHouseentry> getDocHouseentryList() {
        return docHouseentryList;
    }

    public void setDocHouseentryList(List<DocHouseentry> docHouseentryList) {
        this.docHouseentryList = docHouseentryList;
    }

    public List<DocHousemeter> getDocHousemeterList() {
        return docHousemeterList;
    }

    public void setDocHousemeterList(List<DocHousemeter> docHousemeterList) {
        this.docHousemeterList = docHousemeterList;
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
        if (!(object instanceof DocHouse)) {
            return false;
        }
        DocHouse other = (DocHouse) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocHouse[ code=" + code + " ]";
    }
    
}
