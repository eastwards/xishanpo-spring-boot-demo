package com.xishanpo.demo.design.abstractfactory;

public class BoxFactory extends AbstractFactory {

    @Override
    public Box getBox(String box) {

        if (null == box) {
            return null;
        }

        if ("AA".equals(box)) {
            return new BoxAA();
        }

        if ("BB".equals(box)) {
            return new BoxBB();
        }

        return null;
    }

    @Override
    public Door getDoor(String door) {
        return null;
    }
}
