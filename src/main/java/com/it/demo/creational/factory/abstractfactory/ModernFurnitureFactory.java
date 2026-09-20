package com.it.demo.creational.factory.abstractfactory;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return null;
    }
}
