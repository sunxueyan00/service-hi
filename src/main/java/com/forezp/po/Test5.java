package com.forezp.po;

import lombok.Data;

import java.util.Date;
@Data
public class Test5 {
    private Integer id;

    private Long orderId;

    private String bodymassage;

    private Date createTime;

    private Long expressno;

    private Integer isDel;

    private Integer num;

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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}