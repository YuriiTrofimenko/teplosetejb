/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Dockinds.findAll", query = "SELECT d FROM Dockinds d")})
public class Dockinds implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    private String shifr;
    @Size(max = 64)
    private String name;
    private Integer formindex;
    private Integer subkind;
    @Lob
    @Size(max = 2147483647)
    private String notes;
    @Size(max = 64)
    @Column(name = "CHECKPOS_PROCEDURE")
    private String checkposProcedure;
    @Size(max = 64)
    @Column(name = "CHECK_PROCEDURE")
    private String checkProcedure;
    @Size(max = 64)
    @Column(name = "ACCEPT_PROCEDURE")
    private String acceptProcedure;
    @Size(max = 64)
    @Column(name = "ROLLBACK_PROCEDURE")
    private String rollbackProcedure;
    @Size(max = 64)
    @Column(name = "INIT_PROCEDURE")
    private String initProcedure;
    private Integer docnumber;
    private Integer docdate;
    private Integer poscount;
    private Integer checksumm;
    private Integer area;
    private Integer payer;
    private Integer paymenttype;
    private Integer account;
    private Integer house;
    private Integer inspector;
    @Column(name = "INIT_EXEC_TYPE")
    private Integer initExecType;
    private Integer firms;
    @Column(name = "REPORT_READY")
    private Integer reportReady;
    private Integer street;
    private Integer sector;
    private Integer formnach;
    @Column(name = "ODD_NUMBER")
    private Integer oddNumber;
    @Column(name = "EVEN_NUMBER")
    private Integer evenNumber;
    private Integer flatfrom;
    private Integer flattill;
    @Column(name = "BANK_ACCOUNT")
    private Integer bankAccount;
    @Size(max = 16)
    @Column(name = "RESOURCE_ID")
    private String resourceId;
    private Integer lgota;
    private Integer district;
    private Integer offbalance;
    private Integer docdate1;
    private Integer algoritm;
    @Column(name = "VALUE_AS_INTEGER")
    private Integer valueAsInteger;
    @Column(name = "VALUE_AS_FLOAT")
    private Integer valueAsFloat;
    @Column(name = "VALUE_AS_STRING")
    private Integer valueAsString;
    private Integer grouplgota;
    @Column(name = "ONLY_CURRENT_PERIOD")
    private Integer onlyCurrentPeriod;
    @Column(name = "ONLY_RECALC_PERIOD")
    private Integer onlyRecalcPeriod;
    @Column(name = "HOUSENUMBER_FROM")
    private Integer housenumberFrom;
    @Column(name = "HOUSENUMBER_TILL")
    private Integer housenumberTill;
    @Column(name = "IS_HIDDEN")
    private Integer isHidden;
    @Column(name = "GROUP_DOC")
    private Integer groupDoc;
    private Integer department;
    private Integer procdatefrom;
    private Integer procdatetill;
    private Integer weal;
    @Column(name = "WM_NODE")
    private Integer wmNode;
    @Column(name = "GROUP_HOUSE")
    private Integer groupHouse;
    @Column(name = "GROUP_TARIFF")
    private Integer groupTariff;
    private Integer entrancefrom;
    private Integer entrancetill;
    private Integer floorfrom;
    private Integer floortill;
    @Column(name = "WORK_PROCDATE")
    private Integer workProcdate;
    private Integer boilerhouse;
    @Column(name = "WEAL_ADD")
    private Integer wealAdd;
    @Column(name = "FORMNACH_ADD")
    private Integer formnachAdd;
    private Integer saldokind;
    @Column(name = "AVG_OPERATION")
    private Integer avgOperation;
    @Column(name = "IS_WORK_OLD_PROCDATE")
    private Integer isWorkOldProcdate;

    public Dockinds() {
    }

    public Dockinds(Integer code) {
        this.code = code;
    }

    public Dockinds(Integer code, String shifr) {
        this.code = code;
        this.shifr = shifr;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFormindex() {
        return formindex;
    }

    public void setFormindex(Integer formindex) {
        this.formindex = formindex;
    }

    public Integer getSubkind() {
        return subkind;
    }

    public void setSubkind(Integer subkind) {
        this.subkind = subkind;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCheckposProcedure() {
        return checkposProcedure;
    }

    public void setCheckposProcedure(String checkposProcedure) {
        this.checkposProcedure = checkposProcedure;
    }

    public String getCheckProcedure() {
        return checkProcedure;
    }

    public void setCheckProcedure(String checkProcedure) {
        this.checkProcedure = checkProcedure;
    }

    public String getAcceptProcedure() {
        return acceptProcedure;
    }

    public void setAcceptProcedure(String acceptProcedure) {
        this.acceptProcedure = acceptProcedure;
    }

    public String getRollbackProcedure() {
        return rollbackProcedure;
    }

    public void setRollbackProcedure(String rollbackProcedure) {
        this.rollbackProcedure = rollbackProcedure;
    }

    public String getInitProcedure() {
        return initProcedure;
    }

    public void setInitProcedure(String initProcedure) {
        this.initProcedure = initProcedure;
    }

    public Integer getDocnumber() {
        return docnumber;
    }

    public void setDocnumber(Integer docnumber) {
        this.docnumber = docnumber;
    }

    public Integer getDocdate() {
        return docdate;
    }

    public void setDocdate(Integer docdate) {
        this.docdate = docdate;
    }

    public Integer getPoscount() {
        return poscount;
    }

    public void setPoscount(Integer poscount) {
        this.poscount = poscount;
    }

    public Integer getChecksumm() {
        return checksumm;
    }

    public void setChecksumm(Integer checksumm) {
        this.checksumm = checksumm;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPayer() {
        return payer;
    }

    public void setPayer(Integer payer) {
        this.payer = payer;
    }

    public Integer getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Integer paymenttype) {
        this.paymenttype = paymenttype;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getInspector() {
        return inspector;
    }

    public void setInspector(Integer inspector) {
        this.inspector = inspector;
    }

    public Integer getInitExecType() {
        return initExecType;
    }

    public void setInitExecType(Integer initExecType) {
        this.initExecType = initExecType;
    }

    public Integer getFirms() {
        return firms;
    }

    public void setFirms(Integer firms) {
        this.firms = firms;
    }

    public Integer getReportReady() {
        return reportReady;
    }

    public void setReportReady(Integer reportReady) {
        this.reportReady = reportReady;
    }

    public Integer getStreet() {
        return street;
    }

    public void setStreet(Integer street) {
        this.street = street;
    }

    public Integer getSector() {
        return sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
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

    public Integer getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Integer bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getLgota() {
        return lgota;
    }

    public void setLgota(Integer lgota) {
        this.lgota = lgota;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getOffbalance() {
        return offbalance;
    }

    public void setOffbalance(Integer offbalance) {
        this.offbalance = offbalance;
    }

    public Integer getDocdate1() {
        return docdate1;
    }

    public void setDocdate1(Integer docdate1) {
        this.docdate1 = docdate1;
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

    public Integer getValueAsFloat() {
        return valueAsFloat;
    }

    public void setValueAsFloat(Integer valueAsFloat) {
        this.valueAsFloat = valueAsFloat;
    }

    public Integer getValueAsString() {
        return valueAsString;
    }

    public void setValueAsString(Integer valueAsString) {
        this.valueAsString = valueAsString;
    }

    public Integer getGrouplgota() {
        return grouplgota;
    }

    public void setGrouplgota(Integer grouplgota) {
        this.grouplgota = grouplgota;
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

    public Integer getHousenumberFrom() {
        return housenumberFrom;
    }

    public void setHousenumberFrom(Integer housenumberFrom) {
        this.housenumberFrom = housenumberFrom;
    }

    public Integer getHousenumberTill() {
        return housenumberTill;
    }

    public void setHousenumberTill(Integer housenumberTill) {
        this.housenumberTill = housenumberTill;
    }

    public Integer getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Integer isHidden) {
        this.isHidden = isHidden;
    }

    public Integer getGroupDoc() {
        return groupDoc;
    }

    public void setGroupDoc(Integer groupDoc) {
        this.groupDoc = groupDoc;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
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

    public Integer getWeal() {
        return weal;
    }

    public void setWeal(Integer weal) {
        this.weal = weal;
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

    public Integer getWorkProcdate() {
        return workProcdate;
    }

    public void setWorkProcdate(Integer workProcdate) {
        this.workProcdate = workProcdate;
    }

    public Integer getBoilerhouse() {
        return boilerhouse;
    }

    public void setBoilerhouse(Integer boilerhouse) {
        this.boilerhouse = boilerhouse;
    }

    public Integer getWealAdd() {
        return wealAdd;
    }

    public void setWealAdd(Integer wealAdd) {
        this.wealAdd = wealAdd;
    }

    public Integer getFormnachAdd() {
        return formnachAdd;
    }

    public void setFormnachAdd(Integer formnachAdd) {
        this.formnachAdd = formnachAdd;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
    }

    public Integer getAvgOperation() {
        return avgOperation;
    }

    public void setAvgOperation(Integer avgOperation) {
        this.avgOperation = avgOperation;
    }

    public Integer getIsWorkOldProcdate() {
        return isWorkOldProcdate;
    }

    public void setIsWorkOldProcdate(Integer isWorkOldProcdate) {
        this.isWorkOldProcdate = isWorkOldProcdate;
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
        if (!(object instanceof Dockinds)) {
            return false;
        }
        Dockinds other = (Dockinds) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Dockinds[ code=" + code + " ]";
    }
    
}
