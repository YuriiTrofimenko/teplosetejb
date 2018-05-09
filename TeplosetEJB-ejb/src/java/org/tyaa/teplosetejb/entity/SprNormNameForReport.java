/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
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
@Table(name = "SPR_NORM_NAME_FOR_REPORT")
@NamedQueries({
    @NamedQuery(name = "SprNormNameForReport.findAll", query = "SELECT s FROM SprNormNameForReport s")})
public class SprNormNameForReport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REPORT_CODE")
    private int reportCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NORM_CODE")
    private int normCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVICE_CODE")
    private int serviceCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDER_CODE")
    private int orderCode;

    public SprNormNameForReport() {
    }

    public SprNormNameForReport(Integer code) {
        this.code = code;
    }

    public SprNormNameForReport(Integer code, int reportCode, int normCode, String name, int serviceCode, int orderCode) {
        this.code = code;
        this.reportCode = reportCode;
        this.normCode = normCode;
        this.name = name;
        this.serviceCode = serviceCode;
        this.orderCode = orderCode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getReportCode() {
        return reportCode;
    }

    public void setReportCode(int reportCode) {
        this.reportCode = reportCode;
    }

    public int getNormCode() {
        return normCode;
    }

    public void setNormCode(int normCode) {
        this.normCode = normCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
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
        if (!(object instanceof SprNormNameForReport)) {
            return false;
        }
        SprNormNameForReport other = (SprNormNameForReport) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprNormNameForReport[ code=" + code + " ]";
    }
    
}
