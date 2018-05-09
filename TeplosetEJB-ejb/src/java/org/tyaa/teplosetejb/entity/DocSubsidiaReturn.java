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
@Table(name = "DOC_SUBSIDIA_RETURN")
@NamedQueries({
    @NamedQuery(name = "DocSubsidiaReturn.findAll", query = "SELECT d FROM DocSubsidiaReturn d")})
public class DocSubsidiaReturn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    private Integer firmcode;
    private Integer saldokind;
    @Size(max = 48)
    private String fio;
    @Column(name = "ID_RAJ")
    private Integer idRaj;
    @Column(name = "NP_CODE")
    private Integer npCode;
    @Size(max = 48)
    @Column(name = "NP_NAME")
    private String npName;
    @Size(max = 16)
    @Column(name = "CAT_V")
    private String catV;
    private Integer vulcod;
    @Size(max = 48)
    @Column(name = "NAME_V")
    private String nameV;
    @Size(max = 16)
    private String bld;
    @Size(max = 16)
    private String corp;
    @Size(max = 16)
    private String flat;
    @Size(max = 16)
    private String rash;
    private Integer numb;
    @Temporal(TemporalType.DATE)
    private Date dat1;
    @Temporal(TemporalType.DATE)
    private Date dat2;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NM_PAY")
    private BigDecimal nmPay;
    private BigDecimal p1;
    private BigDecimal p2;
    private BigDecimal p3;
    private BigDecimal p4;
    private BigDecimal p5;
    private BigDecimal p6;
    private BigDecimal p7;
    private BigDecimal p8;
    private BigDecimal sm1;
    private BigDecimal sm2;
    private BigDecimal sm3;
    private BigDecimal sm4;
    private BigDecimal sm5;
    private BigDecimal sm6;
    private BigDecimal sm7;
    private BigDecimal sm8;
    private BigDecimal sb1;
    private BigDecimal sb2;
    private BigDecimal sb3;
    private BigDecimal sb4;
    private BigDecimal sb5;
    private BigDecimal sb6;
    private BigDecimal sb7;
    private BigDecimal sb8;
    private BigDecimal ob1;
    private BigDecimal ob2;
    private BigDecimal ob3;
    private BigDecimal ob4;
    private BigDecimal ob5;
    private BigDecimal ob6;
    private BigDecimal ob7;
    private BigDecimal ob8;
    private BigDecimal summa;
    private Integer numm;
    private BigDecimal subs;
    private Integer kvt;
    @Column(name = "SUMM_SUBS")
    private BigDecimal summSubs;
    @Column(name = "SUMM_NACH")
    private BigDecimal summNach;
    @Column(name = "SUMM_SALDO")
    private BigDecimal summSaldo;
    @Column(name = "SUMM_RETURN")
    private BigDecimal summReturn;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocSubsidiaReturn> errDocSubsidiaReturnList;

    public DocSubsidiaReturn() {
    }

    public DocSubsidiaReturn(Integer code) {
        this.code = code;
    }

    public DocSubsidiaReturn(Integer code, int state) {
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

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getIdRaj() {
        return idRaj;
    }

    public void setIdRaj(Integer idRaj) {
        this.idRaj = idRaj;
    }

    public Integer getNpCode() {
        return npCode;
    }

    public void setNpCode(Integer npCode) {
        this.npCode = npCode;
    }

    public String getNpName() {
        return npName;
    }

    public void setNpName(String npName) {
        this.npName = npName;
    }

    public String getCatV() {
        return catV;
    }

    public void setCatV(String catV) {
        this.catV = catV;
    }

    public Integer getVulcod() {
        return vulcod;
    }

    public void setVulcod(Integer vulcod) {
        this.vulcod = vulcod;
    }

    public String getNameV() {
        return nameV;
    }

    public void setNameV(String nameV) {
        this.nameV = nameV;
    }

    public String getBld() {
        return bld;
    }

    public void setBld(String bld) {
        this.bld = bld;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getRash() {
        return rash;
    }

    public void setRash(String rash) {
        this.rash = rash;
    }

    public Integer getNumb() {
        return numb;
    }

    public void setNumb(Integer numb) {
        this.numb = numb;
    }

    public Date getDat1() {
        return dat1;
    }

    public void setDat1(Date dat1) {
        this.dat1 = dat1;
    }

    public Date getDat2() {
        return dat2;
    }

    public void setDat2(Date dat2) {
        this.dat2 = dat2;
    }

    public BigDecimal getNmPay() {
        return nmPay;
    }

    public void setNmPay(BigDecimal nmPay) {
        this.nmPay = nmPay;
    }

    public BigDecimal getP1() {
        return p1;
    }

    public void setP1(BigDecimal p1) {
        this.p1 = p1;
    }

    public BigDecimal getP2() {
        return p2;
    }

    public void setP2(BigDecimal p2) {
        this.p2 = p2;
    }

    public BigDecimal getP3() {
        return p3;
    }

    public void setP3(BigDecimal p3) {
        this.p3 = p3;
    }

    public BigDecimal getP4() {
        return p4;
    }

    public void setP4(BigDecimal p4) {
        this.p4 = p4;
    }

    public BigDecimal getP5() {
        return p5;
    }

    public void setP5(BigDecimal p5) {
        this.p5 = p5;
    }

    public BigDecimal getP6() {
        return p6;
    }

    public void setP6(BigDecimal p6) {
        this.p6 = p6;
    }

    public BigDecimal getP7() {
        return p7;
    }

    public void setP7(BigDecimal p7) {
        this.p7 = p7;
    }

    public BigDecimal getP8() {
        return p8;
    }

    public void setP8(BigDecimal p8) {
        this.p8 = p8;
    }

    public BigDecimal getSm1() {
        return sm1;
    }

    public void setSm1(BigDecimal sm1) {
        this.sm1 = sm1;
    }

    public BigDecimal getSm2() {
        return sm2;
    }

    public void setSm2(BigDecimal sm2) {
        this.sm2 = sm2;
    }

    public BigDecimal getSm3() {
        return sm3;
    }

    public void setSm3(BigDecimal sm3) {
        this.sm3 = sm3;
    }

    public BigDecimal getSm4() {
        return sm4;
    }

    public void setSm4(BigDecimal sm4) {
        this.sm4 = sm4;
    }

    public BigDecimal getSm5() {
        return sm5;
    }

    public void setSm5(BigDecimal sm5) {
        this.sm5 = sm5;
    }

    public BigDecimal getSm6() {
        return sm6;
    }

    public void setSm6(BigDecimal sm6) {
        this.sm6 = sm6;
    }

    public BigDecimal getSm7() {
        return sm7;
    }

    public void setSm7(BigDecimal sm7) {
        this.sm7 = sm7;
    }

    public BigDecimal getSm8() {
        return sm8;
    }

    public void setSm8(BigDecimal sm8) {
        this.sm8 = sm8;
    }

    public BigDecimal getSb1() {
        return sb1;
    }

    public void setSb1(BigDecimal sb1) {
        this.sb1 = sb1;
    }

    public BigDecimal getSb2() {
        return sb2;
    }

    public void setSb2(BigDecimal sb2) {
        this.sb2 = sb2;
    }

    public BigDecimal getSb3() {
        return sb3;
    }

    public void setSb3(BigDecimal sb3) {
        this.sb3 = sb3;
    }

    public BigDecimal getSb4() {
        return sb4;
    }

    public void setSb4(BigDecimal sb4) {
        this.sb4 = sb4;
    }

    public BigDecimal getSb5() {
        return sb5;
    }

    public void setSb5(BigDecimal sb5) {
        this.sb5 = sb5;
    }

    public BigDecimal getSb6() {
        return sb6;
    }

    public void setSb6(BigDecimal sb6) {
        this.sb6 = sb6;
    }

    public BigDecimal getSb7() {
        return sb7;
    }

    public void setSb7(BigDecimal sb7) {
        this.sb7 = sb7;
    }

    public BigDecimal getSb8() {
        return sb8;
    }

    public void setSb8(BigDecimal sb8) {
        this.sb8 = sb8;
    }

    public BigDecimal getOb1() {
        return ob1;
    }

    public void setOb1(BigDecimal ob1) {
        this.ob1 = ob1;
    }

    public BigDecimal getOb2() {
        return ob2;
    }

    public void setOb2(BigDecimal ob2) {
        this.ob2 = ob2;
    }

    public BigDecimal getOb3() {
        return ob3;
    }

    public void setOb3(BigDecimal ob3) {
        this.ob3 = ob3;
    }

    public BigDecimal getOb4() {
        return ob4;
    }

    public void setOb4(BigDecimal ob4) {
        this.ob4 = ob4;
    }

    public BigDecimal getOb5() {
        return ob5;
    }

    public void setOb5(BigDecimal ob5) {
        this.ob5 = ob5;
    }

    public BigDecimal getOb6() {
        return ob6;
    }

    public void setOb6(BigDecimal ob6) {
        this.ob6 = ob6;
    }

    public BigDecimal getOb7() {
        return ob7;
    }

    public void setOb7(BigDecimal ob7) {
        this.ob7 = ob7;
    }

    public BigDecimal getOb8() {
        return ob8;
    }

    public void setOb8(BigDecimal ob8) {
        this.ob8 = ob8;
    }

    public BigDecimal getSumma() {
        return summa;
    }

    public void setSumma(BigDecimal summa) {
        this.summa = summa;
    }

    public Integer getNumm() {
        return numm;
    }

    public void setNumm(Integer numm) {
        this.numm = numm;
    }

    public BigDecimal getSubs() {
        return subs;
    }

    public void setSubs(BigDecimal subs) {
        this.subs = subs;
    }

    public Integer getKvt() {
        return kvt;
    }

    public void setKvt(Integer kvt) {
        this.kvt = kvt;
    }

    public BigDecimal getSummSubs() {
        return summSubs;
    }

    public void setSummSubs(BigDecimal summSubs) {
        this.summSubs = summSubs;
    }

    public BigDecimal getSummNach() {
        return summNach;
    }

    public void setSummNach(BigDecimal summNach) {
        this.summNach = summNach;
    }

    public BigDecimal getSummSaldo() {
        return summSaldo;
    }

    public void setSummSaldo(BigDecimal summSaldo) {
        this.summSaldo = summSaldo;
    }

    public BigDecimal getSummReturn() {
        return summReturn;
    }

    public void setSummReturn(BigDecimal summReturn) {
        this.summReturn = summReturn;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocSubsidiaReturn> getErrDocSubsidiaReturnList() {
        return errDocSubsidiaReturnList;
    }

    public void setErrDocSubsidiaReturnList(List<ErrDocSubsidiaReturn> errDocSubsidiaReturnList) {
        this.errDocSubsidiaReturnList = errDocSubsidiaReturnList;
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
        if (!(object instanceof DocSubsidiaReturn)) {
            return false;
        }
        DocSubsidiaReturn other = (DocSubsidiaReturn) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocSubsidiaReturn[ code=" + code + " ]";
    }
    
}
