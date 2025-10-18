package com.example.springBoot;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Products {
    private String billingProductId;
    private String validityStartDate;
    private String validityEndDate;

    public Products(String billingProductId, String validityStartDate, String validityEndDate) {
        this.billingProductId = billingProductId;
        this.validityStartDate = validityStartDate;
        this.validityEndDate = validityEndDate;
    }
    // getter functions
    public String getBillingProductId() { return billingProductId; }
    public String getValidityStartDate() { return validityStartDate; }
    public String getValidityEndDate() { return validityEndDate; }
}


