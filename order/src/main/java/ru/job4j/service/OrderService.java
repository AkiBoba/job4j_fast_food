package ru.job4j.service;

import ru.job4j.models.Card;
import ru.job4j.models.Order;
import ru.job4j.models.Status;

public interface OrderService {
    Order createOrder(Order order);
    Card buyCard(Card card);
    Status checkStatus(Integer orderId);
}
