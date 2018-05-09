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
@Table(name = "DOC_ACCOUNT_CLAIM_LIST")
@NamedQueries({
    @NamedQuery(name = "DocAccountClaimList.findAll", query = "SELECT d FROM DocAccountClaimList d")})
public class DocAccountClaimList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer claimcode;
    private Integer number;
    @Size(max = 128)
    private String fio;
    @Size(max = 16)
    private String inn;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    private String phone;
    @Size(max = 256)
    @Column(name = "ADD_DATA")
    private String addData;
    @Size(max = 128)
    private String remark;
    @Temporal(TemporalType.DATE)
    private Date dateaction;
    private Integer claimstatecode;
    private Integer claimeexecutive;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private Integer article;
    @Column(name = "CLAIM_REFEREE")
    private Integer claimReferee;
    @Column(name = "ACCOUNT_CLAIM_STATECODE")
    private Integer accountClaimStatecode;
    @Column(name = "IS_DEL")
    private Integer isDel;
    private Integer procdate;
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocAccountClaim> errDocAccountClaimList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private DocAccountClaim pos;

    public DocAccountClaimList() {
    }

    public DocAccountClaimList(Integer code) {
        this.code = code;
    }

    public DocAccountClaimList(Integer code, int state) {
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

    public Integer getClaimcode() {
        return claimcode;
    }

    public void setClaimcode(Integer claimcode) {
        this.claimcode = claimcode;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddData() {
        return addData;
    }

    public void setAddData(String addData) {
        this.addData = addData;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDateaction() {
        return dateaction;
    }

    public void setDateaction(Date dateaction) {
        this.dateaction = dateaction;
    }

    public Integer getClaimstatecode() {
        return claimstatecode;
    }

    public void setClaimstatecode(Integer claimstatecode) {
        this.claimstatecode = claimstatecode;
    }

    public Integer getClaimeexecutive() {
        return claimeexecutive;
    }

    public void setClaimeexecutive(Integer claimeexecutive) {
        this.claimeexecutive = claimeexecutive;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getArticle() {
        return article;
    }

    public void setArticle(Integer article) {
        this.article = article;
    }

    public Integer getClaimReferee() {
        return claimReferee;
    }

    public void setClaimReferee(Integer claimReferee) {
        this.claimReferee = claimReferee;
    }

    public Integer getAccountClaimStatecode() {
        return accountClaimStatecode;
    }

    public void setAccountClaimStatecode(Integer accountClaimStatecode) {
        this.accountClaimStatecode = accountClaimStatecode;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public List<ErrDocAccountClaim> getErrDocAccountClaimList() {
        return errDocAccountClaimList;
    }

    public void setErrDocAccountClaimList(List<ErrDocAccountClaim> errDocAccountClaimList) {
        this.errDocAccountClaimList = errDocAccountClaimList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public DocAccountClaim getPos() {
        return pos;
    }

    public void setPos(DocAccountClaim pos) {
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
        if (!(object instanceof DocAccountClaimList)) {
            return false;
        }
        DocAccountClaimList other = (DocAccountClaimList) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccountClaimList[ code=" + code + " ]";
    }
    
}
