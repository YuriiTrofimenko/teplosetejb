/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_DHW_ENTERPRISE")
@NamedQueries({
    @NamedQuery(name = "DocDhwEnterprise.findAll", query = "SELECT d FROM DocDhwEnterprise d")})
public class DocDhwEnterprise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "AREA_CODE")
    private Integer areaCode;
    @Column(name = "BOILER_CODE")
    private Integer boilerCode;
    @Column(name = "HEATPOINT_CODE")
    private Integer heatpointCode;
    @Size(max = 128)
    private String remark;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VOLUME_OTHER")
    private BigDecimal volumeOther;
    @Column(name = "VOLUME_BUDGET")
    private BigDecimal volumeBudget;
    @Column(name = "VOLUME_ARENDA")
    private BigDecimal volumeArenda;
    @Column(name = "VOLUME_RELIGIOUS")
    private BigDecimal volumeReligious;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocDhwEnterprise() {
    }

    public DocDhwEnterprise(Integer code) {
        this.code = code;
    }

    public DocDhwEnterprise(Integer code, int state) {
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

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getBoilerCode() {
        return boilerCode;
    }

    public void setBoilerCode(Integer boilerCode) {
        this.boilerCode = boilerCode;
    }

    public Integer getHeatpointCode() {
        return heatpointCode;
    }

    public void setHeatpointCode(Integer heatpointCode) {
        this.heatpointCode = heatpointCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getVolumeOther() {
        return volumeOther;
    }

    public void setVolumeOther(BigDecimal volumeOther) {
        this.volumeOther = volumeOther;
    }

    public BigDecimal getVolumeBudget() {
        return volumeBudget;
    }

    public void setVolumeBudget(BigDecimal volumeBudget) {
        this.volumeBudget = volumeBudget;
    }

    public BigDecimal getVolumeArenda() {
        return volumeArenda;
    }

    public void setVolumeArenda(BigDecimal volumeArenda) {
        this.volumeArenda = volumeArenda;
    }

    public BigDecimal getVolumeReligious() {
        return volumeReligious;
    }

    public void setVolumeReligious(BigDecimal volumeReligious) {
        this.volumeReligious = volumeReligious;
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
        if (!(object instanceof DocDhwEnterprise)) {
            return false;
        }
        DocDhwEnterprise other = (DocDhwEnterprise) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocDhwEnterprise[ code=" + code + " ]";
    }
    
}
