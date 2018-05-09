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
import javax.persistence.Lob;
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
@Table(name = "SYS_APP")
@NamedQueries({
    @NamedQuery(name = "SysApp.findAll", query = "SELECT s FROM SysApp s")})
public class SysApp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "APP_ID")
    private Integer appId;
    @Size(max = 16)
    @Column(name = "APP_SHIFR")
    private String appShifr;
    @Size(max = 32)
    @Column(name = "APP_SHORT_NAME")
    private String appShortName;
    @Size(max = 64)
    @Column(name = "APP_NAME")
    private String appName;
    @Size(max = 256)
    @Column(name = "APP_FULL_NAME")
    private String appFullName;
    @Lob
    @Column(name = "APP_ICO")
    private byte[] appIco;
    @Size(max = 16)
    @Column(name = "APP_VERSION")
    private String appVersion;

    public SysApp() {
    }

    public SysApp(Integer appId) {
        this.appId = appId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppShifr() {
        return appShifr;
    }

    public void setAppShifr(String appShifr) {
        this.appShifr = appShifr;
    }

    public String getAppShortName() {
        return appShortName;
    }

    public void setAppShortName(String appShortName) {
        this.appShortName = appShortName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppFullName() {
        return appFullName;
    }

    public void setAppFullName(String appFullName) {
        this.appFullName = appFullName;
    }

    public byte[] getAppIco() {
        return appIco;
    }

    public void setAppIco(byte[] appIco) {
        this.appIco = appIco;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appId != null ? appId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysApp)) {
            return false;
        }
        SysApp other = (SysApp) object;
        if ((this.appId == null && other.appId != null) || (this.appId != null && !this.appId.equals(other.appId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SysApp[ appId=" + appId + " ]";
    }
    
}
