/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DOC_REFERENCE_DATA_LINE")
@NamedQueries({
    @NamedQuery(name = "DocReferenceDataLine.findAll", query = "SELECT d FROM DocReferenceDataLine d")})
public class DocReferenceDataLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int pos;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Size(max = 48)
    @Column(name = "LINE_NAME_L1")
    private String lineNameL1;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LINE_SUMM_L1")
    private BigDecimal lineSummL1;
    @Column(name = "LINE_SUMM_L2")
    private BigDecimal lineSummL2;
    @Column(name = "LINE_SUMM_L3")
    private BigDecimal lineSummL3;
    @Size(max = 48)
    @Column(name = "LINE_NAME_R1")
    private String lineNameR1;
    @Column(name = "LINE_SUMM_R1")
    private BigDecimal lineSummR1;
    @Column(name = "LINE_SUMM_R2")
    private BigDecimal lineSummR2;
    @Column(name = "LINE_SUMM_R3")
    private BigDecimal lineSummR3;
    @Column(name = "GROUP_FOR_REPORT")
    private Integer groupForReport;
    @Column(name = "GROUP_FOR_REPORT_2")
    private Integer groupForReport2;
    @Size(max = 16)
    @Column(name = "SERVICE_N")
    private String serviceN;
    @Size(max = 48)
    @Column(name = "LINE_NAME")
    private String lineName;
    @Size(max = 256)
    @Column(name = "LINE_TXT")
    private String lineTxt;
    @Size(max = 48)
    @Column(name = "CEIL_NAME")
    private String ceilName;
    @Size(max = 16)
    @Column(name = "CEIL_10")
    private String ceil10;
    @Size(max = 16)
    @Column(name = "CEIL_11")
    private String ceil11;
    @Size(max = 16)
    @Column(name = "CEIL_12")
    private String ceil12;
    @Size(max = 16)
    @Column(name = "CEIL_13")
    private String ceil13;
    @Size(max = 16)
    @Column(name = "CEIL_14")
    private String ceil14;
    @Size(max = 16)
    @Column(name = "CEIL_15")
    private String ceil15;
    @Size(max = 16)
    @Column(name = "CEIL_16")
    private String ceil16;
    @Size(max = 16)
    @Column(name = "CEIL_17")
    private String ceil17;
    @Size(max = 16)
    @Column(name = "CEIL_18")
    private String ceil18;
    @Size(max = 16)
    @Column(name = "CEIL_19")
    private String ceil19;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocReferenceDataLine() {
    }

    public DocReferenceDataLine(Integer code) {
        this.code = code;
    }

    public DocReferenceDataLine(Integer code, int pos, int state) {
        this.code = code;
        this.pos = pos;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getLineNameL1() {
        return lineNameL1;
    }

    public void setLineNameL1(String lineNameL1) {
        this.lineNameL1 = lineNameL1;
    }

    public BigDecimal getLineSummL1() {
        return lineSummL1;
    }

    public void setLineSummL1(BigDecimal lineSummL1) {
        this.lineSummL1 = lineSummL1;
    }

    public BigDecimal getLineSummL2() {
        return lineSummL2;
    }

    public void setLineSummL2(BigDecimal lineSummL2) {
        this.lineSummL2 = lineSummL2;
    }

    public BigDecimal getLineSummL3() {
        return lineSummL3;
    }

    public void setLineSummL3(BigDecimal lineSummL3) {
        this.lineSummL3 = lineSummL3;
    }

    public String getLineNameR1() {
        return lineNameR1;
    }

    public void setLineNameR1(String lineNameR1) {
        this.lineNameR1 = lineNameR1;
    }

    public BigDecimal getLineSummR1() {
        return lineSummR1;
    }

    public void setLineSummR1(BigDecimal lineSummR1) {
        this.lineSummR1 = lineSummR1;
    }

    public BigDecimal getLineSummR2() {
        return lineSummR2;
    }

    public void setLineSummR2(BigDecimal lineSummR2) {
        this.lineSummR2 = lineSummR2;
    }

    public BigDecimal getLineSummR3() {
        return lineSummR3;
    }

    public void setLineSummR3(BigDecimal lineSummR3) {
        this.lineSummR3 = lineSummR3;
    }

    public Integer getGroupForReport() {
        return groupForReport;
    }

    public void setGroupForReport(Integer groupForReport) {
        this.groupForReport = groupForReport;
    }

    public Integer getGroupForReport2() {
        return groupForReport2;
    }

    public void setGroupForReport2(Integer groupForReport2) {
        this.groupForReport2 = groupForReport2;
    }

    public String getServiceN() {
        return serviceN;
    }

    public void setServiceN(String serviceN) {
        this.serviceN = serviceN;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineTxt() {
        return lineTxt;
    }

    public void setLineTxt(String lineTxt) {
        this.lineTxt = lineTxt;
    }

    public String getCeilName() {
        return ceilName;
    }

    public void setCeilName(String ceilName) {
        this.ceilName = ceilName;
    }

    public String getCeil10() {
        return ceil10;
    }

    public void setCeil10(String ceil10) {
        this.ceil10 = ceil10;
    }

    public String getCeil11() {
        return ceil11;
    }

    public void setCeil11(String ceil11) {
        this.ceil11 = ceil11;
    }

    public String getCeil12() {
        return ceil12;
    }

    public void setCeil12(String ceil12) {
        this.ceil12 = ceil12;
    }

    public String getCeil13() {
        return ceil13;
    }

    public void setCeil13(String ceil13) {
        this.ceil13 = ceil13;
    }

    public String getCeil14() {
        return ceil14;
    }

    public void setCeil14(String ceil14) {
        this.ceil14 = ceil14;
    }

    public String getCeil15() {
        return ceil15;
    }

    public void setCeil15(String ceil15) {
        this.ceil15 = ceil15;
    }

    public String getCeil16() {
        return ceil16;
    }

    public void setCeil16(String ceil16) {
        this.ceil16 = ceil16;
    }

    public String getCeil17() {
        return ceil17;
    }

    public void setCeil17(String ceil17) {
        this.ceil17 = ceil17;
    }

    public String getCeil18() {
        return ceil18;
    }

    public void setCeil18(String ceil18) {
        this.ceil18 = ceil18;
    }

    public String getCeil19() {
        return ceil19;
    }

    public void setCeil19(String ceil19) {
        this.ceil19 = ceil19;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
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
        if (!(object instanceof DocReferenceDataLine)) {
            return false;
        }
        DocReferenceDataLine other = (DocReferenceDataLine) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocReferenceDataLine[ code=" + code + " ]";
    }
    
}
