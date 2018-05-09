/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "H_SPR_GROUPHOUSE_LINE")
@NamedQueries({
    @NamedQuery(name = "HSprGrouphouseLine.findAll", query = "SELECT h FROM HSprGrouphouseLine h")})
public class HSprGrouphouseLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GROUPHOUSE_LINECODE")
    private int grouphouseLinecode;
    @Basic(optional = false)
    @NotNull
    private int grouphousecode;
    @Basic(optional = false)
    @NotNull
    private int housecode;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    @Size(max = 128)
    private String remark;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    private BigInteger rversion;
    private Integer hidden;

    public HSprGrouphouseLine() {
    }

    public HSprGrouphouseLine(Integer code) {
        this.code = code;
    }

    public HSprGrouphouseLine(Integer code, int grouphouseLinecode, int grouphousecode, int housecode) {
        this.code = code;
        this.grouphouseLinecode = grouphouseLinecode;
        this.grouphousecode = grouphousecode;
        this.housecode = housecode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getHProcdate() {
        return hProcdate;
    }

    public void setHProcdate(Integer hProcdate) {
        this.hProcdate = hProcdate;
    }

    public Integer getSetRversion() {
        return setRversion;
    }

    public void setSetRversion(Integer setRversion) {
        this.setRversion = setRversion;
    }

    public int getGrouphouseLinecode() {
        return grouphouseLinecode;
    }

    public void setGrouphouseLinecode(int grouphouseLinecode) {
        this.grouphouseLinecode = grouphouseLinecode;
    }

    public int getGrouphousecode() {
        return grouphousecode;
    }

    public void setGrouphousecode(int grouphousecode) {
        this.grouphousecode = grouphousecode;
    }

    public int getHousecode() {
        return housecode;
    }

    public void setHousecode(int housecode) {
        this.housecode = housecode;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSystemuser() {
        return systemuser;
    }

    public void setSystemuser(Integer systemuser) {
        this.systemuser = systemuser;
    }

    public Date getLastuserchange() {
        return lastuserchange;
    }

    public void setLastuserchange(Date lastuserchange) {
        this.lastuserchange = lastuserchange;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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
        if (!(object instanceof HSprGrouphouseLine)) {
            return false;
        }
        HSprGrouphouseLine other = (HSprGrouphouseLine) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HSprGrouphouseLine[ code=" + code + " ]";
    }
    
}
