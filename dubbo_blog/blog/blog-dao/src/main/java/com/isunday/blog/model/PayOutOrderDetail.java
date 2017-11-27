package com.isunday.blog.model;

public class PayOutOrderDetail implements java.io.Serializable{
    private Integer payOutOrderDetailId;

    private Integer payOutOrderId;

    private String remark;

    public Integer getPayOutOrderDetailId() {
        return payOutOrderDetailId;
    }

    public void setPayOutOrderDetailId(Integer payOutOrderDetailId) {
        this.payOutOrderDetailId = payOutOrderDetailId;
    }

    public Integer getPayOutOrderId() {
        return payOutOrderId;
    }

    public void setPayOutOrderId(Integer payOutOrderId) {
        this.payOutOrderId = payOutOrderId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}