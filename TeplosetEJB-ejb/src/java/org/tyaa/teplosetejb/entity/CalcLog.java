/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
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
@Table(name = "CALC_LOG")
@NamedQueries({
    @NamedQuery(name = "CalcLog.findAll", query = "SELECT c FROM CalcLog c")})
public class CalcLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer procdate;
    private Integer todate;
    @Column(name = "PIPE_CODE")
    private Integer pipeCode;
    @Column(name = "PIPE_OBJECT")
    private BigInteger pipeObject;
    private Integer saldokind;
    private Integer msg;
    @Size(max = 128)
    private String remark;
    private Integer runcode;
    @Column(name = "PIPE_OWNERCODE")
    private Integer pipeOwnercode;

    public CalcLog() {
    }

    public CalcLog(Integer code) {
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

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public Integer getPipeCode() {
        return pipeCode;
    }

    public void setPipeCode(Integer pipeCode) {
        this.pipeCode = pipeCode;
    }

    public BigInteger getPipeObject() {
        return pipeObject;
    }

    public void setPipeObject(BigInteger pipeObject) {
        this.pipeObject = pipeObject;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
    }

    public Integer getMsg() {
        return msg;
    }

    public void setMsg(Integer msg) {
        this.msg = msg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getRuncode() {
        return runcode;
    }

    public void setRuncode(Integer runcode) {
        this.runcode = runcode;
    }

    public Integer getPipeOwnercode() {
        return pipeOwnercode;
    }

    public void setPipeOwnercode(Integer pipeOwnercode) {
        this.pipeOwnercode = pipeOwnercode;
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
        if (!(object instanceof CalcLog)) {
            return false;
        }
        CalcLog other = (CalcLog) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcLog[ code=" + code + " ]";
    }
    
}
