package com.reduxtravelerspringboot.ecommerce.dto;

import com.reduxtravelerspringboot.ecommerce.entity.Address;
import com.reduxtravelerspringboot.ecommerce.entity.Customer;
import com.reduxtravelerspringboot.ecommerce.entity.Order;
import com.reduxtravelerspringboot.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}

