/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "DOC_EXAMPL_ADD2WORKER")
@NamedQueries({
    @NamedQuery(name = "DocExamplAdd2worker.findAll", query = "SELECT d FROM DocExamplAdd2worker d")})
public class DocExamplAdd2worker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer doc;
    private Integer state;
    private BigInteger account;
    private Integer worker;
    private Integer post;
    @Size(max = 128)
    private String remark;
    private Integer firm;
    @Size(max = 64)
    private String fio;
    @Column(name = "OLD_ACCOUNT")
    private BigInteger oldAccount;
    @Size(max = 32)
    private String tabn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUM_FOR_REPORT_202")
    private BigDecimal sumForReport202;
    @Column(name = "CODE_MVK")
    private Integer codeMvk;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne
    private DocExamplWorker pos;

    public DocExamplAdd2worker() {
    }

    public DocExamplAdd2worker(Integer code) {
        this.code = code;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigInteger getAccount() {
        return account;
    }

    public void setAccount(BigInteger account) {
        this.account = account;
    }

    public Integer getWorker() {
        return worker;
    }

    public void setWorker(Integer worker) {
        this.worker = worker;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFirm() {
        return firm;
    }

    public void setFirm(Integer firm) {
        this.firm = firm;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public BigInteger getOldAccount() {
        return oldAccount;
    }

    public void setOldAccount(BigInteger oldAccount) {
        this.oldAccount = oldAccount;
    }

    public String getTabn() {
        return tabn;
    }

    public void setTabn(String tabn) {
        this.tabn = tabn;
    }

    public BigDecimal getSumForReport202() {
        return sumForReport202;
    }

    public void setSumForReport202(BigDecimal sumForReport202) {
        this.sumForReport202 = sumForReport202;
    }

    public Integer getCodeMvk() {
        return codeMvk;
    }

    public void setCodeMvk(Integer codeMvk) {
        this.codeMvk = codeMvk;
    }

    public DocExamplWorker getPos() {
        return pos;
    }

    public void setPos(DocExamplWorker pos) {
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
        if (!(object instanceof DocExamplAdd2worker)) {
            return false;
        }
        DocExamplAdd2worker other = (DocExamplAdd2worker) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocExamplAdd2worker[ code=" + code + " ]";
    }
    
}
