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
@Table(name = "DOC_HOUSEENTRY")
@NamedQueries({
    @NamedQuery(name = "DocHouseentry.findAll", query = "SELECT d FROM DocHouseentry d")})
public class DocHouseentry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "TOPOLOGY_CODE")
    private Integer topologyCode;
    private Integer pipecode;
    @Column(name = "PIPECODE_NEW")
    private Integer pipecodeNew;
    @Size(max = 16)
    @Column(name = "PIPE_SHIFR")
    private String pipeShifr;
    @Column(name = "OWNER_PIPECODE")
    private Integer ownerPipecode;
    @Column(name = "OWNER_OBJECT")
    private BigInteger ownerObject;
    private Integer service;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer formnach;
    private Integer calctype;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal s1;
    private BigDecimal s2;
    private BigDecimal s3;
    private BigDecimal s4;
    @Size(max = 128)
    private String remark;
    @Column(name = "HOUSE_SERVICE_CODE")
    private Integer houseServiceCode;
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocHouse> errDocHouseList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private DocHouse pos;

    public DocHouseentry() {
    }

    public DocHouseentry(Integer code) {
        this.code = code;
    }

    public DocHouseentry(Integer code, int state) {
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

    public Integer getTopologyCode() {
        return topologyCode;
    }

    public void setTopologyCode(Integer topologyCode) {
        this.topologyCode = topologyCode;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getPipecodeNew() {
        return pipecodeNew;
    }

    public void setPipecodeNew(Integer pipecodeNew) {
        this.pipecodeNew = pipecodeNew;
    }

    public String getPipeShifr() {
        return pipeShifr;
    }

    public void setPipeShifr(String pipeShifr) {
        this.pipeShifr = pipeShifr;
    }

    public Integer getOwnerPipecode() {
        return ownerPipecode;
    }

    public void setOwnerPipecode(Integer ownerPipecode) {
        this.ownerPipecode = ownerPipecode;
    }

    public BigInteger getOwnerObject() {
        return ownerObject;
    }

    public void setOwnerObject(BigInteger ownerObject) {
        this.ownerObject = ownerObject;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
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

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getCalctype() {
        return calctype;
    }

    public void setCalctype(Integer calctype) {
        this.calctype = calctype;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getHouseServiceCode() {
        return houseServiceCode;
    }

    public void setHouseServiceCode(Integer houseServiceCode) {
        this.houseServiceCode = houseServiceCode;
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

    public DocHouse getPos() {
        return pos;
    }

    public void setPos(DocHouse pos) {
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
        if (!(object instanceof DocHouseentry)) {
            return false;
        }
        DocHouseentry other = (DocHouseentry) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocHouseentry[ code=" + code + " ]";
    }
    
}
