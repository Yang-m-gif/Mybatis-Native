package com.slk.wph.module.CUS_Ward.po;

import java.util.Date;

public class CusWard {
    private Integer fid;

    private Integer wphUserFid;

    private Integer wphRoleFid;

    private String wardfids;

    private Integer modifyUserfid;

    private String modifyname;

    private Date modifydate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWphUserFid() {
        return wphUserFid;
    }

    public void setWphUserFid(Integer wphUserFid) {
        this.wphUserFid = wphUserFid;
    }

    public Integer getWphRoleFid() {
        return wphRoleFid;
    }

    public void setWphRoleFid(Integer wphRoleFid) {
        this.wphRoleFid = wphRoleFid;
    }

    public String getWardfids() {
        return wardfids;
    }

    public void setWardfids(String wardfids) {
        this.wardfids = wardfids == null ? null : wardfids.trim();
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