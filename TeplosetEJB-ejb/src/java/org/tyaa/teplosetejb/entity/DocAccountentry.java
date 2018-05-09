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
@Table(name = "DOC_ACCOUNTENTRY")
@NamedQueries({
    @NamedQuery(name = "DocAccountentry.findAll", query = "SELECT d FROM DocAccountentry d")})
public class DocAccountentry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "TOPOLOGY_CODE")
    private Integer topologyCode;
    private Integer pipecode;
    @Column(name = "PIPECODE_NEW")
    private Integer pipecodeNew;
    @Size(max = 16)
    @Column(name = "PIPE_SHIFR")
    private String pipeShifr;
    @Column(name = "OWNER_PIPECODE")
    private Integer ownerPipecode;
    @Column(name = "OWNER_OBJECT")
    private BigInteger ownerObject;
    private Integer service;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer formnach;
    private Integer calctype;
    private Integer normcode;
    private Integer firmcode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double koeff;
    @Size(max = 128)
    private String remark;
    @Column(name = "GROUP_SERVICE")
    private Integer groupService;
    private Integer gt;
    @Column(name = "DISCOUNT_PERCENT")
    private BigDecimal discountPercent;
    private Double koeff2;
    @Column(name = "IS_STOPPER")
    private Integer isStopper;
    @Column(name = "DOC_KOEFF")
    private Integer docKoeff;
    @Column(name = "DOC_KOEFF2")
    private Integer docKoeff2;
    @Column(name = "DISCOUNT_S2")
    private BigDecimal discountS2;
    @Column(name = "NACH_KOEFF")
    private Double nachKoeff;
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocAccount> errDocAccountList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private DocAccount pos;

    public DocAccountentry() {
    }

    public DocAccountentry(Integer code) {
        this.code = code;
    }

    public DocAccountentry(Integer code, int state) {
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

    public Integer getTopologyCode() {
        return topologyCode;
    }

    public void setTopologyCode(Integer topologyCode) {
        this.topologyCode = topologyCode;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getPipecodeNew() {
        return pipecodeNew;
    }

    public void setPipecodeNew(Integer pipecodeNew) {
        this.pipecodeNew = pipecodeNew;
    }

    public String getPipeShifr() {
        return pipeShifr;
    }

    public void setPipeShifr(String pipeShifr) {
        this.pipeShifr = pipeShifr;
    }

    public Integer getOwnerPipecode() {
        return ownerPipecode;
    }

    public void setOwnerPipecode(Integer ownerPipecode) {
        this.ownerPipecode = ownerPipecode;
    }

    public BigInteger getOwnerObject() {
        return ownerObject;
    }

    public void setOwnerObject(BigInteger ownerObject) {
        this.ownerObject = ownerObject;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
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

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getCalctype() {
        return calctype;
    }

    public void setCalctype(Integer calctype) {
        this.calctype = calctype;
    }

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public Double getKoeff() {
        return koeff;
    }

    public void setKoeff(Double koeff) {
        this.koeff = koeff;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getGroupService() {
        return groupService;
    }

    public void setGroupService(Integer groupService) {
        this.groupService = groupService;
    }

    public Integer getGt() {
        return gt;
    }

    public void setGt(Integer gt) {
        this.gt = gt;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Double getKoeff2() {
        return koeff2;
    }

    public void setKoeff2(Double koeff2) {
        this.koeff2 = koeff2;
    }

    public Integer getIsStopper() {
        return isStopper;
    }

    public void setIsStopper(Integer isStopper) {
        this.isStopper = isStopper;
    }

    public Integer getDocKoeff() {
        return docKoeff;
    }

    public void setDocKoeff(Integer docKoeff) {
        this.docKoeff = docKoeff;
    }

    public Integer getDocKoeff2() {
        return docKoeff2;
    }

    public void setDocKoeff2(Integer docKoeff2) {
        this.docKoeff2 = docKoeff2;
    }

    public BigDecimal getDiscountS2() {
        return discountS2;
    }

    public void setDiscountS2(BigDecimal discountS2) {
        this.discountS2 = discountS2;
    }

    public Double getNachKoeff() {
        return nachKoeff;
    }

    public void setNachKoeff(Double nachKoeff) {
        this.nachKoeff = nachKoeff;
    }

    public List<ErrDocAccount> getErrDocAccountList() {
        return errDocAccountList;
    }

    public void setErrDocAccountList(List<ErrDocAccount> errDocAccountList) {
        this.errDocAccountList = errDocAccountList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public DocAccount getPos() {
        return pos;
    }

    public void setPos(DocAccount pos) {
        this.pos = pos;
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
        if (!(object instanceof DocAccountentry)) {
            return false;
        }
        DocAccountentry other = (DocAccountentry) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccountentry[ code=" + code + " ]";
    }
    
}
