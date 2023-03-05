package ru.job4j.service;

import ru.job4j.models.Card;
import ru.job4j.models.Order;
import ru.job4j.models.Status;

public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Order order) {
        return new Order();
    }

    @Override
    public Card buyCard(Card card) {
        return new Card();
    }

    @Override
    public Status checkStatus(Integer orderId) {
        return null;
    }
}
