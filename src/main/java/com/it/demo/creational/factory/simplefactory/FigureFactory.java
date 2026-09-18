package com.it.demo.creational.factory.simplefactory;

public class FigureFactory {
    public static Shape crateFigure(String name){
        if(name.equals("正方形")){
            return new Square();
        }else if(name.equals("三角形")){
            return new Triangle();
        }
        return null;
    }
}
