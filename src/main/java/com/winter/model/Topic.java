package com.winter.model;

public class Topic {
    private Integer topicid;

    private String content;

    private Integer qnid;

    private Integer orderid;

    private Integer tixing;

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getQnid() {
        return qnid;
    }

    public void setQnid(Integer qnid) {
        this.qnid = qnid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getTixing() {
        return tixing;
    }

    public void setTixing(Integer tixing) {
        this.tixing = tixing;
    }
}