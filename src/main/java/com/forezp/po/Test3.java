package com.forezp.po;

import java.util.Date;

public class Test3 {
    private Integer id;

    private Long orderId;

    private String bodymassage;

    private Date createTime;

    private Long expressno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getBodymassage() {
        return bodymassage;
    }

    public void setBodymassage(String bodymassage) {
        this.bodymassage = bodymassage == null ? null : bodymassage.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getExpressno() {
        return expressno;
    }

    public void setExpressno(Long expressno) {
        this.expressno = expressno;
    }
}