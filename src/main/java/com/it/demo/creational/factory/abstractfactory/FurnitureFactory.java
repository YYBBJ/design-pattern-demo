package com.it.demo.creational.factory.abstractfactory;

public interface FurnitureFactory {
    Chair getChair();
    Sofa getSofa();
    CoffeeTable getCoffeeTable();
}
