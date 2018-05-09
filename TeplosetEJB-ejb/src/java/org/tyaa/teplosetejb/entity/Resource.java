/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
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
    @NamedQuery(name = "Resource.findAll", query = "SELECT r FROM Resource r")})
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Size(max = 64)
    private String name;
    private Integer owner;
    private Integer iselement;
    private Integer taskid;
    private Integer sortorder;
    @Size(max = 8)
    private String shifr;
    private Integer showshifr;
    @Lob
    @Size(max = 2147483647)
    private String description;
    @Lob
    @Size(max = 2147483647)
    private String data;
    @Lob
    @Size(max = 2147483647)
    private String params;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    @Size(max = 48)
    @Column(name = "HELP_FILE")
    private String helpFile;
    @Column(name = "HELP_CONTEXT")
    private Integer helpContext;
    private Integer dockind;
    @Column(name = "IS_HIDDEN")
    private Integer isHidden;

    public Resource() {
    }

    public Resource(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getIselement() {
        return iselement;
    }

    public void setIselement(Integer iselement) {
        this.iselement = iselement;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }

    public Integer getShowshifr() {
        return showshifr;
    }

    public void setShowshifr(Integer showshifr) {
        this.showshifr = showshifr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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

    public String getHelpFile() {
        return helpFile;
    }

    public void setHelpFile(String helpFile) {
        this.helpFile = helpFile;
    }

    public Integer getHelpContext() {
        return helpContext;
    }

    public void setHelpContext(Integer helpContext) {
        this.helpContext = helpContext;
    }

    public Integer getDockind() {
        return dockind;
    }

    public void setDockind(Integer dockind) {
        this.dockind = dockind;
    }

    public Integer getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Integer isHidden) {
        this.isHidden = isHidden;
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
        if (!(object instanceof Resource)) {
            return false;
        }
        Resource other = (Resource) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Resource[ code=" + code + " ]";
    }
    
}
