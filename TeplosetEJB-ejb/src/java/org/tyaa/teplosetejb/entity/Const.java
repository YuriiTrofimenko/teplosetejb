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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Const.findAll", query = "SELECT c FROM Const c")})
public class Const implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer owner;
    private Short iselement;
    @Size(max = 64)
    private String name;
    @Size(max = 64)
    private String id;
    private Short kind;
    @Lob
    @Size(max = 2147483647)
    private String description;
    @Lob
    @Size(max = 2147483647)
    private String enumitems;
    @Lob
    @Size(max = 2147483647)
    private String enumvalues;
    @Size(max = 255)
    private String asstring;
    @Temporal(TemporalType.DATE)
    private Date asdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal asfloat;
    private Integer asinteger;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    @Lob
    @Size(max = 2147483647)
    private String asmemo;
    @Column(name = "ON_CONNECT_LOAD")
    private Integer onConnectLoad;
    private BigInteger rversion;

    public Const() {
    }

    public Const(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Short getIselement() {
        return iselement;
    }

    public void setIselement(Short iselement) {
        this.iselement = iselement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Short getKind() {
        return kind;
    }

    public void setKind(Short kind) {
        this.kind = kind;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnumitems() {
        return enumitems;
    }

    public void setEnumitems(String enumitems) {
        this.enumitems = enumitems;
    }

    public String getEnumvalues() {
        return enumvalues;
    }

    public void setEnumvalues(String enumvalues) {
        this.enumvalues = enumvalues;
    }

    public String getAsstring() {
        return asstring;
    }

    public void setAsstring(String asstring) {
        this.asstring = asstring;
    }

    public Date getAsdate() {
        return asdate;
    }

    public void setAsdate(Date asdate) {
        this.asdate = asdate;
    }

    public BigDecimal getAsfloat() {
        return asfloat;
    }

    public void setAsfloat(BigDecimal asfloat) {
        this.asfloat = asfloat;
    }

    public Integer getAsinteger() {
        return asinteger;
    }

    public void setAsinteger(Integer asinteger) {
        this.asinteger = asinteger;
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

    public String getAsmemo() {
        return asmemo;
    }

    public void setAsmemo(String asmemo) {
        this.asmemo = asmemo;
    }

    public Integer getOnConnectLoad() {
        return onConnectLoad;
    }

    public void setOnConnectLoad(Integer onConnectLoad) {
        this.onConnectLoad = onConnectLoad;
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
        if (!(object instanceof Const)) {
            return false;
        }
        Const other = (Const) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Const[ code=" + code + " ]";
    }
    
}
