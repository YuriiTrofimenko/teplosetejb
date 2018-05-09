/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "SPR_SERVICE")
@NamedQueries({
    @NamedQuery(name = "SprService.findAll", query = "SELECT s FROM SprService s")})
public class SprService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String shifr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    private String name;
    @Size(max = 16)
    private String shortname;
    @Column(name = "NOT_CALC_LGOTA")
    private Integer notCalcLgota;
    @Size(max = 16)
    private String measure;
    private Integer uszncode;
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
    @Column(name = "H_NOT")
    private Integer hNot;
    @Column(name = "LINE_COLOR")
    private Integer lineColor;
    private Integer groupservice;
    @Column(name = "USE_HOSTNUMBER2")
    private Integer useHostnumber2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "service")
    private List<Pipe> pipeList;

    public SprService() {
    }

    public SprService(Integer code) {
        this.code = code;
    }

    public SprService(Integer code, String shifr, String name) {
        this.code = code;
        this.shifr = shifr;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public Integer getNotCalcLgota() {
        return notCalcLgota;
    }

    public void setNotCalcLgota(Integer notCalcLgota) {
        this.notCalcLgota = notCalcLgota;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public Integer getUszncode() {
        return uszncode;
    }

    public void setUszncode(Integer uszncode) {
        this.uszncode = uszncode;
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

    public Integer getHNot() {
        return hNot;
    }

    public void setHNot(Integer hNot) {
        this.hNot = hNot;
    }

    public Integer getLineColor() {
        return lineColor;
    }

    public void setLineColor(Integer lineColor) {
        this.lineColor = lineColor;
    }

    public Integer getGroupservice() {
        return groupservice;
    }

    public void setGroupservice(Integer groupservice) {
        this.groupservice = groupservice;
    }

    public Integer getUseHostnumber2() {
        return useHostnumber2;
    }

    public void setUseHostnumber2(Integer useHostnumber2) {
        this.useHostnumber2 = useHostnumber2;
    }

    public List<Pipe> getPipeList() {
        return pipeList;
    }

    public void setPipeList(List<Pipe> pipeList) {
        this.pipeList = pipeList;
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
        if (!(object instanceof SprService)) {
            return false;
        }
        SprService other = (SprService) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprService[ code=" + code + " ]";
    }
    
}
