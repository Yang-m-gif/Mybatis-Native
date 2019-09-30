package com.slk.wph.module.CUS_Setting_Todo.po;

import java.util.Date;

public class CusSettingTodo {
    private Integer fid;

    private Integer patientType;

    private Integer countLimit;

    private Date starttime;

    private Date endtime;

    private Integer modifyUserfid;

    private String modifyname;

    private Date modifydate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getPatientType() {
        return patientType;
    }

    public void setPatientType(Integer patientType) {
        this.patientType = patientType;
    }

    public Integer getCountLimit() {
        return countLimit;
    }

    public void setCountLimit(Integer countLimit) {
        this.countLimit = countLimit;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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