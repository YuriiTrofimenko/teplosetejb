/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SELECT_METER_PIPE_VALUE_VIEW")
@NamedQueries({
    @NamedQuery(name = "SelectMeterPipeValueView.findAll", query = "SELECT s FROM SelectMeterPipeValueView s")})
public class SelectMeterPipeValueView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    @Column(name = "CODE_IN")
    @Id
    private Integer codeIn;
    private Integer pipecode;
    private Integer procdate;
    private Integer tt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal volume;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Temporal(TemporalType.DATE)
    private Date datetariff;
    private Integer takeincalc;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timetakeincalc;
    private Integer doccode;
    private Integer docpos;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    @Column(name = "IS_ADD_VOLUME")
    private Integer isAddVolume;
    @Column(name = "TYPE_VALUE")
    private Integer typeValue;
    private Integer metervaluecode;
    private BigDecimal beginvalue;
    private BigDecimal endvalue;
    private Integer metermethod;
    private Integer info;
    @Size(max = 80)
    @Column(name = "PROCDATE_NAME")
    private String procdateName;
    @Size(max = 64)
    private String name;
    private Integer code;
    private Integer doc;
    private Integer pos;
    private Integer state;
    @Column(name = "SOURCE_VOLUME")
    private BigDecimal sourceVolume;
    private BigDecimal kf;
    private Integer edizm;
    @Column(name = "IS_ARENDA_VOLUME")
    private Integer isArendaVolume;

    public SelectMeterPipeValueView() {
    }

    public Date getLastuserchange() {
        return lastuserchange;
    }

    public void setLastuserchange(Date lastuserchange) {
        this.lastuserchange = lastuserchange;
    }

    public Integer getCodeIn() {
        return codeIn;
    }

    public void setCodeIn(Integer codeIn) {
        this.codeIn = codeIn;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public Integer getTt() {
        return tt;
    }

    public void setTt(Integer tt) {
        this.tt = tt;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getDatetariff() {
        return datetariff;
    }

    public void setDatetariff(Date datetariff) {
        this.datetariff = datetariff;
    }

    public Integer getTakeincalc() {
        return takeincalc;
    }

    public void setTakeincalc(Integer takeincalc) {
        this.takeincalc = takeincalc;
    }

    public Date getTimetakeincalc() {
        return timetakeincalc;
    }

    public void setTimetakeincalc(Date timetakeincalc) {
        this.timetakeincalc = timetakeincalc;
    }

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
    }

    public Date getCalcDatefrom() {
        return calcDatefrom;
    }

    public void setCalcDatefrom(Date calcDatefrom) {
        this.calcDatefrom = calcDatefrom;
    }

    public Date getCalcDatetill() {
        return calcDatetill;
    }

    public void setCalcDatetill(Date calcDatetill) {
        this.calcDatetill = calcDatetill;
    }

    public Integer getIsAddVolume() {
        return isAddVolume;
    }

    public void setIsAddVolume(Integer isAddVolume) {
        this.isAddVolume = isAddVolume;
    }

    public Integer getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Integer typeValue) {
        this.typeValue = typeValue;
    }

    public Integer getMetervaluecode() {
        return metervaluecode;
    }

    public void setMetervaluecode(Integer metervaluecode) {
        this.metervaluecode = metervaluecode;
    }

    public BigDecimal getBeginvalue() {
        return beginvalue;
    }

    public void setBeginvalue(BigDecimal beginvalue) {
        this.beginvalue = beginvalue;
    }

    public BigDecimal getEndvalue() {
        return endvalue;
    }

    public void setEndvalue(BigDecimal endvalue) {
        this.endvalue = endvalue;
    }

    public Integer getMetermethod() {
        return metermethod;
    }

    public void setMetermethod(Integer metermethod) {
        this.metermethod = metermethod;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public String getProcdateName() {
        return procdateName;
    }

    public void setProcdateName(String procdateName) {
        this.procdateName = procdateName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getDoc() {
        return doc;
    }

    public void setDoc(Integer doc) {
        this.doc = doc;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getSourceVolume() {
        return sourceVolume;
    }

    public void setSourceVolume(BigDecimal sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    public BigDecimal getKf() {
        return kf;
    }

    public void setKf(BigDecimal kf) {
        this.kf = kf;
    }

    public Integer getEdizm() {
        return edizm;
    }

    public void setEdizm(Integer edizm) {
        this.edizm = edizm;
    }

    public Integer getIsArendaVolume() {
        return isArendaVolume;
    }

    public void setIsArendaVolume(Integer isArendaVolume) {
        this.isArendaVolume = isArendaVolume;
    }
    
}
