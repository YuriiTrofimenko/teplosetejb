/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "DOC_VOLUME")
@NamedQueries({
    @NamedQuery(name = "DocVolume.findAll", query = "SELECT d FROM DocVolume d")})
public class DocVolume implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer firmcode;
    private Integer saldokind;
    @Column(name = "OBJECT_CODE")
    private BigInteger objectCode;
    private Integer service;
    private Integer pipecode;
    private Integer metercode;
    @Column(name = "TYPE_VALUE")
    private Integer typeValue;
    @Column(name = "USER_SET_VALUE")
    private Integer userSetValue;
    private Integer tt;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Column(name = "CHECKDATE_PREV")
    @Temporal(TemporalType.DATE)
    private Date checkdatePrev;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal beginwmvalue;
    private BigDecimal endwmvalue;
    private BigDecimal wmvolume;
    @Column(name = "ADD_VOLUME")
    private BigDecimal addVolume;
    private Integer info;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    @Size(max = 128)
    private String remark;
    private BigDecimal beginwmvalue2;
    private BigDecimal endwmvalue2;
    private BigDecimal wmvolume2;
    @Column(name = "ADD_VOLUME2")
    private BigDecimal addVolume2;
    private Integer info2;
    private BigDecimal beginwmvalue3;
    private BigDecimal endwmvalue3;
    private BigDecimal wmvolume3;
    @Column(name = "ADD_VOLUME3")
    private BigDecimal addVolume3;
    private Integer info3;
    private BigDecimal beginwmvalue4;
    private BigDecimal endwmvalue4;
    private BigDecimal wmvolume4;
    @Column(name = "ADD_VOLUME4")
    private BigDecimal addVolume4;
    private Integer info4;
    @Size(max = 16)
    @Column(name = "INPUT_OBJECT_SHIFR")
    private String inputObjectShifr;
    @Column(name = "INPUT_ENDWMVALUE")
    private BigDecimal inputEndwmvalue;
    @Column(name = "IS_IMPORT")
    private Integer isImport;
    @Column(name = "INPUT_CHECKDATE")
    @Temporal(TemporalType.DATE)
    private Date inputCheckdate;
    @Column(name = "READY_TARIFF")
    private BigDecimal readyTariff;
    private Integer calcprocdate;
    @Column(name = "INFO_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date infoDatefrom;
    @Column(name = "INFO_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date infoDatetill;
    @Column(name = "ADD_VOLUME_G1")
    private BigDecimal addVolumeG1;
    @Column(name = "ADD_VOLUME_G2")
    private BigDecimal addVolumeG2;
    @Column(name = "ADD_VOLUME_G3")
    private BigDecimal addVolumeG3;
    @Column(name = "ADD_VOLUME_G4")
    private BigDecimal addVolumeG4;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    private String phone;
    @Size(max = 48)
    private String phone2;
    @Column(name = "WATER_HEATER")
    private Integer waterHeater;
    @Temporal(TemporalType.DATE)
    private Date datetariff;
    @Column(name = "METHOD_OV")
    private Integer methodOv;
    @Column(name = "VOLUME_ARENDA_1")
    private BigDecimal volumeArenda1;
    @Column(name = "VOLUME_ARENDA_2")
    private BigDecimal volumeArenda2;
    @Column(name = "VOLUME_ARENDA_3")
    private BigDecimal volumeArenda3;
    @Column(name = "VOLUME_ARENDA_4")
    private BigDecimal volumeArenda4;
    @Column(name = "VOLUME_ARENDA_G1")
    private BigDecimal volumeArendaG1;
    @Column(name = "VOLUME_ARENDA_G2")
    private BigDecimal volumeArendaG2;
    @Column(name = "VOLUME_ARENDA_G3")
    private BigDecimal volumeArendaG3;
    @Column(name = "VOLUME_ARENDA_G4")
    private BigDecimal volumeArendaG4;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocVolume> errDocVolumeList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocVolume() {
    }

    public DocVolume(Integer code) {
        this.code = code;
    }

    public DocVolume(Integer code, int state) {
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

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
    }

    public BigInteger getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(BigInteger objectCode) {
        this.objectCode = objectCode;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getMetercode() {
        return metercode;
    }

    public void setMetercode(Integer metercode) {
        this.metercode = metercode;
    }

    public Integer getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Integer typeValue) {
        this.typeValue = typeValue;
    }

    public Integer getUserSetValue() {
        return userSetValue;
    }

    public void setUserSetValue(Integer userSetValue) {
        this.userSetValue = userSetValue;
    }

    public Integer getTt() {
        return tt;
    }

    public void setTt(Integer tt) {
        this.tt = tt;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getCheckdatePrev() {
        return checkdatePrev;
    }

    public void setCheckdatePrev(Date checkdatePrev) {
        this.checkdatePrev = checkdatePrev;
    }

    public BigDecimal getBeginwmvalue() {
        return beginwmvalue;
    }

    public void setBeginwmvalue(BigDecimal beginwmvalue) {
        this.beginwmvalue = beginwmvalue;
    }

    public BigDecimal getEndwmvalue() {
        return endwmvalue;
    }

    public void setEndwmvalue(BigDecimal endwmvalue) {
        this.endwmvalue = endwmvalue;
    }

    public BigDecimal getWmvolume() {
        return wmvolume;
    }

    public void setWmvolume(BigDecimal wmvolume) {
        this.wmvolume = wmvolume;
    }

    public BigDecimal getAddVolume() {
        return addVolume;
    }

    public void setAddVolume(BigDecimal addVolume) {
        this.addVolume = addVolume;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getBeginwmvalue2() {
        return beginwmvalue2;
    }

    public void setBeginwmvalue2(BigDecimal beginwmvalue2) {
        this.beginwmvalue2 = beginwmvalue2;
    }

    public BigDecimal getEndwmvalue2() {
        return endwmvalue2;
    }

    public void setEndwmvalue2(BigDecimal endwmvalue2) {
        this.endwmvalue2 = endwmvalue2;
    }

    public BigDecimal getWmvolume2() {
        return wmvolume2;
    }

    public void setWmvolume2(BigDecimal wmvolume2) {
        this.wmvolume2 = wmvolume2;
    }

    public BigDecimal getAddVolume2() {
        return addVolume2;
    }

    public void setAddVolume2(BigDecimal addVolume2) {
        this.addVolume2 = addVolume2;
    }

    public Integer getInfo2() {
        return info2;
    }

    public void setInfo2(Integer info2) {
        this.info2 = info2;
    }

    public BigDecimal getBeginwmvalue3() {
        return beginwmvalue3;
    }

    public void setBeginwmvalue3(BigDecimal beginwmvalue3) {
        this.beginwmvalue3 = beginwmvalue3;
    }

    public BigDecimal getEndwmvalue3() {
        return endwmvalue3;
    }

    public void setEndwmvalue3(BigDecimal endwmvalue3) {
        this.endwmvalue3 = endwmvalue3;
    }

    public BigDecimal getWmvolume3() {
        return wmvolume3;
    }

    public void setWmvolume3(BigDecimal wmvolume3) {
        this.wmvolume3 = wmvolume3;
    }

    public BigDecimal getAddVolume3() {
        return addVolume3;
    }

    public void setAddVolume3(BigDecimal addVolume3) {
        this.addVolume3 = addVolume3;
    }

    public Integer getInfo3() {
        return info3;
    }

    public void setInfo3(Integer info3) {
        this.info3 = info3;
    }

    public BigDecimal getBeginwmvalue4() {
        return beginwmvalue4;
    }

    public void setBeginwmvalue4(BigDecimal beginwmvalue4) {
        this.beginwmvalue4 = beginwmvalue4;
    }

    public BigDecimal getEndwmvalue4() {
        return endwmvalue4;
    }

    public void setEndwmvalue4(BigDecimal endwmvalue4) {
        this.endwmvalue4 = endwmvalue4;
    }

    public BigDecimal getWmvolume4() {
        return wmvolume4;
    }

    public void setWmvolume4(BigDecimal wmvolume4) {
        this.wmvolume4 = wmvolume4;
    }

    public BigDecimal getAddVolume4() {
        return addVolume4;
    }

    public void setAddVolume4(BigDecimal addVolume4) {
        this.addVolume4 = addVolume4;
    }

    public Integer getInfo4() {
        return info4;
    }

    public void setInfo4(Integer info4) {
        this.info4 = info4;
    }

    public String getInputObjectShifr() {
        return inputObjectShifr;
    }

    public void setInputObjectShifr(String inputObjectShifr) {
        this.inputObjectShifr = inputObjectShifr;
    }

    public BigDecimal getInputEndwmvalue() {
        return inputEndwmvalue;
    }

    public void setInputEndwmvalue(BigDecimal inputEndwmvalue) {
        this.inputEndwmvalue = inputEndwmvalue;
    }

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    public Date getInputCheckdate() {
        return inputCheckdate;
    }

    public void setInputCheckdate(Date inputCheckdate) {
        this.inputCheckdate = inputCheckdate;
    }

    public BigDecimal getReadyTariff() {
        return readyTariff;
    }

    public void setReadyTariff(BigDecimal readyTariff) {
        this.readyTariff = readyTariff;
    }

    public Integer getCalcprocdate() {
        return calcprocdate;
    }

    public void setCalcprocdate(Integer calcprocdate) {
        this.calcprocdate = calcprocdate;
    }

    public Date getInfoDatefrom() {
        return infoDatefrom;
    }

    public void setInfoDatefrom(Date infoDatefrom) {
        this.infoDatefrom = infoDatefrom;
    }

    public Date getInfoDatetill() {
        return infoDatetill;
    }

    public void setInfoDatetill(Date infoDatetill) {
        this.infoDatetill = infoDatetill;
    }

    public BigDecimal getAddVolumeG1() {
        return addVolumeG1;
    }

    public void setAddVolumeG1(BigDecimal addVolumeG1) {
        this.addVolumeG1 = addVolumeG1;
    }

    public BigDecimal getAddVolumeG2() {
        return addVolumeG2;
    }

    public void setAddVolumeG2(BigDecimal addVolumeG2) {
        this.addVolumeG2 = addVolumeG2;
    }

    public BigDecimal getAddVolumeG3() {
        return addVolumeG3;
    }

    public void setAddVolumeG3(BigDecimal addVolumeG3) {
        this.addVolumeG3 = addVolumeG3;
    }

    public BigDecimal getAddVolumeG4() {
        return addVolumeG4;
    }

    public void setAddVolumeG4(BigDecimal addVolumeG4) {
        this.addVolumeG4 = addVolumeG4;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Integer getWaterHeater() {
        return waterHeater;
    }

    public void setWaterHeater(Integer waterHeater) {
        this.waterHeater = waterHeater;
    }

    public Date getDatetariff() {
        return datetariff;
    }

    public void setDatetariff(Date datetariff) {
        this.datetariff = datetariff;
    }

    public Integer getMethodOv() {
        return methodOv;
    }

    public void setMethodOv(Integer methodOv) {
        this.methodOv = methodOv;
    }

    public BigDecimal getVolumeArenda1() {
        return volumeArenda1;
    }

    public void setVolumeArenda1(BigDecimal volumeArenda1) {
        this.volumeArenda1 = volumeArenda1;
    }

    public BigDecimal getVolumeArenda2() {
        return volumeArenda2;
    }

    public void setVolumeArenda2(BigDecimal volumeArenda2) {
        this.volumeArenda2 = volumeArenda2;
    }

    public BigDecimal getVolumeArenda3() {
        return volumeArenda3;
    }

    public void setVolumeArenda3(BigDecimal volumeArenda3) {
        this.volumeArenda3 = volumeArenda3;
    }

    public BigDecimal getVolumeArenda4() {
        return volumeArenda4;
    }

    public void setVolumeArenda4(BigDecimal volumeArenda4) {
        this.volumeArenda4 = volumeArenda4;
    }

    public BigDecimal getVolumeArendaG1() {
        return volumeArendaG1;
    }

    public void setVolumeArendaG1(BigDecimal volumeArendaG1) {
        this.volumeArendaG1 = volumeArendaG1;
    }

    public BigDecimal getVolumeArendaG2() {
        return volumeArendaG2;
    }

    public void setVolumeArendaG2(BigDecimal volumeArendaG2) {
        this.volumeArendaG2 = volumeArendaG2;
    }

    public BigDecimal getVolumeArendaG3() {
        return volumeArendaG3;
    }

    public void setVolumeArendaG3(BigDecimal volumeArendaG3) {
        this.volumeArendaG3 = volumeArendaG3;
    }

    public BigDecimal getVolumeArendaG4() {
        return volumeArendaG4;
    }

    public void setVolumeArendaG4(BigDecimal volumeArendaG4) {
        this.volumeArendaG4 = volumeArendaG4;
    }

    public List<ErrDocVolume> getErrDocVolumeList() {
        return errDocVolumeList;
    }

    public void setErrDocVolumeList(List<ErrDocVolume> errDocVolumeList) {
        this.errDocVolumeList = errDocVolumeList;
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
        if (!(object instanceof DocVolume)) {
            return false;
        }
        DocVolume other = (DocVolume) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocVolume[ code=" + code + " ]";
    }
    
}
