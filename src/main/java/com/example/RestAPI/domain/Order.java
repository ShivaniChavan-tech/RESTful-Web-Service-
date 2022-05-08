package com.example.RestAPI.domain;

public class Order {
    
    private int orderId;
    private String currency;
    private String subtotal;
    private String discountAmount;
    private String taxAmount;
    private String grandTotal;
    private LineItems[] lineItems;

    
    //#region Getter / Setter
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    public String getDiscountAmount() {
        return discountAmount;
    }
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }
    public String getTaxAmount() {
        return taxAmount;
    }
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }
    public String getGrandTotal() {
        return grandTotal;
    }
    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }
    public LineItems[] getLineItems() {
        return lineItems;
    }
    public void setLineItems(LineItems[] lineItems) {
        this.lineItems = lineItems;
    }
    //#endregion

}
