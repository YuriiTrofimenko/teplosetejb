/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_EXAMPL_WORKER")
@NamedQueries({
    @NamedQuery(name = "DocExamplWorker.findAll", query = "SELECT d FROM DocExamplWorker d")})
public class DocExamplWorker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer state;
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
    @OneToMany(mappedBy = "pos")
    private List<DocExamplAdd2worker> docExamplAdd2workerList;
    @JoinColumn(name = "ACCOUNT", referencedColumnName = "CODE")
    @ManyToOne
    private Account account;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne
    private Docheaders doc;

    public DocExamplWorker() {
    }

    public DocExamplWorker(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public List<DocExamplAdd2worker> getDocExamplAdd2workerList() {
        return docExamplAdd2workerList;
    }

    public void setDocExamplAdd2workerList(List<DocExamplAdd2worker> docExamplAdd2workerList) {
        this.docExamplAdd2workerList = docExamplAdd2workerList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
        if (!(object instanceof DocExamplWorker)) {
            return false;
        }
        DocExamplWorker other = (DocExamplWorker) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocExamplWorker[ code=" + code + " ]";
    }
    
}
