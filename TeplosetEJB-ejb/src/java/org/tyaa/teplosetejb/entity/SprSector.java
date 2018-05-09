/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SPR_SECTOR")
@NamedQueries({
    @NamedQuery(name = "SprSector.findAll", query = "SELECT s FROM SprSector s")})
public class SprSector implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Character code;
    private Character name;
    private Character remark;

    public SprSector() {
    }

    public Character getCode() {
        return code;
    }

    public void setCode(Character code) {
        this.code = code;
    }

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    public Character getRemark() {
        return remark;
    }

    public void setRemark(Character remark) {
        this.remark = remark;
    }
    
}
