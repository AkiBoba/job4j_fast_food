package model;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int id;
    private String status;
    private User user;
    private List<Dish> dishes;
}
