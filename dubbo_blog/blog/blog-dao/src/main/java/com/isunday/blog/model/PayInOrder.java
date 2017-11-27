package com.isunday.blog.model;

public class PayInOrder implements java.io.Serializable {
    private Integer payInOrderId;

    private Integer payVendorId;

    private Integer payMchId;

    private Long amount;

    private Byte status;

    private Long ctime;

    public Integer getPayInOrderId() {
        return payInOrderId;
    }

    public void setPayInOrderId(Integer payInOrderId) {
        this.payInOrderId = payInOrderId;
    }

    public Integer getPayVendorId() {
        return payVendorId;
    }

    public void setPayVendorId(Integer payVendorId) {
        this.payVendorId = payVendorId;
    }

    public Integer getPayMchId() {
        return payMchId;
    }

    public void setPayMchId(Integer payMchId) {
        this.payMchId = payMchId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
}