/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SPR_USZNTARIF")
@NamedQueries({
    @NamedQuery(name = "SprUszntarif.findAll", query = "SELECT s FROM SprUszntarif s")})
public class SprUszntarif implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SprUszntarifPK sprUszntarifPK;
    @Column(name = "TAR_CDPLG")
    private Integer tarCdplg;
    @Column(name = "TAR_SERV")
    private Integer tarServ;
    @Column(name = "TAR_DATEE")
    @Temporal(TemporalType.DATE)
    private Date tarDatee;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAR_COEF")
    private Double tarCoef;
    @Column(name = "TAR_COST")
    private Double tarCost;
    @Column(name = "TAR_UNIT")
    private Integer tarUnit;
    @Column(name = "TAR_METER")
    private Integer tarMeter;
    @Column(name = "TAR_NMBAS")
    private Double tarNmbas;
    @Column(name = "TAR_NMSUP")
    private Double tarNmsup;
    @Column(name = "TAR_NMUBS")
    private Double tarNmubs;
    @Column(name = "TAR_NMUSP")
    private Double tarNmusp;
    @Column(name = "TAR_NMUMX")
    private Double tarNmumx;
    @Column(name = "TAR_TPNMB")
    private Integer tarTpnmb;
    @Column(name = "TAR_TPNMS")
    private Integer tarTpnms;
    @Column(name = "TAR_TPUPL")
    private Integer tarTpupl;
    @Column(name = "TAR_PRIV")
    private Integer tarPriv;
    @Column(name = "TAR_NMUPL")
    private Integer tarNmupl;

    public SprUszntarif() {
    }

    public SprUszntarif(SprUszntarifPK sprUszntarifPK) {
        this.sprUszntarifPK = sprUszntarifPK;
    }

    public SprUszntarif(int tarCode, Date tarDateb, int codern) {
        this.sprUszntarifPK = new SprUszntarifPK(tarCode, tarDateb, codern);
    }

    public SprUszntarifPK getSprUszntarifPK() {
        return sprUszntarifPK;
    }

    public void setSprUszntarifPK(SprUszntarifPK sprUszntarifPK) {
        this.sprUszntarifPK = sprUszntarifPK;
    }

    public Integer getTarCdplg() {
        return tarCdplg;
    }

    public void setTarCdplg(Integer tarCdplg) {
        this.tarCdplg = tarCdplg;
    }

    public Integer getTarServ() {
        return tarServ;
    }

    public void setTarServ(Integer tarServ) {
        this.tarServ = tarServ;
    }

    public Date getTarDatee() {
        return tarDatee;
    }

    public void setTarDatee(Date tarDatee) {
        this.tarDatee = tarDatee;
    }

    public Double getTarCoef() {
        return tarCoef;
    }

    public void setTarCoef(Double tarCoef) {
        this.tarCoef = tarCoef;
    }

    public Double getTarCost() {
        return tarCost;
    }

    public void setTarCost(Double tarCost) {
        this.tarCost = tarCost;
    }

    public Integer getTarUnit() {
        return tarUnit;
    }

    public void setTarUnit(Integer tarUnit) {
        this.tarUnit = tarUnit;
    }

    public Integer getTarMeter() {
        return tarMeter;
    }

    public void setTarMeter(Integer tarMeter) {
        this.tarMeter = tarMeter;
    }

    public Double getTarNmbas() {
        return tarNmbas;
    }

    public void setTarNmbas(Double tarNmbas) {
        this.tarNmbas = tarNmbas;
    }

    public Double getTarNmsup() {
        return tarNmsup;
    }

    public void setTarNmsup(Double tarNmsup) {
        this.tarNmsup = tarNmsup;
    }

    public Double getTarNmubs() {
        return tarNmubs;
    }

    public void setTarNmubs(Double tarNmubs) {
        this.tarNmubs = tarNmubs;
    }

    public Double getTarNmusp() {
        return tarNmusp;
    }

    public void setTarNmusp(Double tarNmusp) {
        this.tarNmusp = tarNmusp;
    }

    public Double getTarNmumx() {
        return tarNmumx;
    }

    public void setTarNmumx(Double tarNmumx) {
        this.tarNmumx = tarNmumx;
    }

    public Integer getTarTpnmb() {
        return tarTpnmb;
    }

    public void setTarTpnmb(Integer tarTpnmb) {
        this.tarTpnmb = tarTpnmb;
    }

    public Integer getTarTpnms() {
        return tarTpnms;
    }

    public void setTarTpnms(Integer tarTpnms) {
        this.tarTpnms = tarTpnms;
    }

    public Integer getTarTpupl() {
        return tarTpupl;
    }

    public void setTarTpupl(Integer tarTpupl) {
        this.tarTpupl = tarTpupl;
    }

    public Integer getTarPriv() {
        return tarPriv;
    }

    public void setTarPriv(Integer tarPriv) {
        this.tarPriv = tarPriv;
    }

    public Integer getTarNmupl() {
        return tarNmupl;
    }

    public void setTarNmupl(Integer tarNmupl) {
        this.tarNmupl = tarNmupl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sprUszntarifPK != null ? sprUszntarifPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprUszntarif)) {
            return false;
        }
        SprUszntarif other = (SprUszntarif) object;
        if ((this.sprUszntarifPK == null && other.sprUszntarifPK != null) || (this.sprUszntarifPK != null && !this.sprUszntarifPK.equals(other.sprUszntarifPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprUszntarif[ sprUszntarifPK=" + sprUszntarifPK + " ]";
    }
    
}
