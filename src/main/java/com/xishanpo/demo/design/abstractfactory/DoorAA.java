package com.xishanpo.demo.design.abstractfactory;

public class DoorAA implements Door {


    @Override
    public void open() {
        System.out.println("Door AA opening!");
    }

    @Override
    public void close() {
        System.out.println("Door AA closed!");
    }
}
