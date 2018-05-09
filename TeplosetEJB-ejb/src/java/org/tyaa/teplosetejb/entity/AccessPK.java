/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Embeddable
public class AccessPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    private int systemuser;
    @Basic(optional = false)
    @NotNull
    private int resource;

    public AccessPK() {
    }

    public AccessPK(int systemuser, int resource) {
        this.systemuser = systemuser;
        this.resource = resource;
    }

    public int getSystemuser() {
        return systemuser;
    }

    public void setSystemuser(int systemuser) {
        this.systemuser = systemuser;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) systemuser;
        hash += (int) resource;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessPK)) {
            return false;
        }
        AccessPK other = (AccessPK) object;
        if (this.systemuser != other.systemuser) {
            return false;
        }
        if (this.resource != other.resource) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.AccessPK[ systemuser=" + systemuser + ", resource=" + resource + " ]";
    }
    
}
