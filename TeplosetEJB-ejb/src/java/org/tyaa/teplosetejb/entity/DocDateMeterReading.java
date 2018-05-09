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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DOC_DATE_METER_READING")
@NamedQueries({
    @NamedQuery(name = "DocDateMeterReading.findAll", query = "SELECT d FROM DocDateMeterReading d")})
public class DocDateMeterReading implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer todate;
    private Integer housecode;
    @Column(name = "HOUSE_PIPECODE")
    private Integer housePipecode;
    @Column(name = "DATE_PREV_MONTH")
    @Temporal(TemporalType.DATE)
    private Date datePrevMonth;
    @Column(name = "DATE_CURRENT_MONTH")
    @Temporal(TemporalType.DATE)
    private Date dateCurrentMonth;
    @Column(name = "DATE_COUNT")
    private Integer dateCount;
    @Size(max = 128)
    private String remark;
    private Integer hidden;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocDateMeterReading> errDocDateMeterReadingList;

    public DocDateMeterReading() {
    }

    public DocDateMeterReading(Integer code) {
        this.code = code;
    }

    public DocDateMeterReading(Integer code, int state) {
        this.code = code;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public Integer getHousecode() {
        return housecode;
    }

    public void setHousecode(Integer housecode) {
        this.housecode = housecode;
    }

    public Integer getHousePipecode() {
        return housePipecode;
    }

    public void setHousePipecode(Integer housePipecode) {
        this.housePipecode = housePipecode;
    }

    public Date getDatePrevMonth() {
        return datePrevMonth;
    }

    public void setDatePrevMonth(Date datePrevMonth) {
        this.datePrevMonth = datePrevMonth;
    }

    public Date getDateCurrentMonth() {
        return dateCurrentMonth;
    }

    public void setDateCurrentMonth(Date dateCurrentMonth) {
        this.dateCurrentMonth = dateCurrentMonth;
    }

    public Integer getDateCount() {
        return dateCount;
    }

    public void setDateCount(Integer dateCount) {
        this.dateCount = dateCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocDateMeterReading> getErrDocDateMeterReadingList() {
        return errDocDateMeterReadingList;
    }

    public void setErrDocDateMeterReadingList(List<ErrDocDateMeterReading> errDocDateMeterReadingList) {
        this.errDocDateMeterReadingList = errDocDateMeterReadingList;
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
        if (!(object instanceof DocDateMeterReading)) {
            return false;
        }
        DocDateMeterReading other = (DocDateMeterReading) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocDateMeterReading[ code=" + code + " ]";
    }
    
}
