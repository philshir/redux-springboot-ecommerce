package com.reduxtravelerspringboot.ecommerce.service;

import com.reduxtravelerspringboot.ecommerce.dto.Purchase;
import com.reduxtravelerspringboot.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}