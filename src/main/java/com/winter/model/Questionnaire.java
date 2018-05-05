package com.winter.model;

import java.util.Date;

public class Questionnaire {
    private Integer qnid;

    private String qnname;

    private Integer typeid;

    private String createrid;

    private Date createdate;

    public Integer getQnid() {
        return qnid;
    }

    public void setQnid(Integer qnid) {
        this.qnid = qnid;
    }

    public String getQnname() {
        return qnname;
    }

    public void setQnname(String qnname) {
        this.qnname = qnname == null ? null : qnname.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getCreaterid() {
        return createrid;
    }

    public void setCreaterid(String createrid) {
        this.createrid = createrid == null ? null : createrid.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}