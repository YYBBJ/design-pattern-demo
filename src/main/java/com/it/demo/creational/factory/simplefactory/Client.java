package com.it.demo.creational.factory.simplefactory;
public class Client {

    public static void main(String[] args) {
        /**
         * 需求，需要画很多种不同的形状，比如：正方形，长方形，三角形...
         */
        Shape square = FigureFactory.crateFigure("正方形");
        square.draw();
    }
}
