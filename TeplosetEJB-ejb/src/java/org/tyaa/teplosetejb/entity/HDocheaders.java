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
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "H_DOCHEADERS")
@NamedQueries({
    @NamedQuery(name = "HDocheaders.findAll", query = "SELECT h FROM HDocheaders h")})
public class HDocheaders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "OPERATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date operationDate;
    @Basic(optional = false)
    @NotNull
    private int doccode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Column(name = "WORK_PROCDATE")
    private Integer workProcdate;
    @Basic(optional = false)
    @NotNull
    private int dockind;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Size(max = 64)
    private String stateremark;
    @Basic(optional = false)
    @NotNull
    private int docaccept;
    @Basic(optional = false)
    @NotNull
    private int canrollback;
    private Integer createuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Basic(optional = false)
    @NotNull
    private int systemuser;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    @Size(max = 128)
    private String remark;
    @Size(max = 32)
    private String docnumber;
    @Temporal(TemporalType.DATE)
    private Date docdate;
    @Temporal(TemporalType.DATE)
    private Date docdate1;
    private Integer poscount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal checksumm;
    private Integer statposcount;
    private Integer counter;
    private Integer sector;
    private Integer department;
    private Integer district;
    private Integer area;
    private Integer house;
    private BigInteger account;
    private Integer street;
    @Size(max = 16)
    @Column(name = "HOUSENUMBER_FROM")
    private String housenumberFrom;
    @Size(max = 16)
    @Column(name = "HOUSENUMBER_TILL")
    private String housenumberTill;
    @Column(name = "ODD_NUMBER")
    private Integer oddNumber;
    @Column(name = "EVEN_NUMBER")
    private Integer evenNumber;
    private Integer flatfrom;
    private Integer flattill;
    private Integer floorfrom;
    private Integer floortill;
    private Integer entrancefrom;
    private Integer entrancetill;
    private Integer inspector;
    private Integer paymenttype;
    private Integer payer;
    @Column(name = "BANK_ACCOUNT")
    private Integer bankAccount;
    private Integer firms;
    private Integer formnach;
    @Column(name = "FORMNACH_ADD")
    private Integer formnachAdd;
    private Integer weal;
    @Column(name = "WEAL_ADD")
    private Integer wealAdd;
    private Integer lgota;
    private Integer grouplgota;
    private Integer offbalance;
    private Integer algoritm;
    @Column(name = "VALUE_AS_INTEGER")
    private Integer valueAsInteger;
    @Column(name = "VALUE_AS_FLOAT")
    private Double valueAsFloat;
    @Size(max = 128)
    @Column(name = "VALUE_AS_STRING")
    private String valueAsString;
    @Column(name = "ONLY_CURRENT_PERIOD")
    private Integer onlyCurrentPeriod;
    @Column(name = "ONLY_RECALC_PERIOD")
    private Integer onlyRecalcPeriod;
    private Integer procdatefrom;
    private Integer procdatetill;
    @Column(name = "WM_NODE")
    private Integer wmNode;
    @Column(name = "GROUP_HOUSE")
    private Integer groupHouse;
    @Column(name = "GROUP_TARIFF")
    private Integer groupTariff;
    private Integer boilerhouse;
    private Integer saldokind;
    @Column(name = "DISCOUNT_PERCENT")
    private BigDecimal discountPercent;
    @Temporal(TemporalType.DATE)
    private Date datefrom;
    @Temporal(TemporalType.DATE)
    private Date datetill;
    private Integer service;
    private Integer heatpoint;
    @Basic(optional = false)
    @NotNull
    private int hidden;
    private Integer normcode;
    private BigInteger accountcode;
    @Column(name = "WATER_PERCENT")
    private BigDecimal waterPercent;
    @Column(name = "HEAT_PERCENT")
    private BigDecimal heatPercent;
    @Column(name = "WATER_PERCENT_CURR")
    private BigDecimal waterPercentCurr;
    @Column(name = "HEAT_PERCENT_CURR")
    private BigDecimal heatPercentCurr;
    @Column(name = "WATER_SUMM")
    private BigDecimal waterSumm;
    @Column(name = "HEAT_SUMM")
    private BigDecimal heatSumm;
    @Column(name = "DELTA_CHECKSUM")
    private BigDecimal deltaChecksum;
    @Column(name = "DELTA_POSCOUNT")
    private Integer deltaPoscount;
    @Column(name = "COMMISSION_SUMM")
    private BigDecimal commissionSumm;
    @Column(name = "TRANSFER_SUMM")
    private BigDecimal transferSumm;
    @Column(name = "DEL_TICKET_SUMM")
    private BigDecimal delTicketSumm;
    private Integer groupservice;
    @Size(max = 16)
    private String accountshifr;
    @Size(max = 32)
    private String f;
    @Size(max = 32)
    private String i;
    @Size(max = 32)
    private String o;
    @Size(max = 16)
    private String inn;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer flat;
    @Size(max = 16)
    private String flatlitera;
    private Integer accountfloor;
    private Integer entrance;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    private String phone;
    @Size(max = 48)
    private String phone2;
    private Integer disintegrate;
    private BigDecimal rooms;
    private Integer recalcprocdate;
    private Integer lodgers;
    private Integer leaved;
    @Column(name = "LEAVED_LGOTA")
    private Integer leavedLgota;
    @Size(max = 128)
    private String lgotadata;
    @Size(max = 128)
    @Column(name = "S1_S4")
    private String s1S4;
    @Column(name = "USER_RECALCPROCDATE")
    private Integer userRecalcprocdate;
    private Integer pipecode;
    @Column(name = "HEATPOINT_FROM")
    private Integer heatpointFrom;
    @Column(name = "PIPECODE_FROM")
    private Integer pipecodeFrom;
    @Column(name = "REMINDER_TYPE")
    private Integer reminderType;
    @Size(max = 128)
    private String fio;
    @Size(max = 64)
    @Column(name = "GROUPZHEK_DISTRICT_NAME")
    private String groupzhekDistrictName;
    @Size(max = 128)
    private String shortaddress;
    @Column(name = "WATER_HEATER")
    private Integer waterHeater;
    @Column(name = "PROPERTY_CODE")
    private Integer propertyCode;
    @Size(max = 64)
    private String warrant;
    @Size(max = 64)
    private String privatization;
    private Integer reason;
    private Integer dialog;
    @Column(name = "HOUSE_FROM")
    private Integer houseFrom;
    @Column(name = "VOLUME_1")
    private BigDecimal volume1;
    @Column(name = "VOLUME_ADD_1")
    private BigDecimal volumeAdd1;
    @Column(name = "CORNER_APARTMENT")
    private Integer cornerApartment;
    private Integer ownership;
    @Column(name = "DOCACCEPT_CODE")
    private Integer docacceptCode;
    @Column(name = "PARTNER_CODE")
    private Integer partnerCode;
    private BigDecimal temperature;
    @Column(name = "P_RECALCPROCDATE")
    private Integer pRecalcprocdate;
    @Column(name = "TIME_FROM")
    @Temporal(TemporalType.TIME)
    private Date timeFrom;
    @Column(name = "TIME_TILL")
    @Temporal(TemporalType.TIME)
    private Date timeTill;
    @Column(name = "METHOD_OV")
    private Integer methodOv;
    @Column(name = "BUDGET_TYPE")
    private Integer budgetType;

    public HDocheaders() {
    }

    public HDocheaders(Integer code) {
        this.code = code;
    }

    public HDocheaders(Integer code, int doccode, int procdate, int dockind, int state, int docaccept, int canrollback, int systemuser, Date lastuserchange, int hidden) {
        this.code = code;
        this.doccode = doccode;
        this.procdate = procdate;
        this.dockind = dockind;
        this.state = state;
        this.docaccept = docaccept;
        this.canrollback = canrollback;
        this.systemuser = systemuser;
        this.lastuserchange = lastuserchange;
        this.hidden = hidden;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public int getDoccode() {
        return doccode;
    }

    public void setDoccode(int doccode) {
        this.doccode = doccode;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public Integer getWorkProcdate() {
        return workProcdate;
    }

    public void setWorkProcdate(Integer workProcdate) {
        this.workProcdate = workProcdate;
    }

    public int getDockind() {
        return dockind;
    }

    public void setDockind(int dockind) {
        this.dockind = dockind;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateremark() {
        return stateremark;
    }

    public void setStateremark(String stateremark) {
        this.stateremark = stateremark;
    }

    public int getDocaccept() {
        return docaccept;
    }

    public void setDocaccept(int docaccept) {
        this.docaccept = docaccept;
    }

    public int getCanrollback() {
        return canrollback;
    }

    public void setCanrollback(int canrollback) {
        this.canrollback = canrollback;
    }

    public Integer getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getSystemuser() {
        return systemuser;
    }

    public void setSystemuser(int systemuser) {
        this.systemuser = systemuser;
    }

    public Date getLastuserchange() {
        return lastuserchange;
    }

    public void setLastuserchange(Date lastuserchange) {
        this.lastuserchange = lastuserchange;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDocnumber() {
        return docnumber;
    }

    public void setDocnumber(String docnumber) {
        this.docnumber = docnumber;
    }

    public Date getDocdate() {
        return docdate;
    }

    public void setDocdate(Date docdate) {
        this.docdate = docdate;
    }

    public Date getDocdate1() {
        return docdate1;
    }

    public void setDocdate1(Date docdate1) {
        this.docdate1 = docdate1;
    }

    public Integer getPoscount() {
        return poscount;
    }

    public void setPoscount(Integer poscount) {
        this.poscount = poscount;
    }

    public BigDecimal getChecksumm() {
        return checksumm;
    }

    public void setChecksumm(BigDecimal checksumm) {
        this.checksumm = checksumm;
    }

    public Integer getStatposcount() {
        return statposcount;
    }

    public void setStatposcount(Integer statposcount) {
        this.statposcount = statposcount;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public Integer getSector() {
        return sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public BigInteger getAccount() {
        return account;
    }

    public void setAccount(BigInteger account) {
        this.account = account;
    }

    public Integer getStreet() {
        return street;
    }

    public void setStreet(Integer street) {
        this.street = street;
    }

    public String getHousenumberFrom() {
        return housenumberFrom;
    }

    public void setHousenumberFrom(String housenumberFrom) {
        this.housenumberFrom = housenumberFrom;
    }

    public String getHousenumberTill() {
        return housenumberTill;
    }

    public void setHousenumberTill(String housenumberTill) {
        this.housenumberTill = housenumberTill;
    }

    public Integer getOddNumber() {
        return oddNumber;
    }

    public void setOddNumber(Integer oddNumber) {
        this.oddNumber = oddNumber;
    }

    public Integer getEvenNumber() {
        return evenNumber;
    }

    public void setEvenNumber(Integer evenNumber) {
        this.evenNumber = evenNumber;
    }

    public Integer getFlatfrom() {
        return flatfrom;
    }

    public void setFlatfrom(Integer flatfrom) {
        this.flatfrom = flatfrom;
    }

    public Integer getFlattill() {
        return flattill;
    }

    public void setFlattill(Integer flattill) {
        this.flattill = flattill;
    }

    public Integer getFloorfrom() {
        return floorfrom;
    }

    public void setFloorfrom(Integer floorfrom) {
        this.floorfrom = floorfrom;
    }

    public Integer getFloortill() {
        return floortill;
    }

    public void setFloortill(Integer floortill) {
        this.floortill = floortill;
    }

    public Integer getEntrancefrom() {
        return entrancefrom;
    }

    public void setEntrancefrom(Integer entrancefrom) {
        this.entrancefrom = entrancefrom;
    }

    public Integer getEntrancetill() {
        return entrancetill;
    }

    public void setEntrancetill(Integer entrancetill) {
        this.entrancetill = entrancetill;
    }

    public Integer getInspector() {
        return inspector;
    }

    public void setInspector(Integer inspector) {
        this.inspector = inspector;
    }

    public Integer getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Integer paymenttype) {
        this.paymenttype = paymenttype;
    }

    public Integer getPayer() {
        return payer;
    }

    public void setPayer(Integer payer) {
        this.payer = payer;
    }

    public Integer getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Integer bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Integer getFirms() {
        return firms;
    }

    public void setFirms(Integer firms) {
        this.firms = firms;
    }

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getFormnachAdd() {
        return formnachAdd;
    }

    public void setFormnachAdd(Integer formnachAdd) {
        this.formnachAdd = formnachAdd;
    }

    public Integer getWeal() {
        return weal;
    }

    public void setWeal(Integer weal) {
        this.weal = weal;
    }

    public Integer getWealAdd() {
        return wealAdd;
    }

    public void setWealAdd(Integer wealAdd) {
        this.wealAdd = wealAdd;
    }

    public Integer getLgota() {
        return lgota;
    }

    public void setLgota(Integer lgota) {
        this.lgota = lgota;
    }

    public Integer getGrouplgota() {
        return grouplgota;
    }

    public void setGrouplgota(Integer grouplgota) {
        this.grouplgota = grouplgota;
    }

    public Integer getOffbalance() {
        return offbalance;
    }

    public void setOffbalance(Integer offbalance) {
        this.offbalance = offbalance;
    }

    public Integer getAlgoritm() {
        return algoritm;
    }

    public void setAlgoritm(Integer algoritm) {
        this.algoritm = algoritm;
    }

    public Integer getValueAsInteger() {
        return valueAsInteger;
    }

    public void setValueAsInteger(Integer valueAsInteger) {
        this.valueAsInteger = valueAsInteger;
    }

    public Double getValueAsFloat() {
        return valueAsFloat;
    }

    public void setValueAsFloat(Double valueAsFloat) {
        this.valueAsFloat = valueAsFloat;
    }

    public String getValueAsString() {
        return valueAsString;
    }

    public void setValueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
    }

    public Integer getOnlyCurrentPeriod() {
        return onlyCurrentPeriod;
    }

    public void setOnlyCurrentPeriod(Integer onlyCurrentPeriod) {
        this.onlyCurrentPeriod = onlyCurrentPeriod;
    }

    public Integer getOnlyRecalcPeriod() {
        return onlyRecalcPeriod;
    }

    public void setOnlyRecalcPeriod(Integer onlyRecalcPeriod) {
        this.onlyRecalcPeriod = onlyRecalcPeriod;
    }

    public Integer getProcdatefrom() {
        return procdatefrom;
    }

    public void setProcdatefrom(Integer procdatefrom) {
        this.procdatefrom = procdatefrom;
    }

    public Integer getProcdatetill() {
        return procdatetill;
    }

    public void setProcdatetill(Integer procdatetill) {
        this.procdatetill = procdatetill;
    }

    public Integer getWmNode() {
        return wmNode;
    }

    public void setWmNode(Integer wmNode) {
        this.wmNode = wmNode;
    }

    public Integer getGroupHouse() {
        return groupHouse;
    }

    public void setGroupHouse(Integer groupHouse) {
        this.groupHouse = groupHouse;
    }

    public Integer getGroupTariff() {
        return groupTariff;
    }

    public void setGroupTariff(Integer groupTariff) {
        this.groupTariff = groupTariff;
    }

    public Integer getBoilerhouse() {
        return boilerhouse;
    }

    public void setBoilerhouse(Integer boilerhouse) {
        this.boilerhouse = boilerhouse;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDatetill() {
        return datetill;
    }

    public void setDatetill(Date datetill) {
        this.datetill = datetill;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getHeatpoint() {
        return heatpoint;
    }

    public void setHeatpoint(Integer heatpoint) {
        this.heatpoint = heatpoint;
    }

    public int getHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public BigDecimal getWaterPercent() {
        return waterPercent;
    }

    public void setWaterPercent(BigDecimal waterPercent) {
        this.waterPercent = waterPercent;
    }

    public BigDecimal getHeatPercent() {
        return heatPercent;
    }

    public void setHeatPercent(BigDecimal heatPercent) {
        this.heatPercent = heatPercent;
    }

    public BigDecimal getWaterPercentCurr() {
        return waterPercentCurr;
    }

    public void setWaterPercentCurr(BigDecimal waterPercentCurr) {
        this.waterPercentCurr = waterPercentCurr;
    }

    public BigDecimal getHeatPercentCurr() {
        return heatPercentCurr;
    }

    public void setHeatPercentCurr(BigDecimal heatPercentCurr) {
        this.heatPercentCurr = heatPercentCurr;
    }

    public BigDecimal getWaterSumm() {
        return waterSumm;
    }

    public void setWaterSumm(BigDecimal waterSumm) {
        this.waterSumm = waterSumm;
    }

    public BigDecimal getHeatSumm() {
        return heatSumm;
    }

    public void setHeatSumm(BigDecimal heatSumm) {
        this.heatSumm = heatSumm;
    }

    public BigDecimal getDeltaChecksum() {
        return deltaChecksum;
    }

    public void setDeltaChecksum(BigDecimal deltaChecksum) {
        this.deltaChecksum = deltaChecksum;
    }

    public Integer getDeltaPoscount() {
        return deltaPoscount;
    }

    public void setDeltaPoscount(Integer deltaPoscount) {
        this.deltaPoscount = deltaPoscount;
    }

    public BigDecimal getCommissionSumm() {
        return commissionSumm;
    }

    public void setCommissionSumm(BigDecimal commissionSumm) {
        this.commissionSumm = commissionSumm;
    }

    public BigDecimal getTransferSumm() {
        return transferSumm;
    }

    public void setTransferSumm(BigDecimal transferSumm) {
        this.transferSumm = transferSumm;
    }

    public BigDecimal getDelTicketSumm() {
        return delTicketSumm;
    }

    public void setDelTicketSumm(BigDecimal delTicketSumm) {
        this.delTicketSumm = delTicketSumm;
    }

    public Integer getGroupservice() {
        return groupservice;
    }

    public void setGroupservice(Integer groupservice) {
        this.groupservice = groupservice;
    }

    public String getAccountshifr() {
        return accountshifr;
    }

    public void setAccountshifr(String accountshifr) {
        this.accountshifr = accountshifr;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public String getFlatlitera() {
        return flatlitera;
    }

    public void setFlatlitera(String flatlitera) {
        this.flatlitera = flatlitera;
    }

    public Integer getAccountfloor() {
        return accountfloor;
    }

    public void setAccountfloor(Integer accountfloor) {
        this.accountfloor = accountfloor;
    }

    public Integer getEntrance() {
        return entrance;
    }

    public void setEntrance(Integer entrance) {
        this.entrance = entrance;
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

    public Integer getDisintegrate() {
        return disintegrate;
    }

    public void setDisintegrate(Integer disintegrate) {
        this.disintegrate = disintegrate;
    }

    public BigDecimal getRooms() {
        return rooms;
    }

    public void setRooms(BigDecimal rooms) {
        this.rooms = rooms;
    }

    public Integer getRecalcprocdate() {
        return recalcprocdate;
    }

    public void setRecalcprocdate(Integer recalcprocdate) {
        this.recalcprocdate = recalcprocdate;
    }

    public Integer getLodgers() {
        return lodgers;
    }

    public void setLodgers(Integer lodgers) {
        this.lodgers = lodgers;
    }

    public Integer getLeaved() {
        return leaved;
    }

    public void setLeaved(Integer leaved) {
        this.leaved = leaved;
    }

    public Integer getLeavedLgota() {
        return leavedLgota;
    }

    public void setLeavedLgota(Integer leavedLgota) {
        this.leavedLgota = leavedLgota;
    }

    public String getLgotadata() {
        return lgotadata;
    }

    public void setLgotadata(String lgotadata) {
        this.lgotadata = lgotadata;
    }

    public String getS1S4() {
        return s1S4;
    }

    public void setS1S4(String s1S4) {
        this.s1S4 = s1S4;
    }

    public Integer getUserRecalcprocdate() {
        return userRecalcprocdate;
    }

    public void setUserRecalcprocdate(Integer userRecalcprocdate) {
        this.userRecalcprocdate = userRecalcprocdate;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getHeatpointFrom() {
        return heatpointFrom;
    }

    public void setHeatpointFrom(Integer heatpointFrom) {
        this.heatpointFrom = heatpointFrom;
    }

    public Integer getPipecodeFrom() {
        return pipecodeFrom;
    }

    public void setPipecodeFrom(Integer pipecodeFrom) {
        this.pipecodeFrom = pipecodeFrom;
    }

    public Integer getReminderType() {
        return reminderType;
    }

    public void setReminderType(Integer reminderType) {
        this.reminderType = reminderType;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroupzhekDistrictName() {
        return groupzhekDistrictName;
    }

    public void setGroupzhekDistrictName(String groupzhekDistrictName) {
        this.groupzhekDistrictName = groupzhekDistrictName;
    }

    public String getShortaddress() {
        return shortaddress;
    }

    public void setShortaddress(String shortaddress) {
        this.shortaddress = shortaddress;
    }

    public Integer getWaterHeater() {
        return waterHeater;
    }

    public void setWaterHeater(Integer waterHeater) {
        this.waterHeater = waterHeater;
    }

    public Integer getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(Integer propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getWarrant() {
        return warrant;
    }

    public void setWarrant(String warrant) {
        this.warrant = warrant;
    }

    public String getPrivatization() {
        return privatization;
    }

    public void setPrivatization(String privatization) {
        this.privatization = privatization;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public Integer getDialog() {
        return dialog;
    }

    public void setDialog(Integer dialog) {
        this.dialog = dialog;
    }

    public Integer getHouseFrom() {
        return houseFrom;
    }

    public void setHouseFrom(Integer houseFrom) {
        this.houseFrom = houseFrom;
    }

    public BigDecimal getVolume1() {
        return volume1;
    }

    public void setVolume1(BigDecimal volume1) {
        this.volume1 = volume1;
    }

    public BigDecimal getVolumeAdd1() {
        return volumeAdd1;
    }

    public void setVolumeAdd1(BigDecimal volumeAdd1) {
        this.volumeAdd1 = volumeAdd1;
    }

    public Integer getCornerApartment() {
        return cornerApartment;
    }

    public void setCornerApartment(Integer cornerApartment) {
        this.cornerApartment = cornerApartment;
    }

    public Integer getOwnership() {
        return ownership;
    }

    public void setOwnership(Integer ownership) {
        this.ownership = ownership;
    }

    public Integer getDocacceptCode() {
        return docacceptCode;
    }

    public void setDocacceptCode(Integer docacceptCode) {
        this.docacceptCode = docacceptCode;
    }

    public Integer getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(Integer partnerCode) {
        this.partnerCode = partnerCode;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public Integer getPRecalcprocdate() {
        return pRecalcprocdate;
    }

    public void setPRecalcprocdate(Integer pRecalcprocdate) {
        this.pRecalcprocdate = pRecalcprocdate;
    }

    public Date getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Date timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Date getTimeTill() {
        return timeTill;
    }

    public void setTimeTill(Date timeTill) {
        this.timeTill = timeTill;
    }

    public Integer getMethodOv() {
        return methodOv;
    }

    public void setMethodOv(Integer methodOv) {
        this.methodOv = methodOv;
    }

    public Integer getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(Integer budgetType) {
        this.budgetType = budgetType;
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
        if (!(object instanceof HDocheaders)) {
            return false;
        }
        HDocheaders other = (HDocheaders) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HDocheaders[ code=" + code + " ]";
    }
    
}
