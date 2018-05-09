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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_F2_OPLATA")
@NamedQueries({
    @NamedQuery(name = "DocF2Oplata.findAll", query = "SELECT d FROM DocF2Oplata d")})
public class DocF2Oplata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "DOC_F2_OBRABOTANO_CODE")
    private Integer docF2ObrabotanoCode;
    @Column(name = "PROCDATE_PAY")
    private Integer procdatePay;
    @Column(name = "H_PROCDATE_PAY")
    private Integer hProcdatePay;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocF2Oplata() {
    }

    public DocF2Oplata(Integer code) {
        this.code = code;
    }

    public DocF2Oplata(Integer code, int state) {
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

    public Integer getDocF2ObrabotanoCode() {
        return docF2ObrabotanoCode;
    }

    public void setDocF2ObrabotanoCode(Integer docF2ObrabotanoCode) {
        this.docF2ObrabotanoCode = docF2ObrabotanoCode;
    }

    public Integer getProcdatePay() {
        return procdatePay;
    }

    public void setProcdatePay(Integer procdatePay) {
        this.procdatePay = procdatePay;
    }

    public Integer getHProcdatePay() {
        return hProcdatePay;
    }

    public void setHProcdatePay(Integer hProcdatePay) {
        this.hProcdatePay = hProcdatePay;
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
        if (!(object instanceof DocF2Oplata)) {
            return false;
        }
        DocF2Oplata other = (DocF2Oplata) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocF2Oplata[ code=" + code + " ]";
    }
    
}
