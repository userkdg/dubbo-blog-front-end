package com.isunday.blog.model;

public class PayInOrderDetail implements java.io.Serializable{
    private Integer payInOrderDetailId;

    private Integer payInOrderId;

    private String productId;

    private String productName;

    private Long productPrice;

    private Integer productCount;

    private String remark;

    public Integer getPayInOrderDetailId() {
        return payInOrderDetailId;
    }

    public void setPayInOrderDetailId(Integer payInOrderDetailId) {
        this.payInOrderDetailId = payInOrderDetailId;
    }

    public Integer getPayInOrderId() {
        return payInOrderId;
    }

    public void setPayInOrderId(Integer payInOrderId) {
        this.payInOrderId = payInOrderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}