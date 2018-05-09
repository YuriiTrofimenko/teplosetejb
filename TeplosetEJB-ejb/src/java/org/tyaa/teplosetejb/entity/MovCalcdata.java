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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "MOV$_CALCDATA")
@NamedQueries({
    @NamedQuery(name = "MovCalcdata.findAll", query = "SELECT m FROM MovCalcdata m")})
public class MovCalcdata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTH_DATE")
    @Temporal(TemporalType.DATE)
    private Date monthDate;
    @Column(name = "CALC_DATE")
    @Temporal(TemporalType.DATE)
    private Date calcDate;
    private Integer procdate;
    @Column(name = "ID$")
    private Integer id;

    public MovCalcdata() {
    }

    public MovCalcdata(Date monthDate) {
        this.monthDate = monthDate;
    }

    public Date getMonthDate() {
        return monthDate;
    }

    public void setMonthDate(Date monthDate) {
        this.monthDate = monthDate;
    }

    public Date getCalcDate() {
        return calcDate;
    }

    public void setCalcDate(Date calcDate) {
        this.calcDate = calcDate;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monthDate != null ? monthDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovCalcdata)) {
            return false;
        }
        MovCalcdata other = (MovCalcdata) object;
        if ((this.monthDate == null && other.monthDate != null) || (this.monthDate != null && !this.monthDate.equals(other.monthDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.MovCalcdata[ monthDate=" + monthDate + " ]";
    }
    
}
