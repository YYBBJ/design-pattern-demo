package com.it.demo.creational.factory.factorymethod;

public class SquareFactory implements  FigureFactory{
    @Override
    public Shape createFigure() {
        return new Square();
    }
}
