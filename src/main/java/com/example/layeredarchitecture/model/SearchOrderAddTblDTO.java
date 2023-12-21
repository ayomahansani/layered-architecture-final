package com.example.layeredarchitecture.model;

public class SearchOrderAddTblDTO {

    private String orderId;
    private String date;
    private String itemCode;
    private String description;
    private String qty;
    private String unitPrice;

    public SearchOrderAddTblDTO() {
    }

    public SearchOrderAddTblDTO(String orderId, String date, String itemCode, String description, String qty, String unitPrice) {
        this.orderId = orderId;
        this.date = date;
        this.itemCode = itemCode;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "SearchOrderAddTblDTO{" +
                "orderId='" + orderId + '\'' +
                ", date='" + date + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", description='" + description + '\'' +
                ", qty='" + qty + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                '}';
    }
}
