/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "SPR_STREET_BSS")
@NamedQueries({
    @NamedQuery(name = "SprStreetBss.findAll", query = "SELECT s FROM SprStreetBss s")})
public class SprStreetBss implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    private String kodul;
    @Size(max = 36)
    private String ulic;

    public SprStreetBss() {
    }

    public SprStreetBss(String kodul) {
        this.kodul = kodul;
    }

    public String getKodul() {
        return kodul;
    }

    public void setKodul(String kodul) {
        this.kodul = kodul;
    }

    public String getUlic() {
        return ulic;
    }

    public void setUlic(String ulic) {
        this.ulic = ulic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodul != null ? kodul.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprStreetBss)) {
            return false;
        }
        SprStreetBss other = (SprStreetBss) object;
        if ((this.kodul == null && other.kodul != null) || (this.kodul != null && !this.kodul.equals(other.kodul))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprStreetBss[ kodul=" + kodul + " ]";
    }
    
}
