package model;

import lombok.Data;

@Data
public class Delivery {
    private int id;
    private User courier;
    private Order order;
}
