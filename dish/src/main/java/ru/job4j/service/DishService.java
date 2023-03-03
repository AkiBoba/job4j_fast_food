package ru.job4j.service;

import ru.job4j.models.Dish;

import java.util.Collection;

public interface DishService {
    boolean add(Dish dish);

    Dish update(Dish dish);

    Dish delete(Dish dish);

    Dish findById(int id);

    Dish findByName(String name);

    Collection<Dish> findAll();
}
