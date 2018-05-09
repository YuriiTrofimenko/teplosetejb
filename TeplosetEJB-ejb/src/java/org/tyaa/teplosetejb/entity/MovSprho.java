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
@Table(name = "MOV_SPRHO")
@NamedQueries({
    @NamedQuery(name = "MovSprho.findAll", query = "SELECT m FROM MovSprho m")})
public class MovSprho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID$")
    private Integer id;
    private Integer nomer;
    private Integer ut;
    private Integer unom;
    @Size(max = 4)
    private String dom;
    @Size(max = 4)
    private String lit;
    private Integer kolkv;
    private Integer kolls;
    private Integer kolet;
    private Integer kolpd;
    private Integer kolme;
    private Integer kollg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal plo;
    private BigDecimal plp;
    private BigDecimal pll;
    private BigDecimal sumnac;
    private BigDecimal sumopl;
    private Integer shd;
    private Integer shu;
    private Integer shg;
    @Size(max = 10)
    private String uvid;
    private Integer pruth;
    @Size(max = 1)
    private String verbot;
    private Integer raj;
    @Size(max = 1)
    private String zet;
    @Column(name = "HOUSE_NEW")
    private Integer houseNew;

    public MovSprho() {
    }

    public MovSprho(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNomer() {
        return nomer;
    }

    public void setNomer(Integer nomer) {
        this.nomer = nomer;
    }

    public Integer getUt() {
        return ut;
    }

    public void setUt(Integer ut) {
        this.ut = ut;
    }

    public Integer getUnom() {
        return unom;
    }

    public void setUnom(Integer unom) {
        this.unom = unom;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getLit() {
        return lit;
    }

    public void setLit(String lit) {
        this.lit = lit;
    }

    public Integer getKolkv() {
        return kolkv;
    }

    public void setKolkv(Integer kolkv) {
        this.kolkv = kolkv;
    }

    public Integer getKolls() {
        return kolls;
    }

    public void setKolls(Integer kolls) {
        this.kolls = kolls;
    }

    public Integer getKolet() {
        return kolet;
    }

    public void setKolet(Integer kolet) {
        this.kolet = kolet;
    }

    public Integer getKolpd() {
        return kolpd;
    }

    public void setKolpd(Integer kolpd) {
        this.kolpd = kolpd;
    }

    public Integer getKolme() {
        return kolme;
    }

    public void setKolme(Integer kolme) {
        this.kolme = kolme;
    }

    public Integer getKollg() {
        return kollg;
    }

    public void setKollg(Integer kollg) {
        this.kollg = kollg;
    }

    public BigDecimal getPlo() {
        return plo;
    }

    public void setPlo(BigDecimal plo) {
        this.plo = plo;
    }

    public BigDecimal getPlp() {
        return plp;
    }

    public void setPlp(BigDecimal plp) {
        this.plp = plp;
    }

    public BigDecimal getPll() {
        return pll;
    }

    public void setPll(BigDecimal pll) {
        this.pll = pll;
    }

    public BigDecimal getSumnac() {
        return sumnac;
    }

    public void setSumnac(BigDecimal sumnac) {
        this.sumnac = sumnac;
    }

    public BigDecimal getSumopl() {
        return sumopl;
    }

    public void setSumopl(BigDecimal sumopl) {
        this.sumopl = sumopl;
    }

    public Integer getShd() {
        return shd;
    }

    public void setShd(Integer shd) {
        this.shd = shd;
    }

    public Integer getShu() {
        return shu;
    }

    public void setShu(Integer shu) {
        this.shu = shu;
    }

    public Integer getShg() {
        return shg;
    }

    public void setShg(Integer shg) {
        this.shg = shg;
    }

    public String getUvid() {
        return uvid;
    }

    public void setUvid(String uvid) {
        this.uvid = uvid;
    }

    public Integer getPruth() {
        return pruth;
    }

    public void setPruth(Integer pruth) {
        this.pruth = pruth;
    }

    public String getVerbot() {
        return verbot;
    }

    public void setVerbot(String verbot) {
        this.verbot = verbot;
    }

    public Integer getRaj() {
        return raj;
    }

    public void setRaj(Integer raj) {
        this.raj = raj;
    }

    public String getZet() {
        return zet;
    }

    public void setZet(String zet) {
        this.zet = zet;
    }

    public Integer getHouseNew() {
        return houseNew;
    }

    public void setHouseNew(Integer houseNew) {
        this.houseNew = houseNew;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovSprho)) {
            return false;
        }
        MovSprho other = (MovSprho) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.MovSprho[ id=" + id + " ]";
    }
    
}
