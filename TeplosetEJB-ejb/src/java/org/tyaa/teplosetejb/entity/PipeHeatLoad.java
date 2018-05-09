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

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "PIPE_HEAT_LOAD")
@NamedQueries({
    @NamedQuery(name = "PipeHeatLoad.findAll", query = "SELECT p FROM PipeHeatLoad p")})
public class PipeHeatLoad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    private Integer procdate;
    @Column(name = "CALC_PROCDATE_FROM")
    private Integer calcProcdateFrom;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HEAT_LOAD")
    private BigDecimal heatLoad;
    private Integer doccode;
    private Integer poscode;
    private Integer hidden;
    private BigInteger rversion;

    public PipeHeatLoad() {
    }

    public PipeHeatLoad(Integer code) {
        this.code = code;
    }

    public PipeHeatLoad(Integer code, int pipecode) {
        this.code = code;
        this.pipecode = pipecode;
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

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public Integer getCalcProcdateFrom() {
        return calcProcdateFrom;
    }

    public void setCalcProcdateFrom(Integer calcProcdateFrom) {
        this.calcProcdateFrom = calcProcdateFrom;
    }

    public BigDecimal getHeatLoad() {
        return heatLoad;
    }

    public void setHeatLoad(BigDecimal heatLoad) {
        this.heatLoad = heatLoad;
    }

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
    }

    public Integer getPoscode() {
        return poscode;
    }

    public void setPoscode(Integer poscode) {
        this.poscode = poscode;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
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
        if (!(object instanceof PipeHeatLoad)) {
            return false;
        }
        PipeHeatLoad other = (PipeHeatLoad) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.PipeHeatLoad[ code=" + code + " ]";
    }
    
}
