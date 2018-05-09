/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_HOUSE_S_ARENDA")
@NamedQueries({
    @NamedQuery(name = "DocHouseSArenda.findAll", query = "SELECT d FROM DocHouseSArenda d")})
public class DocHouseSArenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer housecode;
    private Integer pipecode;
    @Size(max = 128)
    private String remark;
    @Column(name = "BEGIN_YEAR")
    private Integer beginYear;
    private Integer maxfloor;
    private Integer entrance;
    @Column(name = "TPS_BOILER")
    private Integer tpsBoiler;
    @Column(name = "INSPECTOR_CODE")
    private Integer inspectorCode;
    @Column(name = "INSPECTOR_OLD_CODE")
    private Integer inspectorOldCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pos")
    private List<DocHouseSArendaLine> docHouseSArendaLineList;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocHouseSArenda> errDocHouseSArendaList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocHouseSArenda() {
    }

    public DocHouseSArenda(Integer code) {
        this.code = code;
    }

    public DocHouseSArenda(Integer code, int state) {
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

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getBeginYear() {
        return beginYear;
    }

    public void setBeginYear(Integer beginYear) {
        this.beginYear = beginYear;
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

    public Integer getTpsBoiler() {
        return tpsBoiler;
    }

    public void setTpsBoiler(Integer tpsBoiler) {
        this.tpsBoiler = tpsBoiler;
    }

    public Integer getInspectorCode() {
        return inspectorCode;
    }

    public void setInspectorCode(Integer inspectorCode) {
        this.inspectorCode = inspectorCode;
    }

    public Integer getInspectorOldCode() {
        return inspectorOldCode;
    }

    public void setInspectorOldCode(Integer inspectorOldCode) {
        this.inspectorOldCode = inspectorOldCode;
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

    public List<DocHouseSArendaLine> getDocHouseSArendaLineList() {
        return docHouseSArendaLineList;
    }

    public void setDocHouseSArendaLineList(List<DocHouseSArendaLine> docHouseSArendaLineList) {
        this.docHouseSArendaLineList = docHouseSArendaLineList;
    }

    public List<ErrDocHouseSArenda> getErrDocHouseSArendaList() {
        return errDocHouseSArendaList;
    }

    public void setErrDocHouseSArendaList(List<ErrDocHouseSArenda> errDocHouseSArendaList) {
        this.errDocHouseSArendaList = errDocHouseSArendaList;
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
        if (!(object instanceof DocHouseSArenda)) {
            return false;
        }
        DocHouseSArenda other = (DocHouseSArenda) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocHouseSArenda[ code=" + code + " ]";
    }
    
}
