package com.slk.wph.module.CUS_Price.po;

import java.util.Date;

public class CusPrice {
    private Integer fid;

    private String type;

    private String hospitalFees;

    private Double copy1;

    private Double copy2;

    private Double copy3;

    private Double copy4;

    private Double copy5;

    private Double copyGt5;

    private Integer modifyUserfid;

    private String modifyname;

    private Date modifydate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getHospitalFees() {
        return hospitalFees;
    }

    public void setHospitalFees(String hospitalFees) {
        this.hospitalFees = hospitalFees == null ? null : hospitalFees.trim();
    }

    public Double getCopy1() {
        return copy1;
    }

    public void setCopy1(Double copy1) {
        this.copy1 = copy1;
    }

    public Double getCopy2() {
        return copy2;
    }

    public void setCopy2(Double copy2) {
        this.copy2 = copy2;
    }

    public Double getCopy3() {
        return copy3;
    }

    public void setCopy3(Double copy3) {
        this.copy3 = copy3;
    }

    public Double getCopy4() {
        return copy4;
    }

    public void setCopy4(Double copy4) {
        this.copy4 = copy4;
    }

    public Double getCopy5() {
        return copy5;
    }

    public void setCopy5(Double copy5) {
        this.copy5 = copy5;
    }

    public Double getCopyGt5() {
        return copyGt5;
    }

    public void setCopyGt5(Double copyGt5) {
        this.copyGt5 = copyGt5;
    }

    public Integer getModifyUserfid() {
        return modifyUserfid;
    }

    public void setModifyUserfid(Integer modifyUserfid) {
        this.modifyUserfid = modifyUserfid;
    }

    public String getModifyname() {
        return modifyname;
    }

    public void setModifyname(String modifyname) {
        this.modifyname = modifyname == null ? null : modifyname.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}