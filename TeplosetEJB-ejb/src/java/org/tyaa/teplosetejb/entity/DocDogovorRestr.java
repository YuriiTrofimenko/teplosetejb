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
@Table(name = "DOC_DOGOVOR_RESTR")
@NamedQueries({
    @NamedQuery(name = "DocDogovorRestr.findAll", query = "SELECT d FROM DocDogovorRestr d")})
public class DocDogovorRestr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer dogovorcode;
    @Column(name = "IS_DELETE")
    private Integer isDelete;
    private Integer firmcode;
    private BigInteger accountcode;
    @Column(name = "DOG_RESTR_KIND")
    private Integer dogRestrKind;
    @Size(max = 128)
    private String fio;
    @Size(max = 16)
    private String inn;
    @Size(max = 16)
    @Column(name = "DOG_NUMBER")
    private String dogNumber;
    @Column(name = "DOG_DATE")
    @Temporal(TemporalType.DATE)
    private Date dogDate;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBT_SUMM")
    private BigDecimal debtSumm;
    @Column(name = "MONTH_SUMM")
    private BigDecimal monthSumm;
    private BigDecimal beginpaysumm;
    @Size(max = 128)
    private String remark;
    @Column(name = "MONTH_COUNT")
    private Integer monthCount;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    private String phone;
    @Column(name = "BEFORE_ENDDATE")
    @Temporal(TemporalType.DATE)
    private Date beforeEnddate;
    @Column(name = "BEFORE_END_CODE")
    private Integer beforeEndCode;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocDogovorRestr> errDocDogovorRestrList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocDogovorRestr() {
    }

    public DocDogovorRestr(Integer code) {
        this.code = code;
    }

    public DocDogovorRestr(Integer code, int state) {
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

    public Integer getDogovorcode() {
        return dogovorcode;
    }

    public void setDogovorcode(Integer dogovorcode) {
        this.dogovorcode = dogovorcode;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public Integer getDogRestrKind() {
        return dogRestrKind;
    }

    public void setDogRestrKind(Integer dogRestrKind) {
        this.dogRestrKind = dogRestrKind;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getDogNumber() {
        return dogNumber;
    }

    public void setDogNumber(String dogNumber) {
        this.dogNumber = dogNumber;
    }

    public Date getDogDate() {
        return dogDate;
    }

    public void setDogDate(Date dogDate) {
        this.dogDate = dogDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getDebtSumm() {
        return debtSumm;
    }

    public void setDebtSumm(BigDecimal debtSumm) {
        this.debtSumm = debtSumm;
    }

    public BigDecimal getMonthSumm() {
        return monthSumm;
    }

    public void setMonthSumm(BigDecimal monthSumm) {
        this.monthSumm = monthSumm;
    }

    public BigDecimal getBeginpaysumm() {
        return beginpaysumm;
    }

    public void setBeginpaysumm(BigDecimal beginpaysumm) {
        this.beginpaysumm = beginpaysumm;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(Integer monthCount) {
        this.monthCount = monthCount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBeforeEnddate() {
        return beforeEnddate;
    }

    public void setBeforeEnddate(Date beforeEnddate) {
        this.beforeEnddate = beforeEnddate;
    }

    public Integer getBeforeEndCode() {
        return beforeEndCode;
    }

    public void setBeforeEndCode(Integer beforeEndCode) {
        this.beforeEndCode = beforeEndCode;
    }

    public List<ErrDocDogovorRestr> getErrDocDogovorRestrList() {
        return errDocDogovorRestrList;
    }

    public void setErrDocDogovorRestrList(List<ErrDocDogovorRestr> errDocDogovorRestrList) {
        this.errDocDogovorRestrList = errDocDogovorRestrList;
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
        if (!(object instanceof DocDogovorRestr)) {
            return false;
        }
        DocDogovorRestr other = (DocDogovorRestr) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocDogovorRestr[ code=" + code + " ]";
    }
    
}
