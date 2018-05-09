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
@Table(name = "DOC_F1_ENTERPRISE")
@NamedQueries({
    @NamedQuery(name = "DocF1Enterprise.findAll", query = "SELECT d FROM DocF1Enterprise d")})
public class DocF1Enterprise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "DIALOG_CODE")
    private Integer dialogCode;
    @Column(name = "AREA_CODE")
    private Integer areaCode;
    @Size(max = 128)
    private String remark;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HEAT_M2")
    private BigDecimal heatM2;
    @Column(name = "HEAT_M2_GRN")
    private BigDecimal heatM2Grn;
    @Column(name = "HEAT_GK")
    private BigDecimal heatGk;
    @Column(name = "HEAT_GK_GRN")
    private BigDecimal heatGkGrn;
    @Column(name = "WATER_M3")
    private BigDecimal waterM3;
    @Column(name = "WATER_M3_GRN")
    private BigDecimal waterM3Grn;
    @Column(name = "WATER_GK")
    private BigDecimal waterGk;
    @Column(name = "WATER_GK_GRN")
    private BigDecimal waterGkGrn;
    @Column(name = "STEAM_GK")
    private BigDecimal steamGk;
    @Column(name = "STEAM_GK_GRN")
    private BigDecimal steamGkGrn;
    @Column(name = "PLATTEN_GK")
    private BigDecimal plattenGk;
    @Column(name = "PLATTEN_GK_GRN")
    private BigDecimal plattenGkGrn;
    @Column(name = "BUILDERS_M2")
    private BigDecimal buildersM2;
    @Column(name = "BUILDERS_M2_GRN")
    private BigDecimal buildersM2Grn;
    @Column(name = "BUILDERS_GK")
    private BigDecimal buildersGk;
    @Column(name = "BUILDERS_GK_GRN")
    private BigDecimal buildersGkGrn;
    @Column(name = "LEAK_GRN")
    private BigDecimal leakGrn;
    @Column(name = "SEAL_GRN")
    private BigDecimal sealGrn;
    @Column(name = "PERCENT3_GRN")
    private BigDecimal percent3Grn;
    @Column(name = "LOSS_GRN")
    private BigDecimal lossGrn;
    @Column(name = "THERMAL_ENERGY_GK")
    private BigDecimal thermalEnergyGk;
    @Column(name = "THERMAL_ENERGY_GRN")
    private BigDecimal thermalEnergyGrn;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocF1Enterprise() {
    }

    public DocF1Enterprise(Integer code) {
        this.code = code;
    }

    public DocF1Enterprise(Integer code, int state) {
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

    public Integer getDialogCode() {
        return dialogCode;
    }

    public void setDialogCode(Integer dialogCode) {
        this.dialogCode = dialogCode;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getHeatM2() {
        return heatM2;
    }

    public void setHeatM2(BigDecimal heatM2) {
        this.heatM2 = heatM2;
    }

    public BigDecimal getHeatM2Grn() {
        return heatM2Grn;
    }

    public void setHeatM2Grn(BigDecimal heatM2Grn) {
        this.heatM2Grn = heatM2Grn;
    }

    public BigDecimal getHeatGk() {
        return heatGk;
    }

    public void setHeatGk(BigDecimal heatGk) {
        this.heatGk = heatGk;
    }

    public BigDecimal getHeatGkGrn() {
        return heatGkGrn;
    }

    public void setHeatGkGrn(BigDecimal heatGkGrn) {
        this.heatGkGrn = heatGkGrn;
    }

    public BigDecimal getWaterM3() {
        return waterM3;
    }

    public void setWaterM3(BigDecimal waterM3) {
        this.waterM3 = waterM3;
    }

    public BigDecimal getWaterM3Grn() {
        return waterM3Grn;
    }

    public void setWaterM3Grn(BigDecimal waterM3Grn) {
        this.waterM3Grn = waterM3Grn;
    }

    public BigDecimal getWaterGk() {
        return waterGk;
    }

    public void setWaterGk(BigDecimal waterGk) {
        this.waterGk = waterGk;
    }

    public BigDecimal getWaterGkGrn() {
        return waterGkGrn;
    }

    public void setWaterGkGrn(BigDecimal waterGkGrn) {
        this.waterGkGrn = waterGkGrn;
    }

    public BigDecimal getSteamGk() {
        return steamGk;
    }

    public void setSteamGk(BigDecimal steamGk) {
        this.steamGk = steamGk;
    }

    public BigDecimal getSteamGkGrn() {
        return steamGkGrn;
    }

    public void setSteamGkGrn(BigDecimal steamGkGrn) {
        this.steamGkGrn = steamGkGrn;
    }

    public BigDecimal getPlattenGk() {
        return plattenGk;
    }

    public void setPlattenGk(BigDecimal plattenGk) {
        this.plattenGk = plattenGk;
    }

    public BigDecimal getPlattenGkGrn() {
        return plattenGkGrn;
    }

    public void setPlattenGkGrn(BigDecimal plattenGkGrn) {
        this.plattenGkGrn = plattenGkGrn;
    }

    public BigDecimal getBuildersM2() {
        return buildersM2;
    }

    public void setBuildersM2(BigDecimal buildersM2) {
        this.buildersM2 = buildersM2;
    }

    public BigDecimal getBuildersM2Grn() {
        return buildersM2Grn;
    }

    public void setBuildersM2Grn(BigDecimal buildersM2Grn) {
        this.buildersM2Grn = buildersM2Grn;
    }

    public BigDecimal getBuildersGk() {
        return buildersGk;
    }

    public void setBuildersGk(BigDecimal buildersGk) {
        this.buildersGk = buildersGk;
    }

    public BigDecimal getBuildersGkGrn() {
        return buildersGkGrn;
    }

    public void setBuildersGkGrn(BigDecimal buildersGkGrn) {
        this.buildersGkGrn = buildersGkGrn;
    }

    public BigDecimal getLeakGrn() {
        return leakGrn;
    }

    public void setLeakGrn(BigDecimal leakGrn) {
        this.leakGrn = leakGrn;
    }

    public BigDecimal getSealGrn() {
        return sealGrn;
    }

    public void setSealGrn(BigDecimal sealGrn) {
        this.sealGrn = sealGrn;
    }

    public BigDecimal getPercent3Grn() {
        return percent3Grn;
    }

    public void setPercent3Grn(BigDecimal percent3Grn) {
        this.percent3Grn = percent3Grn;
    }

    public BigDecimal getLossGrn() {
        return lossGrn;
    }

    public void setLossGrn(BigDecimal lossGrn) {
        this.lossGrn = lossGrn;
    }

    public BigDecimal getThermalEnergyGk() {
        return thermalEnergyGk;
    }

    public void setThermalEnergyGk(BigDecimal thermalEnergyGk) {
        this.thermalEnergyGk = thermalEnergyGk;
    }

    public BigDecimal getThermalEnergyGrn() {
        return thermalEnergyGrn;
    }

    public void setThermalEnergyGrn(BigDecimal thermalEnergyGrn) {
        this.thermalEnergyGrn = thermalEnergyGrn;
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
        if (!(object instanceof DocF1Enterprise)) {
            return false;
        }
        DocF1Enterprise other = (DocF1Enterprise) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocF1Enterprise[ code=" + code + " ]";
    }
    
}
