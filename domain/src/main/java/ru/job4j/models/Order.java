package ru.job4j.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer id;
    private Customer customer;
    private Kitchen kitchen;
    private Dish dish;
    private String paymentType;

}
