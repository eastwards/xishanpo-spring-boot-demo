package com.xishanpo.demo.design.abstractfactory;

public class DoorBB implements Door {


    @Override
    public void open() {
        System.out.println("Door BB opening!");
    }

    @Override
    public void close() {
        System.out.println("Door BB closed!");
    }

}
