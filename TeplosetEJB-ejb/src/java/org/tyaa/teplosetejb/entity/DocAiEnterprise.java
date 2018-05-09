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
@Table(name = "DOC_AI_ENTERPRISE")
@NamedQueries({
    @NamedQuery(name = "DocAiEnterprise.findAll", query = "SELECT d FROM DocAiEnterprise d")})
public class DocAiEnterprise implements Serializable {

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
    @Size(max = 128)
    private String remark;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMM_BUDGET")
    private BigDecimal summBudget;
    @Column(name = "SUMM_BUDGET_ARENDA")
    private BigDecimal summBudgetArenda;
    @Column(name = "SUMM_KOM_BIT")
    private BigDecimal summKomBit;
    @Column(name = "SUMM_INDUSTRIAL")
    private BigDecimal summIndustrial;
    @Column(name = "SUMM_LEAK")
    private BigDecimal summLeak;
    @Column(name = "SUMM_3_PERCENT")
    private BigDecimal summ3Percent;
    @Column(name = "SUMM_DAMAGES")
    private BigDecimal summDamages;
    @Column(name = "SUMM_BAD_DEBTS")
    private BigDecimal summBadDebts;
    @Column(name = "SUMM_RETURNS")
    private BigDecimal summReturns;
    @Column(name = "SUMM_RETURNS_BUDGET")
    private BigDecimal summReturnsBudget;
    @Column(name = "SUMM_RELIGIOUS")
    private BigDecimal summReligious;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocAiEnterprise() {
    }

    public DocAiEnterprise(Integer code) {
        this.code = code;
    }

    public DocAiEnterprise(Integer code, int state) {
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getSummBudget() {
        return summBudget;
    }

    public void setSummBudget(BigDecimal summBudget) {
        this.summBudget = summBudget;
    }

    public BigDecimal getSummBudgetArenda() {
        return summBudgetArenda;
    }

    public void setSummBudgetArenda(BigDecimal summBudgetArenda) {
        this.summBudgetArenda = summBudgetArenda;
    }

    public BigDecimal getSummKomBit() {
        return summKomBit;
    }

    public void setSummKomBit(BigDecimal summKomBit) {
        this.summKomBit = summKomBit;
    }

    public BigDecimal getSummIndustrial() {
        return summIndustrial;
    }

    public void setSummIndustrial(BigDecimal summIndustrial) {
        this.summIndustrial = summIndustrial;
    }

    public BigDecimal getSummLeak() {
        return summLeak;
    }

    public void setSummLeak(BigDecimal summLeak) {
        this.summLeak = summLeak;
    }

    public BigDecimal getSumm3Percent() {
        return summ3Percent;
    }

    public void setSumm3Percent(BigDecimal summ3Percent) {
        this.summ3Percent = summ3Percent;
    }

    public BigDecimal getSummDamages() {
        return summDamages;
    }

    public void setSummDamages(BigDecimal summDamages) {
        this.summDamages = summDamages;
    }

    public BigDecimal getSummBadDebts() {
        return summBadDebts;
    }

    public void setSummBadDebts(BigDecimal summBadDebts) {
        this.summBadDebts = summBadDebts;
    }

    public BigDecimal getSummReturns() {
        return summReturns;
    }

    public void setSummReturns(BigDecimal summReturns) {
        this.summReturns = summReturns;
    }

    public BigDecimal getSummReturnsBudget() {
        return summReturnsBudget;
    }

    public void setSummReturnsBudget(BigDecimal summReturnsBudget) {
        this.summReturnsBudget = summReturnsBudget;
    }

    public BigDecimal getSummReligious() {
        return summReligious;
    }

    public void setSummReligious(BigDecimal summReligious) {
        this.summReligious = summReligious;
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
        if (!(object instanceof DocAiEnterprise)) {
            return false;
        }
        DocAiEnterprise other = (DocAiEnterprise) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAiEnterprise[ code=" + code + " ]";
    }
    
}
