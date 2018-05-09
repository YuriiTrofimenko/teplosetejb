/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "ERR_DOC_HOUSE")
@NamedQueries({
    @NamedQuery(name = "ErrDocHouse.findAll", query = "SELECT e FROM ErrDocHouse e")})
public class ErrDocHouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer systemmessagecode;
    @Size(max = 128)
    private String remark;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne
    private DocHouse pos;
    @JoinColumn(name = "POS1", referencedColumnName = "CODE")
    @ManyToOne
    private DocHouseentry pos1;
    @JoinColumn(name = "POS2", referencedColumnName = "CODE")
    @ManyToOne
    private DocHousemeter pos2;

    public ErrDocHouse() {
    }

    public ErrDocHouse(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getSystemmessagecode() {
        return systemmessagecode;
    }

    public void setSystemmessagecode(Integer systemmessagecode) {
        this.systemmessagecode = systemmessagecode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public DocHouse getPos() {
        return pos;
    }

    public void setPos(DocHouse pos) {
        this.pos = pos;
    }

    public DocHouseentry getPos1() {
        return pos1;
    }

    public void setPos1(DocHouseentry pos1) {
        this.pos1 = pos1;
    }

    public DocHousemeter getPos2() {
        return pos2;
    }

    public void setPos2(DocHousemeter pos2) {
        this.pos2 = pos2;
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
        if (!(object instanceof ErrDocHouse)) {
            return false;
        }
        ErrDocHouse other = (ErrDocHouse) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.ErrDocHouse[ code=" + code + " ]";
    }
    
}
