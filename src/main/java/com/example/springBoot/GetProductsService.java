package com.example.springBoot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GetProductsService{

    public Products getProducts(String billingProductId, String validityStartDate, String validityEndDate  ) {
        return new Products( "123", "2025-10-16", "2025-12-16");
    }
}
