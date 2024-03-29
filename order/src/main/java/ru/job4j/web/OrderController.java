package ru.job4j.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.models.Order;
import ru.job4j.service.OrderService;

@RestController
public class OrderController {
    private OrderService orderService;

    @GetMapping("/order")
    public String getOrder() {
        return "order";
    }

    @PostMapping("/createOrder")
    public String createOrder(Order order, Model model) {
        model.addAttribute("order", orderService.createOrder(order));
        model.addAttribute("status", orderService.checkStatus(order.getId()));
        return "order";
    }

    @GetMapping("/createOrderForm")
    public String createOrderForm() {
        return "createOrderForm";
    }

}
