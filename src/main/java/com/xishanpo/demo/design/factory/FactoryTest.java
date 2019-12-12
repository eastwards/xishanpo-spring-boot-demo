package com.xishanpo.demo.design.factory;

public class FactoryTest {

    public static void main(String[] args) {

        Box box1 = BoxFactory.getBox("AA");

        box1.open();
        box1.close();


        Box box2 = BoxFactory.getBox("BB");

        box2.open();
        box2.close();

    }
}
