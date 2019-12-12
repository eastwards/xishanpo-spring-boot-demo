package com.xishanpo.demo.design.abstractfactory;

public class DoorFactory extends AbstractFactory {
    @Override
    public Box getBox(String box) {
        return null;
    }

    @Override
    public Door getDoor(String door) {

        if (null == door) {
            return null;
        }

        if ("AA".equals(door)) {
            return new DoorAA();
        }

        if ("BB".equals(door)) {
            return new DoorBB();
        }

        return null;
    }
}
