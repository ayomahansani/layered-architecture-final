package com.example.layeredarchitecture.model;

public class SearchOrderByCustomerDTO {

    private String name;
    private String orderId;
    private String date;

    public SearchOrderByCustomerDTO() {
    }

    public SearchOrderByCustomerDTO(String name, String orderId, String date) {
        this.name = name;
        this.orderId = orderId;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "SearchOrderByCustomerDTO{" +
                "name='" + name + '\'' +
                ", orderId='" + orderId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
