package com.it.demo.creational.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        /**
         * 创建一批家具，椅子，沙发，茶几。它们分为现代风格，传统风格
         */
        FurnitureFactory factory=new ModernFurnitureFactory();
        System.out.println(factory.getSofa().getSofaName());
    }
}
