package com.it.demo.creational.factory.factorymethod;

public class TriangleFactory implements FigureFactory{
    @Override
    public Shape createFigure() {
        return new Triangle();
    }
}
