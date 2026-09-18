package com.it.demo.creational.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        FigureFactory factory=new SquareFactory();
        Shape figure = factory.createFigure();
        figure.draw();
    }
}
