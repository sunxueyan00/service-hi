package com.forezp.po;

import java.util.Date;

public class Test2 {
    private Integer id;

    private Long orderId;

    private String orderType;

    private Date orderTime;

    private Date createTime;

    private Long skuno;

    private String brandname;

    private String brandcode;

    private Long prototal;

    private Long pronum;

    private Long price;

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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getSkuno() {
        return skuno;
    }

    public void setSkuno(Long skuno) {
        this.skuno = skuno;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBrandcode() {
        return brandcode;
    }

    public void setBrandcode(String brandcode) {
        this.brandcode = brandcode == null ? null : brandcode.trim();
    }

    public Long getPrototal() {
        return prototal;
    }

    public void setPrototal(Long prototal) {
        this.prototal = prototal;
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

    public Long getExpressno() {
        return expressno;
    }

    public void setExpressno(Long expressno) {
        this.expressno = expressno;
    }
}