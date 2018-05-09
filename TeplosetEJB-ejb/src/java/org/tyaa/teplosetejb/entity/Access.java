/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Access.findAll", query = "SELECT a FROM Access a")})
public class Access implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccessPK accessPK;
    @Basic(optional = false)
    @NotNull
    private int kind;
    @JoinColumn(name = "SYSTEMUSER", referencedColumnName = "CODE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Systemuser systemuser1;

    public Access() {
    }

    public Access(AccessPK accessPK) {
        this.accessPK = accessPK;
    }

    public Access(AccessPK accessPK, int kind) {
        this.accessPK = accessPK;
        this.kind = kind;
    }

    public Access(int systemuser, int resource) {
        this.accessPK = new AccessPK(systemuser, resource);
    }

    public AccessPK getAccessPK() {
        return accessPK;
    }

    public void setAccessPK(AccessPK accessPK) {
        this.accessPK = accessPK;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public Systemuser getSystemuser1() {
        return systemuser1;
    }

    public void setSystemuser1(Systemuser systemuser1) {
        this.systemuser1 = systemuser1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accessPK != null ? accessPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Access)) {
            return false;
        }
        Access other = (Access) object;
        if ((this.accessPK == null && other.accessPK != null) || (this.accessPK != null && !this.accessPK.equals(other.accessPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Access[ accessPK=" + accessPK + " ]";
    }
    
}
