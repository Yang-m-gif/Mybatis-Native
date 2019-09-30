package com.slk.wph.module.CUS_Price_Page.po;

import java.util.Date;

public class CusPricePage {
    private Integer fid;

    private Integer type;

    private String name;

    private Double price;

    private Integer modifyUserfid;

    private String modifyname;

    private Date modifydate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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