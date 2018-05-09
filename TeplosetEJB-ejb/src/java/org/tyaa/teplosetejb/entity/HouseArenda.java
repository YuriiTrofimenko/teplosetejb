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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "HOUSE_ARENDA")
@NamedQueries({
    @NamedQuery(name = "HouseArenda.findAll", query = "SELECT h FROM HouseArenda h")})
public class HouseArenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int housecode;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal s1;
    private BigDecimal s2;
    private BigDecimal s3;
    private BigDecimal s4;
    @Column(name = "S1_OV")
    private BigDecimal s1Ov;
    @Column(name = "S2_OV")
    private BigDecimal s2Ov;
    @Column(name = "S3_OV")
    private BigDecimal s3Ov;
    @Column(name = "S4_OV")
    private BigDecimal s4Ov;
    @Column(name = "S1_D")
    private BigDecimal s1D;
    @Column(name = "S2_D")
    private BigDecimal s2D;
    @Column(name = "S3_D")
    private BigDecimal s3D;
    @Column(name = "S4_D")
    private BigDecimal s4D;
    @Column(name = "S1_OV_D")
    private BigDecimal s1OvD;
    @Column(name = "S2_OV_D")
    private BigDecimal s2OvD;
    @Column(name = "S3_OV_D")
    private BigDecimal s3OvD;
    @Column(name = "S4_OV_D")
    private BigDecimal s4OvD;
    @Column(name = "TOTAL_VOLUME")
    private BigDecimal totalVolume;
    @Column(name = "TOTAL_HEATED")
    private BigDecimal totalHeated;
    @Column(name = "TOTAL_HEATED_OPTED")
    private BigDecimal totalHeatedOpted;
    @Column(name = "HEATED_MZK")
    private BigDecimal heatedMzk;
    @Column(name = "TOTAL_HEATED_CONNECTED")
    private BigDecimal totalHeatedConnected;
    private BigDecimal staircase;
    @Column(name = "STAIRCASE_ELEVATOR_HALL")
    private BigDecimal staircaseElevatorHall;
    @Column(name = "DUMP_TRUCKS_CHAMBER")
    private BigDecimal dumpTrucksChamber;
    @Column(name = "UTILITIES_ROOM_1")
    private BigDecimal utilitiesRoom1;
    private BigDecimal hallway;
    @Column(name = "ADJACENT_ROOM_DESK")
    private BigDecimal adjacentRoomDesk;
    @JoinColumn(name = "HOUSE_PIPECODE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Pipe housePipecode;

    public HouseArenda() {
    }

    public HouseArenda(Integer code) {
        this.code = code;
    }

    public HouseArenda(Integer code, int housecode, Date begindate) {
        this.code = code;
        this.housecode = housecode;
        this.begindate = begindate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getHousecode() {
        return housecode;
    }

    public void setHousecode(int housecode) {
        this.housecode = housecode;
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

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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

    public BigDecimal getS1Ov() {
        return s1Ov;
    }

    public void setS1Ov(BigDecimal s1Ov) {
        this.s1Ov = s1Ov;
    }

    public BigDecimal getS2Ov() {
        return s2Ov;
    }

    public void setS2Ov(BigDecimal s2Ov) {
        this.s2Ov = s2Ov;
    }

    public BigDecimal getS3Ov() {
        return s3Ov;
    }

    public void setS3Ov(BigDecimal s3Ov) {
        this.s3Ov = s3Ov;
    }

    public BigDecimal getS4Ov() {
        return s4Ov;
    }

    public void setS4Ov(BigDecimal s4Ov) {
        this.s4Ov = s4Ov;
    }

    public BigDecimal getS1D() {
        return s1D;
    }

    public void setS1D(BigDecimal s1D) {
        this.s1D = s1D;
    }

    public BigDecimal getS2D() {
        return s2D;
    }

    public void setS2D(BigDecimal s2D) {
        this.s2D = s2D;
    }

    public BigDecimal getS3D() {
        return s3D;
    }

    public void setS3D(BigDecimal s3D) {
        this.s3D = s3D;
    }

    public BigDecimal getS4D() {
        return s4D;
    }

    public void setS4D(BigDecimal s4D) {
        this.s4D = s4D;
    }

    public BigDecimal getS1OvD() {
        return s1OvD;
    }

    public void setS1OvD(BigDecimal s1OvD) {
        this.s1OvD = s1OvD;
    }

    public BigDecimal getS2OvD() {
        return s2OvD;
    }

    public void setS2OvD(BigDecimal s2OvD) {
        this.s2OvD = s2OvD;
    }

    public BigDecimal getS3OvD() {
        return s3OvD;
    }

    public void setS3OvD(BigDecimal s3OvD) {
        this.s3OvD = s3OvD;
    }

    public BigDecimal getS4OvD() {
        return s4OvD;
    }

    public void setS4OvD(BigDecimal s4OvD) {
        this.s4OvD = s4OvD;
    }

    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    public BigDecimal getTotalHeated() {
        return totalHeated;
    }

    public void setTotalHeated(BigDecimal totalHeated) {
        this.totalHeated = totalHeated;
    }

    public BigDecimal getTotalHeatedOpted() {
        return totalHeatedOpted;
    }

    public void setTotalHeatedOpted(BigDecimal totalHeatedOpted) {
        this.totalHeatedOpted = totalHeatedOpted;
    }

    public BigDecimal getHeatedMzk() {
        return heatedMzk;
    }

    public void setHeatedMzk(BigDecimal heatedMzk) {
        this.heatedMzk = heatedMzk;
    }

    public BigDecimal getTotalHeatedConnected() {
        return totalHeatedConnected;
    }

    public void setTotalHeatedConnected(BigDecimal totalHeatedConnected) {
        this.totalHeatedConnected = totalHeatedConnected;
    }

    public BigDecimal getStaircase() {
        return staircase;
    }

    public void setStaircase(BigDecimal staircase) {
        this.staircase = staircase;
    }

    public BigDecimal getStaircaseElevatorHall() {
        return staircaseElevatorHall;
    }

    public void setStaircaseElevatorHall(BigDecimal staircaseElevatorHall) {
        this.staircaseElevatorHall = staircaseElevatorHall;
    }

    public BigDecimal getDumpTrucksChamber() {
        return dumpTrucksChamber;
    }

    public void setDumpTrucksChamber(BigDecimal dumpTrucksChamber) {
        this.dumpTrucksChamber = dumpTrucksChamber;
    }

    public BigDecimal getUtilitiesRoom1() {
        return utilitiesRoom1;
    }

    public void setUtilitiesRoom1(BigDecimal utilitiesRoom1) {
        this.utilitiesRoom1 = utilitiesRoom1;
    }

    public BigDecimal getHallway() {
        return hallway;
    }

    public void setHallway(BigDecimal hallway) {
        this.hallway = hallway;
    }

    public BigDecimal getAdjacentRoomDesk() {
        return adjacentRoomDesk;
    }

    public void setAdjacentRoomDesk(BigDecimal adjacentRoomDesk) {
        this.adjacentRoomDesk = adjacentRoomDesk;
    }

    public Pipe getHousePipecode() {
        return housePipecode;
    }

    public void setHousePipecode(Pipe housePipecode) {
        this.housePipecode = housePipecode;
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
        if (!(object instanceof HouseArenda)) {
            return false;
        }
        HouseArenda other = (HouseArenda) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HouseArenda[ code=" + code + " ]";
    }
    
}
