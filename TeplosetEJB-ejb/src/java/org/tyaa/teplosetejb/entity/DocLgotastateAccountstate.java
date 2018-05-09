/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_LGOTASTATE_ACCOUNTSTATE")
@NamedQueries({
    @NamedQuery(name = "DocLgotastateAccountstate.findAll", query = "SELECT d FROM DocLgotastateAccountstate d")})
public class DocLgotastateAccountstate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private long pos;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer lodgers;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal s1;
    private BigDecimal s2;
    private BigDecimal s3;
    private BigDecimal s4;
    private BigDecimal s5;
    private BigDecimal s6;
    private BigDecimal rooms;
    @Column(name = "ACCOUNT_STATE_CODE")
    private Integer accountStateCode;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocLgotastate> errDocLgotastateList;

    public DocLgotastateAccountstate() {
    }

    public DocLgotastateAccountstate(Integer code) {
        this.code = code;
    }

    public DocLgotastateAccountstate(Integer code, long pos, int state) {
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

    public long getPos() {
        return pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    public Integer getLodgers() {
        return lodgers;
    }

    public void setLodgers(Integer lodgers) {
        this.lodgers = lodgers;
    }

    public BigDecimal getS1() {
        return s1;
    }

    public void setS1(BigDecimal s1) {
        this.s1 = s1;
    }

    public BigDecimal getS2() {
        return s2;
    }

    public void setS2(BigDecimal s2) {
        this.s2 = s2;
    }

    public BigDecimal getS3() {
        return s3;
    }

    public void setS3(BigDecimal s3) {
        this.s3 = s3;
    }

    public BigDecimal getS4() {
        return s4;
    }

    public void setS4(BigDecimal s4) {
        this.s4 = s4;
    }

    public BigDecimal getS5() {
        return s5;
    }

    public void setS5(BigDecimal s5) {
        this.s5 = s5;
    }

    public BigDecimal getS6() {
        return s6;
    }

    public void setS6(BigDecimal s6) {
        this.s6 = s6;
    }

    public BigDecimal getRooms() {
        return rooms;
    }

    public void setRooms(BigDecimal rooms) {
        this.rooms = rooms;
    }

    public Integer getAccountStateCode() {
        return accountStateCode;
    }

    public void setAccountStateCode(Integer accountStateCode) {
        this.accountStateCode = accountStateCode;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocLgotastate> getErrDocLgotastateList() {
        return errDocLgotastateList;
    }

    public void setErrDocLgotastateList(List<ErrDocLgotastate> errDocLgotastateList) {
        this.errDocLgotastateList = errDocLgotastateList;
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
        if (!(object instanceof DocLgotastateAccountstate)) {
            return false;
        }
        DocLgotastateAccountstate other = (DocLgotastateAccountstate) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocLgotastateAccountstate[ code=" + code + " ]";
    }
    
}
