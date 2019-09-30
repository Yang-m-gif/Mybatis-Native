package com.slk.wph.module.CUS_Patient_Data.po;

import java.util.Date;

public class CusPatientData {
    private Integer fid;

    private String name;

    private Integer modifyUserfid;

    private String modifyname;

    private Date modifydate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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