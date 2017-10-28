package com.africastalking.models.payment.checkout;

public class CheckoutResponse {

    private String status;
    private String description;
    private String transactionId;
    private String checkoutToken;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setCheckoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    public String getCheckoutToken() {
        return checkoutToken;
    }
}
