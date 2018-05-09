/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "KVIT_FOR_NAST")
@NamedQueries({
    @NamedQuery(name = "KvitForNast.findAll", query = "SELECT k FROM KvitForNast k")})
public class KvitForNast implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer procdate;
    private BigInteger nomer;
    @Size(max = 25)
    private String name;
    @Size(max = 4)
    private String utyp;
    @Size(max = 20)
    private String uname;
    @Size(max = 4)
    private String dom;
    @Size(max = 4)
    private String lit;
    private Integer nkv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal plp;
    private Integer men;
    private BigDecimal prclg;
    private BigDecimal pll;
    private Integer menl;
    private BigDecimal zpok;
    @Column(name = "NAC_OTOP")
    private BigDecimal nacOtop;
    @Column(name = "NAC_VODA")
    private BigDecimal nacVoda;
    @Column(name = "KORR_OTOP")
    private BigDecimal korrOtop;
    @Column(name = "KORR_VODA")
    private BigDecimal korrVoda;
    private BigDecimal razov;
    private BigDecimal dolg;
    @Size(max = 1)
    @Column(name = "VID_V")
    private String vidV;
    @Size(max = 1)
    @Column(name = "PR_GS")
    private String prGs;
    @Size(max = 1)
    @Column(name = "PR_AZET")
    private String prAzet;
    @Size(max = 1)
    @Column(name = "PR_TEPLOM")
    private String prTeplom;
    private BigDecimal gkal;
    @Column(name = "PL_HO")
    private BigDecimal plHo;
    @Column(name = "PP_SUMMA")
    private BigDecimal ppSumma;
    @Column(name = "PP_MES")
    private Integer ppMes;
    @Column(name = "PP_GOD")
    private Integer ppGod;
    @Column(name = "HOUSE_CODE")
    private Integer houseCode;
    @Column(name = "TURN_DT_1")
    private BigDecimal turnDt1;
    @Column(name = "TURN_DT_2")
    private BigDecimal turnDt2;

    public KvitForNast() {
    }

    public KvitForNast(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public BigInteger getNomer() {
        return nomer;
    }

    public void setNomer(BigInteger nomer) {
        this.nomer = nomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUtyp() {
        return utyp;
    }

    public void setUtyp(String utyp) {
        this.utyp = utyp;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
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

    public Integer getNkv() {
        return nkv;
    }

    public void setNkv(Integer nkv) {
        this.nkv = nkv;
    }

    public BigDecimal getPlp() {
        return plp;
    }

    public void setPlp(BigDecimal plp) {
        this.plp = plp;
    }

    public Integer getMen() {
        return men;
    }

    public void setMen(Integer men) {
        this.men = men;
    }

    public BigDecimal getPrclg() {
        return prclg;
    }

    public void setPrclg(BigDecimal prclg) {
        this.prclg = prclg;
    }

    public BigDecimal getPll() {
        return pll;
    }

    public void setPll(BigDecimal pll) {
        this.pll = pll;
    }

    public Integer getMenl() {
        return menl;
    }

    public void setMenl(Integer menl) {
        this.menl = menl;
    }

    public BigDecimal getZpok() {
        return zpok;
    }

    public void setZpok(BigDecimal zpok) {
        this.zpok = zpok;
    }

    public BigDecimal getNacOtop() {
        return nacOtop;
    }

    public void setNacOtop(BigDecimal nacOtop) {
        this.nacOtop = nacOtop;
    }

    public BigDecimal getNacVoda() {
        return nacVoda;
    }

    public void setNacVoda(BigDecimal nacVoda) {
        this.nacVoda = nacVoda;
    }

    public BigDecimal getKorrOtop() {
        return korrOtop;
    }

    public void setKorrOtop(BigDecimal korrOtop) {
        this.korrOtop = korrOtop;
    }

    public BigDecimal getKorrVoda() {
        return korrVoda;
    }

    public void setKorrVoda(BigDecimal korrVoda) {
        this.korrVoda = korrVoda;
    }

    public BigDecimal getRazov() {
        return razov;
    }

    public void setRazov(BigDecimal razov) {
        this.razov = razov;
    }

    public BigDecimal getDolg() {
        return dolg;
    }

    public void setDolg(BigDecimal dolg) {
        this.dolg = dolg;
    }

    public String getVidV() {
        return vidV;
    }

    public void setVidV(String vidV) {
        this.vidV = vidV;
    }

    public String getPrGs() {
        return prGs;
    }

    public void setPrGs(String prGs) {
        this.prGs = prGs;
    }

    public String getPrAzet() {
        return prAzet;
    }

    public void setPrAzet(String prAzet) {
        this.prAzet = prAzet;
    }

    public String getPrTeplom() {
        return prTeplom;
    }

    public void setPrTeplom(String prTeplom) {
        this.prTeplom = prTeplom;
    }

    public BigDecimal getGkal() {
        return gkal;
    }

    public void setGkal(BigDecimal gkal) {
        this.gkal = gkal;
    }

    public BigDecimal getPlHo() {
        return plHo;
    }

    public void setPlHo(BigDecimal plHo) {
        this.plHo = plHo;
    }

    public BigDecimal getPpSumma() {
        return ppSumma;
    }

    public void setPpSumma(BigDecimal ppSumma) {
        this.ppSumma = ppSumma;
    }

    public Integer getPpMes() {
        return ppMes;
    }

    public void setPpMes(Integer ppMes) {
        this.ppMes = ppMes;
    }

    public Integer getPpGod() {
        return ppGod;
    }

    public void setPpGod(Integer ppGod) {
        this.ppGod = ppGod;
    }

    public Integer getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(Integer houseCode) {
        this.houseCode = houseCode;
    }

    public BigDecimal getTurnDt1() {
        return turnDt1;
    }

    public void setTurnDt1(BigDecimal turnDt1) {
        this.turnDt1 = turnDt1;
    }

    public BigDecimal getTurnDt2() {
        return turnDt2;
    }

    public void setTurnDt2(BigDecimal turnDt2) {
        this.turnDt2 = turnDt2;
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
        if (!(object instanceof KvitForNast)) {
            return false;
        }
        KvitForNast other = (KvitForNast) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.KvitForNast[ code=" + code + " ]";
    }
    
}
