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
@Table(name = "DOC_COMPARATIVE_HEAT")
@NamedQueries({
    @NamedQuery(name = "DocComparativeHeat.findAll", query = "SELECT d FROM DocComparativeHeat d")})
public class DocComparativeHeat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "LINE_GROUP_CODE")
    private Integer lineGroupCode;
    @Size(max = 64)
    @Column(name = "LINE_GROUP_NAME")
    private String lineGroupName;
    @Column(name = "LINE_CODE")
    private Integer lineCode;
    @Size(max = 64)
    @Column(name = "LINE_NAME")
    private String lineName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal volume;
    private BigDecimal norma;
    @Column(name = "CALC_VOLUME")
    private BigDecimal calcVolume;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocComparativeHeat() {
    }

    public DocComparativeHeat(Integer code) {
        this.code = code;
    }

    public DocComparativeHeat(Integer code, int state) {
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

    public Integer getLineGroupCode() {
        return lineGroupCode;
    }

    public void setLineGroupCode(Integer lineGroupCode) {
        this.lineGroupCode = lineGroupCode;
    }

    public String getLineGroupName() {
        return lineGroupName;
    }

    public void setLineGroupName(String lineGroupName) {
        this.lineGroupName = lineGroupName;
    }

    public Integer getLineCode() {
        return lineCode;
    }

    public void setLineCode(Integer lineCode) {
        this.lineCode = lineCode;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getNorma() {
        return norma;
    }

    public void setNorma(BigDecimal norma) {
        this.norma = norma;
    }

    public BigDecimal getCalcVolume() {
        return calcVolume;
    }

    public void setCalcVolume(BigDecimal calcVolume) {
        this.calcVolume = calcVolume;
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
        if (!(object instanceof DocComparativeHeat)) {
            return false;
        }
        DocComparativeHeat other = (DocComparativeHeat) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocComparativeHeat[ code=" + code + " ]";
    }
    
}
