package model;

import lombok.Data;

import java.util.List;

@Data
public class Kitchen {
    private int id;
    private List<Order> orders;
}
