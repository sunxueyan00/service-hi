package com.forezp.po;

import lombok.Data;

import java.util.Date;
@Data
public class Test4 {
    private Integer id;

    private Long orderId;

    private Long expressno;

    private Date createTime;

    private String orderType;

    private Long pronum;

    private Long price;

    private Long prototal;

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

    public Long getExpressno() {
        return expressno;
    }

    public void setExpressno(Long expressno) {
        this.expressno = expressno;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Long getPronum() {
        return pronum;
    }

    public void setPronum(Long pronum) {
        this.pronum = pronum;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrototal() {
        return prototal;
    }

    public void setPrototal(Long prototal) {
        this.prototal = prototal;
    }
}