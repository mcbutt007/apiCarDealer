package com.nhom7java.cardealer.services;

import com.nhom7java.cardealer.models.Order;
import com.nhom7java.cardealer.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order order) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder != null) {
            // Update the fields of the existing order with the new order data
            existingOrder.setCar(order.getCar());
            existingOrder.setCustomer(order.getCustomer());
            existingOrder.setOrderDate(order.getOrderDate());
            //... update other fields as needed
            return orderRepository.save(existingOrder);
        } else {
            return null;
        }
    }

    public boolean deleteOrder(Long id) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder != null) {
            orderRepository.delete(existingOrder);
            return true;
        } else {
            return false;
        }
    }
}