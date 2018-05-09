/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @NamedQuery(name = "Systemuser.findAll", query = "SELECT s FROM Systemuser s")})
public class Systemuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Size(max = 64)
    private String name;
    @Size(max = 256)
    private String userpassword;
    private Integer fontsize;
    private Integer autofill;
    private Integer autocallspr;
    private Integer autonextfield;
    @Size(max = 128)
    private String remark;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    @Size(max = 32)
    private String ibuser;
    @Size(max = 64)
    private String ibpassword;
    @Size(max = 16)
    private String ibrole;
    @Basic(optional = false)
    @NotNull
    private int isenabled;
    @Lob
    @Size(max = 2147483647)
    private String userparams;
    @Size(max = 32)
    private String login;
    @Temporal(TemporalType.TIMESTAMP)
    private Date changed;
    private Integer hidden;
    private Integer isgroup;
    private Integer ingroup;
    private Integer defaultsaldokind;
    @Size(max = 64)
    @Column(name = "TASK_EXECUTE_PARAMS")
    private String taskExecuteParams;
    @Column(name = "LANGUAGE_CODE")
    private Integer languageCode;
    @OneToMany(mappedBy = "userCode")
    private List<SprUserGroup> sprUserGroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemuser1")
    private List<Access> accessList;

    public Systemuser() {
    }

    public Systemuser(Integer code) {
        this.code = code;
    }

    public Systemuser(Integer code, int isenabled) {
        this.code = code;
        this.isenabled = isenabled;
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

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getFontsize() {
        return fontsize;
    }

    public void setFontsize(Integer fontsize) {
        this.fontsize = fontsize;
    }

    public Integer getAutofill() {
        return autofill;
    }

    public void setAutofill(Integer autofill) {
        this.autofill = autofill;
    }

    public Integer getAutocallspr() {
        return autocallspr;
    }

    public void setAutocallspr(Integer autocallspr) {
        this.autocallspr = autocallspr;
    }

    public Integer getAutonextfield() {
        return autonextfield;
    }

    public void setAutonextfield(Integer autonextfield) {
        this.autonextfield = autonextfield;
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

    public String getIbuser() {
        return ibuser;
    }

    public void setIbuser(String ibuser) {
        this.ibuser = ibuser;
    }

    public String getIbpassword() {
        return ibpassword;
    }

    public void setIbpassword(String ibpassword) {
        this.ibpassword = ibpassword;
    }

    public String getIbrole() {
        return ibrole;
    }

    public void setIbrole(String ibrole) {
        this.ibrole = ibrole;
    }

    public int getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(int isenabled) {
        this.isenabled = isenabled;
    }

    public String getUserparams() {
        return userparams;
    }

    public void setUserparams(String userparams) {
        this.userparams = userparams;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getChanged() {
        return changed;
    }

    public void setChanged(Date changed) {
        this.changed = changed;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(Integer isgroup) {
        this.isgroup = isgroup;
    }

    public Integer getIngroup() {
        return ingroup;
    }

    public void setIngroup(Integer ingroup) {
        this.ingroup = ingroup;
    }

    public Integer getDefaultsaldokind() {
        return defaultsaldokind;
    }

    public void setDefaultsaldokind(Integer defaultsaldokind) {
        this.defaultsaldokind = defaultsaldokind;
    }

    public String getTaskExecuteParams() {
        return taskExecuteParams;
    }

    public void setTaskExecuteParams(String taskExecuteParams) {
        this.taskExecuteParams = taskExecuteParams;
    }

    public Integer getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Integer languageCode) {
        this.languageCode = languageCode;
    }

    public List<SprUserGroup> getSprUserGroupList() {
        return sprUserGroupList;
    }

    public void setSprUserGroupList(List<SprUserGroup> sprUserGroupList) {
        this.sprUserGroupList = sprUserGroupList;
    }

    public List<Access> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<Access> accessList) {
        this.accessList = accessList;
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
        if (!(object instanceof Systemuser)) {
            return false;
        }
        Systemuser other = (Systemuser) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Systemuser[ code=" + code + " ]";
    }
    
}
