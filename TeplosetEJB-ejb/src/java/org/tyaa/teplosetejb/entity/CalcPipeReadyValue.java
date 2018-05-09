/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "CALC_PIPE_READY_VALUE")
@NamedQueries({
    @NamedQuery(name = "CalcPipeReadyValue.findAll", query = "SELECT c FROM CalcPipeReadyValue c")})
public class CalcPipeReadyValue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    @Column(name = "DOC_PROCDATE")
    private Short docProcdate;
    @Column(name = "CALC_PROCDATE")
    private Integer calcProcdate;
    @Basic(optional = false)
    @NotNull
    private int tt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "READY_VALUE")
    private BigDecimal readyValue;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Temporal(TemporalType.DATE)
    private Date datetariff;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    private Integer calcruncode;

    public CalcPipeReadyValue() {
    }

    public CalcPipeReadyValue(Integer code) {
        this.code = code;
    }

    public CalcPipeReadyValue(Integer code, int pipecode, int tt) {
        this.code = code;
        this.pipecode = pipecode;
        this.tt = tt;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getPipecode() {
        return pipecode;
    }

    public void setPipecode(int pipecode) {
        this.pipecode = pipecode;
    }

    public Short getDocProcdate() {
        return docProcdate;
    }

    public void setDocProcdate(Short docProcdate) {
        this.docProcdate = docProcdate;
    }

    public Integer getCalcProcdate() {
        return calcProcdate;
    }

    public void setCalcProcdate(Integer calcProcdate) {
        this.calcProcdate = calcProcdate;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public BigDecimal getReadyValue() {
        return readyValue;
    }

    public void setReadyValue(BigDecimal readyValue) {
        this.readyValue = readyValue;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getDatetariff() {
        return datetariff;
    }

    public void setDatetariff(Date datetariff) {
        this.datetariff = datetariff;
    }

    public Date getCalcDatefrom() {
        return calcDatefrom;
    }

    public void setCalcDatefrom(Date calcDatefrom) {
        this.calcDatefrom = calcDatefrom;
    }

    public Date getCalcDatetill() {
        return calcDatetill;
    }

    public void setCalcDatetill(Date calcDatetill) {
        this.calcDatetill = calcDatetill;
    }

    public Integer getCalcruncode() {
        return calcruncode;
    }

    public void setCalcruncode(Integer calcruncode) {
        this.calcruncode = calcruncode;
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
        if (!(object instanceof CalcPipeReadyValue)) {
            return false;
        }
        CalcPipeReadyValue other = (CalcPipeReadyValue) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcPipeReadyValue[ code=" + code + " ]";
    }
    
}
