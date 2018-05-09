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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Docheaders.findAll", query = "SELECT d FROM Docheaders d")})
public class Docheaders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
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
    @Column(name = "VALUE_AS_BOOLEAN")
    private Integer valueAsBoolean;
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
    @Column(name = "GROUP_TARIFF_OLD")
    private Integer groupTariffOld;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocDogovorPayPart> errDocDogovorPayPartList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocDogovorRestr> errDocDogovorRestrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocHouseSArendaLine> docHouseSArendaLineList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountPropertyLine> docAccountPropertyLineList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocHeatpoint> docHeatpointList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocChangeAccount> errDocChangeAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocBoilerentry> docBoilerentryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocListF2> docListF2List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountmeter> docAccountmeterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocChangePipe> docChangePipeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocChangeMeterReplaceNgt> docChangeMeterReplaceNgtList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocComparativeHeat> docComparativeHeatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocHeatpointentry> docHeatpointentryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocMeterUnusedAct> docMeterUnusedActList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocVolume> errDocVolumeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocHouseSArenda> errDocHouseSArendaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocSubsquery> docSubsqueryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocChangePipe> errDocChangePipeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocAccountClaim> errDocAccountClaimList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocTicket> errDocTicketList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocMeterCheck> docMeterCheckList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocPipeHeatLoad> errDocPipeHeatLoadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocPipeWorkTime> errDocPipeWorkTimeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocAccountProperty> errDocAccountPropertyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocChangeMeter> errDocChangeMeterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocSubsidiaReturn> docSubsidiaReturnList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocBoiler> docBoilerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocReferenceData> docReferenceDataList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocVolume> docVolumeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocServicePercent> errDocServicePercentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocLeavedstate> docLeavedstateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocF1Enterprise> docF1EnterpriseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocLgotastateAccountstate> docLgotastateAccountstateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocHouse> errDocHouseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccessUsers> docAccessUsersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocPipeWorkTime> docPipeWorkTimeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAiEnterprise> docAiEnterpriseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocSubsidia> docSubsidiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocSaldo> docSaldoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountList> docAccountListList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocTicket> docTicketList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocUszn> errDocUsznList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocPipeHeatLoad> docPipeHeatLoadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocAccount> errDocAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocAccessUsers> errDocAccessUsersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocChangeMeter> docChangeMeterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocSaldoLgota> errDocSaldoLgotaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocHouseSArenda> docHouseSArendaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocDogovorService> docDogovorServiceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocOpenPipe> docOpenPipeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocReminder> docReminderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocF2> docF2List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountPartner> docAccountPartnerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocBoilerWorkTime> docBoilerWorkTimeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocSaldoDetail> docSaldoDetailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocReminderMonthKf> docReminderMonthKfList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocMtpsBill> docMtpsBillList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocMeterUnusedAct> errDocMeterUnusedActList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocReferenceDataLine> docReferenceDataLineList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocF2Mb> errDocF2MbList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocPipeHeat> docPipeHeatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocF1Lgota> docF1LgotaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocDogovorRestr> docDogovorRestrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocHouse> docHouseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocAccountFamily> errDocAccountFamilyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocDogovorService> errDocDogovorServiceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountProperty> docAccountPropertyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocDiscountService> docDiscountServiceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountClaim> docAccountClaimList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocChangeAccountVv> errDocChangeAccountVvList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocBoiler> errDocBoilerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocNach> docNachList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocSubsqueryLg> docSubsqueryLgList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocChangeAccountentry> docChangeAccountentryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountentry> docAccountentryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocMovIsk> docMovIskList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocF2Z> docF2ZList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountU> docAccountUList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocF2Mb> docF2MbList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocLgotastate> docLgotastateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocDatachanges> docDatachangesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocChangeAccountmeter> docChangeAccountmeterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocChangeAccountlgota> docChangeAccountlgotaList;
    @OneToMany(mappedBy = "doc")
    private List<DocExamplWorker> docExamplWorkerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocChangeAccount> docChangeAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocForPayUszn> docForPayUsznList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocDhwEnterprise> docDhwEnterpriseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocDateMeterReading> docDateMeterReadingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocDodatok3Text> docDodatok3TextList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocBrdBill> docBrdBillList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocHouseentry> docHouseentryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountFamilyLine> docAccountFamilyLineList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocSaldoLgota> docSaldoLgotaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountClaimList> docAccountClaimListList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocBoilerIncomingEnterprise> docBoilerIncomingEnterpriseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocServicePercent> docServicePercentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccount> docAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocOpenPipe> errDocOpenPipeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocUszn> docUsznList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocAccountPartner> errDocAccountPartnerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocDodatok3> docDodatok3List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocF2Oplata> docF2OplataList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocDateMeterReading> errDocDateMeterReadingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocSubsqueryFact> docSubsqueryFactList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocKorr> docKorrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocHousemeter> docHousemeterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<ErrDocDiscountService> errDocDiscountServiceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doc")
    private List<DocAccountFamily> docAccountFamilyList;

    public Docheaders() {
    }

    public Docheaders(Integer code) {
        this.code = code;
    }

    public Docheaders(Integer code, int procdate, int dockind, int state, int docaccept, int canrollback, int systemuser, Date lastuserchange, int hidden) {
        this.code = code;
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

    public Integer getValueAsBoolean() {
        return valueAsBoolean;
    }

    public void setValueAsBoolean(Integer valueAsBoolean) {
        this.valueAsBoolean = valueAsBoolean;
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

    public Integer getGroupTariffOld() {
        return groupTariffOld;
    }

    public void setGroupTariffOld(Integer groupTariffOld) {
        this.groupTariffOld = groupTariffOld;
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

    public List<ErrDocDogovorPayPart> getErrDocDogovorPayPartList() {
        return errDocDogovorPayPartList;
    }

    public void setErrDocDogovorPayPartList(List<ErrDocDogovorPayPart> errDocDogovorPayPartList) {
        this.errDocDogovorPayPartList = errDocDogovorPayPartList;
    }

    public List<ErrDocDogovorRestr> getErrDocDogovorRestrList() {
        return errDocDogovorRestrList;
    }

    public void setErrDocDogovorRestrList(List<ErrDocDogovorRestr> errDocDogovorRestrList) {
        this.errDocDogovorRestrList = errDocDogovorRestrList;
    }

    public List<DocHouseSArendaLine> getDocHouseSArendaLineList() {
        return docHouseSArendaLineList;
    }

    public void setDocHouseSArendaLineList(List<DocHouseSArendaLine> docHouseSArendaLineList) {
        this.docHouseSArendaLineList = docHouseSArendaLineList;
    }

    public List<DocAccountPropertyLine> getDocAccountPropertyLineList() {
        return docAccountPropertyLineList;
    }

    public void setDocAccountPropertyLineList(List<DocAccountPropertyLine> docAccountPropertyLineList) {
        this.docAccountPropertyLineList = docAccountPropertyLineList;
    }

    public List<DocHeatpoint> getDocHeatpointList() {
        return docHeatpointList;
    }

    public void setDocHeatpointList(List<DocHeatpoint> docHeatpointList) {
        this.docHeatpointList = docHeatpointList;
    }

    public List<ErrDocChangeAccount> getErrDocChangeAccountList() {
        return errDocChangeAccountList;
    }

    public void setErrDocChangeAccountList(List<ErrDocChangeAccount> errDocChangeAccountList) {
        this.errDocChangeAccountList = errDocChangeAccountList;
    }

    public List<DocBoilerentry> getDocBoilerentryList() {
        return docBoilerentryList;
    }

    public void setDocBoilerentryList(List<DocBoilerentry> docBoilerentryList) {
        this.docBoilerentryList = docBoilerentryList;
    }

    public List<DocListF2> getDocListF2List() {
        return docListF2List;
    }

    public void setDocListF2List(List<DocListF2> docListF2List) {
        this.docListF2List = docListF2List;
    }

    public List<DocAccountmeter> getDocAccountmeterList() {
        return docAccountmeterList;
    }

    public void setDocAccountmeterList(List<DocAccountmeter> docAccountmeterList) {
        this.docAccountmeterList = docAccountmeterList;
    }

    public List<DocChangePipe> getDocChangePipeList() {
        return docChangePipeList;
    }

    public void setDocChangePipeList(List<DocChangePipe> docChangePipeList) {
        this.docChangePipeList = docChangePipeList;
    }

    public List<DocChangeMeterReplaceNgt> getDocChangeMeterReplaceNgtList() {
        return docChangeMeterReplaceNgtList;
    }

    public void setDocChangeMeterReplaceNgtList(List<DocChangeMeterReplaceNgt> docChangeMeterReplaceNgtList) {
        this.docChangeMeterReplaceNgtList = docChangeMeterReplaceNgtList;
    }

    public List<DocComparativeHeat> getDocComparativeHeatList() {
        return docComparativeHeatList;
    }

    public void setDocComparativeHeatList(List<DocComparativeHeat> docComparativeHeatList) {
        this.docComparativeHeatList = docComparativeHeatList;
    }

    public List<DocHeatpointentry> getDocHeatpointentryList() {
        return docHeatpointentryList;
    }

    public void setDocHeatpointentryList(List<DocHeatpointentry> docHeatpointentryList) {
        this.docHeatpointentryList = docHeatpointentryList;
    }

    public List<DocMeterUnusedAct> getDocMeterUnusedActList() {
        return docMeterUnusedActList;
    }

    public void setDocMeterUnusedActList(List<DocMeterUnusedAct> docMeterUnusedActList) {
        this.docMeterUnusedActList = docMeterUnusedActList;
    }

    public List<ErrDocVolume> getErrDocVolumeList() {
        return errDocVolumeList;
    }

    public void setErrDocVolumeList(List<ErrDocVolume> errDocVolumeList) {
        this.errDocVolumeList = errDocVolumeList;
    }

    public List<ErrDocHouseSArenda> getErrDocHouseSArendaList() {
        return errDocHouseSArendaList;
    }

    public void setErrDocHouseSArendaList(List<ErrDocHouseSArenda> errDocHouseSArendaList) {
        this.errDocHouseSArendaList = errDocHouseSArendaList;
    }

    public List<DocSubsquery> getDocSubsqueryList() {
        return docSubsqueryList;
    }

    public void setDocSubsqueryList(List<DocSubsquery> docSubsqueryList) {
        this.docSubsqueryList = docSubsqueryList;
    }

    public List<ErrDocChangePipe> getErrDocChangePipeList() {
        return errDocChangePipeList;
    }

    public void setErrDocChangePipeList(List<ErrDocChangePipe> errDocChangePipeList) {
        this.errDocChangePipeList = errDocChangePipeList;
    }

    public List<ErrDocAccountClaim> getErrDocAccountClaimList() {
        return errDocAccountClaimList;
    }

    public void setErrDocAccountClaimList(List<ErrDocAccountClaim> errDocAccountClaimList) {
        this.errDocAccountClaimList = errDocAccountClaimList;
    }

    public List<ErrDocTicket> getErrDocTicketList() {
        return errDocTicketList;
    }

    public void setErrDocTicketList(List<ErrDocTicket> errDocTicketList) {
        this.errDocTicketList = errDocTicketList;
    }

    public List<DocMeterCheck> getDocMeterCheckList() {
        return docMeterCheckList;
    }

    public void setDocMeterCheckList(List<DocMeterCheck> docMeterCheckList) {
        this.docMeterCheckList = docMeterCheckList;
    }

    public List<ErrDocPipeHeatLoad> getErrDocPipeHeatLoadList() {
        return errDocPipeHeatLoadList;
    }

    public void setErrDocPipeHeatLoadList(List<ErrDocPipeHeatLoad> errDocPipeHeatLoadList) {
        this.errDocPipeHeatLoadList = errDocPipeHeatLoadList;
    }

    public List<ErrDocPipeWorkTime> getErrDocPipeWorkTimeList() {
        return errDocPipeWorkTimeList;
    }

    public void setErrDocPipeWorkTimeList(List<ErrDocPipeWorkTime> errDocPipeWorkTimeList) {
        this.errDocPipeWorkTimeList = errDocPipeWorkTimeList;
    }

    public List<ErrDocAccountProperty> getErrDocAccountPropertyList() {
        return errDocAccountPropertyList;
    }

    public void setErrDocAccountPropertyList(List<ErrDocAccountProperty> errDocAccountPropertyList) {
        this.errDocAccountPropertyList = errDocAccountPropertyList;
    }

    public List<ErrDocChangeMeter> getErrDocChangeMeterList() {
        return errDocChangeMeterList;
    }

    public void setErrDocChangeMeterList(List<ErrDocChangeMeter> errDocChangeMeterList) {
        this.errDocChangeMeterList = errDocChangeMeterList;
    }

    public List<DocSubsidiaReturn> getDocSubsidiaReturnList() {
        return docSubsidiaReturnList;
    }

    public void setDocSubsidiaReturnList(List<DocSubsidiaReturn> docSubsidiaReturnList) {
        this.docSubsidiaReturnList = docSubsidiaReturnList;
    }

    public List<DocBoiler> getDocBoilerList() {
        return docBoilerList;
    }

    public void setDocBoilerList(List<DocBoiler> docBoilerList) {
        this.docBoilerList = docBoilerList;
    }

    public List<DocReferenceData> getDocReferenceDataList() {
        return docReferenceDataList;
    }

    public void setDocReferenceDataList(List<DocReferenceData> docReferenceDataList) {
        this.docReferenceDataList = docReferenceDataList;
    }

    public List<DocVolume> getDocVolumeList() {
        return docVolumeList;
    }

    public void setDocVolumeList(List<DocVolume> docVolumeList) {
        this.docVolumeList = docVolumeList;
    }

    public List<ErrDocServicePercent> getErrDocServicePercentList() {
        return errDocServicePercentList;
    }

    public void setErrDocServicePercentList(List<ErrDocServicePercent> errDocServicePercentList) {
        this.errDocServicePercentList = errDocServicePercentList;
    }

    public List<DocLeavedstate> getDocLeavedstateList() {
        return docLeavedstateList;
    }

    public void setDocLeavedstateList(List<DocLeavedstate> docLeavedstateList) {
        this.docLeavedstateList = docLeavedstateList;
    }

    public List<DocF1Enterprise> getDocF1EnterpriseList() {
        return docF1EnterpriseList;
    }

    public void setDocF1EnterpriseList(List<DocF1Enterprise> docF1EnterpriseList) {
        this.docF1EnterpriseList = docF1EnterpriseList;
    }

    public List<DocLgotastateAccountstate> getDocLgotastateAccountstateList() {
        return docLgotastateAccountstateList;
    }

    public void setDocLgotastateAccountstateList(List<DocLgotastateAccountstate> docLgotastateAccountstateList) {
        this.docLgotastateAccountstateList = docLgotastateAccountstateList;
    }

    public List<ErrDocHouse> getErrDocHouseList() {
        return errDocHouseList;
    }

    public void setErrDocHouseList(List<ErrDocHouse> errDocHouseList) {
        this.errDocHouseList = errDocHouseList;
    }

    public List<DocAccessUsers> getDocAccessUsersList() {
        return docAccessUsersList;
    }

    public void setDocAccessUsersList(List<DocAccessUsers> docAccessUsersList) {
        this.docAccessUsersList = docAccessUsersList;
    }

    public List<DocPipeWorkTime> getDocPipeWorkTimeList() {
        return docPipeWorkTimeList;
    }

    public void setDocPipeWorkTimeList(List<DocPipeWorkTime> docPipeWorkTimeList) {
        this.docPipeWorkTimeList = docPipeWorkTimeList;
    }

    public List<DocAiEnterprise> getDocAiEnterpriseList() {
        return docAiEnterpriseList;
    }

    public void setDocAiEnterpriseList(List<DocAiEnterprise> docAiEnterpriseList) {
        this.docAiEnterpriseList = docAiEnterpriseList;
    }

    public List<DocSubsidia> getDocSubsidiaList() {
        return docSubsidiaList;
    }

    public void setDocSubsidiaList(List<DocSubsidia> docSubsidiaList) {
        this.docSubsidiaList = docSubsidiaList;
    }

    public List<DocSaldo> getDocSaldoList() {
        return docSaldoList;
    }

    public void setDocSaldoList(List<DocSaldo> docSaldoList) {
        this.docSaldoList = docSaldoList;
    }

    public List<DocAccountList> getDocAccountListList() {
        return docAccountListList;
    }

    public void setDocAccountListList(List<DocAccountList> docAccountListList) {
        this.docAccountListList = docAccountListList;
    }

    public List<DocTicket> getDocTicketList() {
        return docTicketList;
    }

    public void setDocTicketList(List<DocTicket> docTicketList) {
        this.docTicketList = docTicketList;
    }

    public List<ErrDocUszn> getErrDocUsznList() {
        return errDocUsznList;
    }

    public void setErrDocUsznList(List<ErrDocUszn> errDocUsznList) {
        this.errDocUsznList = errDocUsznList;
    }

    public List<DocPipeHeatLoad> getDocPipeHeatLoadList() {
        return docPipeHeatLoadList;
    }

    public void setDocPipeHeatLoadList(List<DocPipeHeatLoad> docPipeHeatLoadList) {
        this.docPipeHeatLoadList = docPipeHeatLoadList;
    }

    public List<ErrDocAccount> getErrDocAccountList() {
        return errDocAccountList;
    }

    public void setErrDocAccountList(List<ErrDocAccount> errDocAccountList) {
        this.errDocAccountList = errDocAccountList;
    }

    public List<ErrDocAccessUsers> getErrDocAccessUsersList() {
        return errDocAccessUsersList;
    }

    public void setErrDocAccessUsersList(List<ErrDocAccessUsers> errDocAccessUsersList) {
        this.errDocAccessUsersList = errDocAccessUsersList;
    }

    public List<DocChangeMeter> getDocChangeMeterList() {
        return docChangeMeterList;
    }

    public void setDocChangeMeterList(List<DocChangeMeter> docChangeMeterList) {
        this.docChangeMeterList = docChangeMeterList;
    }

    public List<ErrDocSaldoLgota> getErrDocSaldoLgotaList() {
        return errDocSaldoLgotaList;
    }

    public void setErrDocSaldoLgotaList(List<ErrDocSaldoLgota> errDocSaldoLgotaList) {
        this.errDocSaldoLgotaList = errDocSaldoLgotaList;
    }

    public List<DocHouseSArenda> getDocHouseSArendaList() {
        return docHouseSArendaList;
    }

    public void setDocHouseSArendaList(List<DocHouseSArenda> docHouseSArendaList) {
        this.docHouseSArendaList = docHouseSArendaList;
    }

    public List<DocDogovorService> getDocDogovorServiceList() {
        return docDogovorServiceList;
    }

    public void setDocDogovorServiceList(List<DocDogovorService> docDogovorServiceList) {
        this.docDogovorServiceList = docDogovorServiceList;
    }

    public List<DocOpenPipe> getDocOpenPipeList() {
        return docOpenPipeList;
    }

    public void setDocOpenPipeList(List<DocOpenPipe> docOpenPipeList) {
        this.docOpenPipeList = docOpenPipeList;
    }

    public List<DocReminder> getDocReminderList() {
        return docReminderList;
    }

    public void setDocReminderList(List<DocReminder> docReminderList) {
        this.docReminderList = docReminderList;
    }

    public List<DocF2> getDocF2List() {
        return docF2List;
    }

    public void setDocF2List(List<DocF2> docF2List) {
        this.docF2List = docF2List;
    }

    public List<DocAccountPartner> getDocAccountPartnerList() {
        return docAccountPartnerList;
    }

    public void setDocAccountPartnerList(List<DocAccountPartner> docAccountPartnerList) {
        this.docAccountPartnerList = docAccountPartnerList;
    }

    public List<DocBoilerWorkTime> getDocBoilerWorkTimeList() {
        return docBoilerWorkTimeList;
    }

    public void setDocBoilerWorkTimeList(List<DocBoilerWorkTime> docBoilerWorkTimeList) {
        this.docBoilerWorkTimeList = docBoilerWorkTimeList;
    }

    public List<DocSaldoDetail> getDocSaldoDetailList() {
        return docSaldoDetailList;
    }

    public void setDocSaldoDetailList(List<DocSaldoDetail> docSaldoDetailList) {
        this.docSaldoDetailList = docSaldoDetailList;
    }

    public List<DocReminderMonthKf> getDocReminderMonthKfList() {
        return docReminderMonthKfList;
    }

    public void setDocReminderMonthKfList(List<DocReminderMonthKf> docReminderMonthKfList) {
        this.docReminderMonthKfList = docReminderMonthKfList;
    }

    public List<DocMtpsBill> getDocMtpsBillList() {
        return docMtpsBillList;
    }

    public void setDocMtpsBillList(List<DocMtpsBill> docMtpsBillList) {
        this.docMtpsBillList = docMtpsBillList;
    }

    public List<ErrDocMeterUnusedAct> getErrDocMeterUnusedActList() {
        return errDocMeterUnusedActList;
    }

    public void setErrDocMeterUnusedActList(List<ErrDocMeterUnusedAct> errDocMeterUnusedActList) {
        this.errDocMeterUnusedActList = errDocMeterUnusedActList;
    }

    public List<DocReferenceDataLine> getDocReferenceDataLineList() {
        return docReferenceDataLineList;
    }

    public void setDocReferenceDataLineList(List<DocReferenceDataLine> docReferenceDataLineList) {
        this.docReferenceDataLineList = docReferenceDataLineList;
    }

    public List<ErrDocF2Mb> getErrDocF2MbList() {
        return errDocF2MbList;
    }

    public void setErrDocF2MbList(List<ErrDocF2Mb> errDocF2MbList) {
        this.errDocF2MbList = errDocF2MbList;
    }

    public List<DocPipeHeat> getDocPipeHeatList() {
        return docPipeHeatList;
    }

    public void setDocPipeHeatList(List<DocPipeHeat> docPipeHeatList) {
        this.docPipeHeatList = docPipeHeatList;
    }

    public List<DocF1Lgota> getDocF1LgotaList() {
        return docF1LgotaList;
    }

    public void setDocF1LgotaList(List<DocF1Lgota> docF1LgotaList) {
        this.docF1LgotaList = docF1LgotaList;
    }

    public List<DocDogovorRestr> getDocDogovorRestrList() {
        return docDogovorRestrList;
    }

    public void setDocDogovorRestrList(List<DocDogovorRestr> docDogovorRestrList) {
        this.docDogovorRestrList = docDogovorRestrList;
    }

    public List<DocHouse> getDocHouseList() {
        return docHouseList;
    }

    public void setDocHouseList(List<DocHouse> docHouseList) {
        this.docHouseList = docHouseList;
    }

    public List<ErrDocAccountFamily> getErrDocAccountFamilyList() {
        return errDocAccountFamilyList;
    }

    public void setErrDocAccountFamilyList(List<ErrDocAccountFamily> errDocAccountFamilyList) {
        this.errDocAccountFamilyList = errDocAccountFamilyList;
    }

    public List<ErrDocDogovorService> getErrDocDogovorServiceList() {
        return errDocDogovorServiceList;
    }

    public void setErrDocDogovorServiceList(List<ErrDocDogovorService> errDocDogovorServiceList) {
        this.errDocDogovorServiceList = errDocDogovorServiceList;
    }

    public List<DocAccountProperty> getDocAccountPropertyList() {
        return docAccountPropertyList;
    }

    public void setDocAccountPropertyList(List<DocAccountProperty> docAccountPropertyList) {
        this.docAccountPropertyList = docAccountPropertyList;
    }

    public List<DocDiscountService> getDocDiscountServiceList() {
        return docDiscountServiceList;
    }

    public void setDocDiscountServiceList(List<DocDiscountService> docDiscountServiceList) {
        this.docDiscountServiceList = docDiscountServiceList;
    }

    public List<DocAccountClaim> getDocAccountClaimList() {
        return docAccountClaimList;
    }

    public void setDocAccountClaimList(List<DocAccountClaim> docAccountClaimList) {
        this.docAccountClaimList = docAccountClaimList;
    }

    public List<ErrDocChangeAccountVv> getErrDocChangeAccountVvList() {
        return errDocChangeAccountVvList;
    }

    public void setErrDocChangeAccountVvList(List<ErrDocChangeAccountVv> errDocChangeAccountVvList) {
        this.errDocChangeAccountVvList = errDocChangeAccountVvList;
    }

    public List<ErrDocBoiler> getErrDocBoilerList() {
        return errDocBoilerList;
    }

    public void setErrDocBoilerList(List<ErrDocBoiler> errDocBoilerList) {
        this.errDocBoilerList = errDocBoilerList;
    }

    public List<DocNach> getDocNachList() {
        return docNachList;
    }

    public void setDocNachList(List<DocNach> docNachList) {
        this.docNachList = docNachList;
    }

    public List<DocSubsqueryLg> getDocSubsqueryLgList() {
        return docSubsqueryLgList;
    }

    public void setDocSubsqueryLgList(List<DocSubsqueryLg> docSubsqueryLgList) {
        this.docSubsqueryLgList = docSubsqueryLgList;
    }

    public List<DocChangeAccountentry> getDocChangeAccountentryList() {
        return docChangeAccountentryList;
    }

    public void setDocChangeAccountentryList(List<DocChangeAccountentry> docChangeAccountentryList) {
        this.docChangeAccountentryList = docChangeAccountentryList;
    }

    public List<DocAccountentry> getDocAccountentryList() {
        return docAccountentryList;
    }

    public void setDocAccountentryList(List<DocAccountentry> docAccountentryList) {
        this.docAccountentryList = docAccountentryList;
    }

    public List<DocMovIsk> getDocMovIskList() {
        return docMovIskList;
    }

    public void setDocMovIskList(List<DocMovIsk> docMovIskList) {
        this.docMovIskList = docMovIskList;
    }

    public List<DocF2Z> getDocF2ZList() {
        return docF2ZList;
    }

    public void setDocF2ZList(List<DocF2Z> docF2ZList) {
        this.docF2ZList = docF2ZList;
    }

    public List<DocAccountU> getDocAccountUList() {
        return docAccountUList;
    }

    public void setDocAccountUList(List<DocAccountU> docAccountUList) {
        this.docAccountUList = docAccountUList;
    }

    public List<DocF2Mb> getDocF2MbList() {
        return docF2MbList;
    }

    public void setDocF2MbList(List<DocF2Mb> docF2MbList) {
        this.docF2MbList = docF2MbList;
    }

    public List<DocLgotastate> getDocLgotastateList() {
        return docLgotastateList;
    }

    public void setDocLgotastateList(List<DocLgotastate> docLgotastateList) {
        this.docLgotastateList = docLgotastateList;
    }

    public List<DocDatachanges> getDocDatachangesList() {
        return docDatachangesList;
    }

    public void setDocDatachangesList(List<DocDatachanges> docDatachangesList) {
        this.docDatachangesList = docDatachangesList;
    }

    public List<DocChangeAccountmeter> getDocChangeAccountmeterList() {
        return docChangeAccountmeterList;
    }

    public void setDocChangeAccountmeterList(List<DocChangeAccountmeter> docChangeAccountmeterList) {
        this.docChangeAccountmeterList = docChangeAccountmeterList;
    }

    public List<DocChangeAccountlgota> getDocChangeAccountlgotaList() {
        return docChangeAccountlgotaList;
    }

    public void setDocChangeAccountlgotaList(List<DocChangeAccountlgota> docChangeAccountlgotaList) {
        this.docChangeAccountlgotaList = docChangeAccountlgotaList;
    }

    public List<DocExamplWorker> getDocExamplWorkerList() {
        return docExamplWorkerList;
    }

    public void setDocExamplWorkerList(List<DocExamplWorker> docExamplWorkerList) {
        this.docExamplWorkerList = docExamplWorkerList;
    }

    public List<DocChangeAccount> getDocChangeAccountList() {
        return docChangeAccountList;
    }

    public void setDocChangeAccountList(List<DocChangeAccount> docChangeAccountList) {
        this.docChangeAccountList = docChangeAccountList;
    }

    public List<DocForPayUszn> getDocForPayUsznList() {
        return docForPayUsznList;
    }

    public void setDocForPayUsznList(List<DocForPayUszn> docForPayUsznList) {
        this.docForPayUsznList = docForPayUsznList;
    }

    public List<DocDhwEnterprise> getDocDhwEnterpriseList() {
        return docDhwEnterpriseList;
    }

    public void setDocDhwEnterpriseList(List<DocDhwEnterprise> docDhwEnterpriseList) {
        this.docDhwEnterpriseList = docDhwEnterpriseList;
    }

    public List<DocDateMeterReading> getDocDateMeterReadingList() {
        return docDateMeterReadingList;
    }

    public void setDocDateMeterReadingList(List<DocDateMeterReading> docDateMeterReadingList) {
        this.docDateMeterReadingList = docDateMeterReadingList;
    }

    public List<DocDodatok3Text> getDocDodatok3TextList() {
        return docDodatok3TextList;
    }

    public void setDocDodatok3TextList(List<DocDodatok3Text> docDodatok3TextList) {
        this.docDodatok3TextList = docDodatok3TextList;
    }

    public List<DocBrdBill> getDocBrdBillList() {
        return docBrdBillList;
    }

    public void setDocBrdBillList(List<DocBrdBill> docBrdBillList) {
        this.docBrdBillList = docBrdBillList;
    }

    public List<DocHouseentry> getDocHouseentryList() {
        return docHouseentryList;
    }

    public void setDocHouseentryList(List<DocHouseentry> docHouseentryList) {
        this.docHouseentryList = docHouseentryList;
    }

    public List<DocAccountFamilyLine> getDocAccountFamilyLineList() {
        return docAccountFamilyLineList;
    }

    public void setDocAccountFamilyLineList(List<DocAccountFamilyLine> docAccountFamilyLineList) {
        this.docAccountFamilyLineList = docAccountFamilyLineList;
    }

    public List<DocSaldoLgota> getDocSaldoLgotaList() {
        return docSaldoLgotaList;
    }

    public void setDocSaldoLgotaList(List<DocSaldoLgota> docSaldoLgotaList) {
        this.docSaldoLgotaList = docSaldoLgotaList;
    }

    public List<DocAccountClaimList> getDocAccountClaimListList() {
        return docAccountClaimListList;
    }

    public void setDocAccountClaimListList(List<DocAccountClaimList> docAccountClaimListList) {
        this.docAccountClaimListList = docAccountClaimListList;
    }

    public List<DocBoilerIncomingEnterprise> getDocBoilerIncomingEnterpriseList() {
        return docBoilerIncomingEnterpriseList;
    }

    public void setDocBoilerIncomingEnterpriseList(List<DocBoilerIncomingEnterprise> docBoilerIncomingEnterpriseList) {
        this.docBoilerIncomingEnterpriseList = docBoilerIncomingEnterpriseList;
    }

    public List<DocServicePercent> getDocServicePercentList() {
        return docServicePercentList;
    }

    public void setDocServicePercentList(List<DocServicePercent> docServicePercentList) {
        this.docServicePercentList = docServicePercentList;
    }

    public List<DocAccount> getDocAccountList() {
        return docAccountList;
    }

    public void setDocAccountList(List<DocAccount> docAccountList) {
        this.docAccountList = docAccountList;
    }

    public List<ErrDocOpenPipe> getErrDocOpenPipeList() {
        return errDocOpenPipeList;
    }

    public void setErrDocOpenPipeList(List<ErrDocOpenPipe> errDocOpenPipeList) {
        this.errDocOpenPipeList = errDocOpenPipeList;
    }

    public List<DocUszn> getDocUsznList() {
        return docUsznList;
    }

    public void setDocUsznList(List<DocUszn> docUsznList) {
        this.docUsznList = docUsznList;
    }

    public List<ErrDocAccountPartner> getErrDocAccountPartnerList() {
        return errDocAccountPartnerList;
    }

    public void setErrDocAccountPartnerList(List<ErrDocAccountPartner> errDocAccountPartnerList) {
        this.errDocAccountPartnerList = errDocAccountPartnerList;
    }

    public List<DocDodatok3> getDocDodatok3List() {
        return docDodatok3List;
    }

    public void setDocDodatok3List(List<DocDodatok3> docDodatok3List) {
        this.docDodatok3List = docDodatok3List;
    }

    public List<DocF2Oplata> getDocF2OplataList() {
        return docF2OplataList;
    }

    public void setDocF2OplataList(List<DocF2Oplata> docF2OplataList) {
        this.docF2OplataList = docF2OplataList;
    }

    public List<ErrDocDateMeterReading> getErrDocDateMeterReadingList() {
        return errDocDateMeterReadingList;
    }

    public void setErrDocDateMeterReadingList(List<ErrDocDateMeterReading> errDocDateMeterReadingList) {
        this.errDocDateMeterReadingList = errDocDateMeterReadingList;
    }

    public List<DocSubsqueryFact> getDocSubsqueryFactList() {
        return docSubsqueryFactList;
    }

    public void setDocSubsqueryFactList(List<DocSubsqueryFact> docSubsqueryFactList) {
        this.docSubsqueryFactList = docSubsqueryFactList;
    }

    public List<DocKorr> getDocKorrList() {
        return docKorrList;
    }

    public void setDocKorrList(List<DocKorr> docKorrList) {
        this.docKorrList = docKorrList;
    }

    public List<DocHousemeter> getDocHousemeterList() {
        return docHousemeterList;
    }

    public void setDocHousemeterList(List<DocHousemeter> docHousemeterList) {
        this.docHousemeterList = docHousemeterList;
    }

    public List<ErrDocDiscountService> getErrDocDiscountServiceList() {
        return errDocDiscountServiceList;
    }

    public void setErrDocDiscountServiceList(List<ErrDocDiscountService> errDocDiscountServiceList) {
        this.errDocDiscountServiceList = errDocDiscountServiceList;
    }

    public List<DocAccountFamily> getDocAccountFamilyList() {
        return docAccountFamilyList;
    }

    public void setDocAccountFamilyList(List<DocAccountFamily> docAccountFamilyList) {
        this.docAccountFamilyList = docAccountFamilyList;
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
        if (!(object instanceof Docheaders)) {
            return false;
        }
        Docheaders other = (Docheaders) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Docheaders[ code=" + code + " ]";
    }
    
}
