package org.example.desafio1sringboot.services;

import org.example.desafio1sringboot.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double freeShipping(Order order) {
        if (order.getBasic() < 100) {
            return 20;
        } else if (order.getBasic() < 200) {
            return 12;
        }
        return 0;
    }
}
