package org.example.desafio1sringboot.services;

import org.example.desafio1sringboot.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double totalAfterDiscount = calculateTotalAfterDiscount(order);
        double shippingCost = shippingService.freeShipping(order);
        return totalAfterDiscount + shippingCost;
    }

    private double calculateTotalAfterDiscount(Order order) {
        return order.getBasic() * (1 - order.getDiscount() / 100);
    }

}