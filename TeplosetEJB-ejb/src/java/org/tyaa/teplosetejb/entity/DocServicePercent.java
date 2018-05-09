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
@Table(name = "DOC_SERVICE_PERCENT")
@NamedQueries({
    @NamedQuery(name = "DocServicePercent.findAll", query = "SELECT d FROM DocServicePercent d")})
public class DocServicePercent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMM_ALL")
    private BigDecimal summAll;
    @Column(name = "NACH_SUMM_W")
    private BigDecimal nachSummW;
    @Column(name = "RECALC_SUMM_W")
    private BigDecimal recalcSummW;
    @Column(name = "KORR_SUMM_W")
    private BigDecimal korrSummW;
    @Column(name = "NACH_SUMM")
    private BigDecimal nachSumm;
    @Column(name = "RECALC_SUMM")
    private BigDecimal recalcSumm;
    @Column(name = "KORR_SUMM")
    private BigDecimal korrSumm;
    @Size(max = 128)
    private String remark;
    private Integer procdatecode;
    @Column(name = "NACH_SUMM_H")
    private BigDecimal nachSummH;
    @Column(name = "RECALC_SUMM_H")
    private BigDecimal recalcSummH;
    @Column(name = "KORR_SUMM_H")
    private BigDecimal korrSummH;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocServicePercent> errDocServicePercentList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocServicePercent() {
    }

    public DocServicePercent(Integer code) {
        this.code = code;
    }

    public DocServicePercent(Integer code, int state, long accountcode) {
        this.code = code;
        this.state = state;
        this.accountcode = accountcode;
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

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public BigDecimal getSummAll() {
        return summAll;
    }

    public void setSummAll(BigDecimal summAll) {
        this.summAll = summAll;
    }

    public BigDecimal getNachSummW() {
        return nachSummW;
    }

    public void setNachSummW(BigDecimal nachSummW) {
        this.nachSummW = nachSummW;
    }

    public BigDecimal getRecalcSummW() {
        return recalcSummW;
    }

    public void setRecalcSummW(BigDecimal recalcSummW) {
        this.recalcSummW = recalcSummW;
    }

    public BigDecimal getKorrSummW() {
        return korrSummW;
    }

    public void setKorrSummW(BigDecimal korrSummW) {
        this.korrSummW = korrSummW;
    }

    public BigDecimal getNachSumm() {
        return nachSumm;
    }

    public void setNachSumm(BigDecimal nachSumm) {
        this.nachSumm = nachSumm;
    }

    public BigDecimal getRecalcSumm() {
        return recalcSumm;
    }

    public void setRecalcSumm(BigDecimal recalcSumm) {
        this.recalcSumm = recalcSumm;
    }

    public BigDecimal getKorrSumm() {
        return korrSumm;
    }

    public void setKorrSumm(BigDecimal korrSumm) {
        this.korrSumm = korrSumm;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getProcdatecode() {
        return procdatecode;
    }

    public void setProcdatecode(Integer procdatecode) {
        this.procdatecode = procdatecode;
    }

    public BigDecimal getNachSummH() {
        return nachSummH;
    }

    public void setNachSummH(BigDecimal nachSummH) {
        this.nachSummH = nachSummH;
    }

    public BigDecimal getRecalcSummH() {
        return recalcSummH;
    }

    public void setRecalcSummH(BigDecimal recalcSummH) {
        this.recalcSummH = recalcSummH;
    }

    public BigDecimal getKorrSummH() {
        return korrSummH;
    }

    public void setKorrSummH(BigDecimal korrSummH) {
        this.korrSummH = korrSummH;
    }

    public List<ErrDocServicePercent> getErrDocServicePercentList() {
        return errDocServicePercentList;
    }

    public void setErrDocServicePercentList(List<ErrDocServicePercent> errDocServicePercentList) {
        this.errDocServicePercentList = errDocServicePercentList;
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
        if (!(object instanceof DocServicePercent)) {
            return false;
        }
        DocServicePercent other = (DocServicePercent) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocServicePercent[ code=" + code + " ]";
    }
    
}
