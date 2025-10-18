package com.example.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
//    Inversion of control
//    @Autowired
//        private GetProductsService getProductsService;

    // constructor dependency injection
    private final GetProductsService getProductsService;
    public ProductsController(GetProductsService getProductsService) {
        this.getProductsService = getProductsService;
    }


    @GetMapping("/products")
    public Products getProducts() {
        return getProductsService.getProducts("123", "2025-10-16", "2025-12-16");
    }

}
