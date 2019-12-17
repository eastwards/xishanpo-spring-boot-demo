package com.xishanpo.demo.design.factory;

public class BoxFactory {

    public static Box getBox(String box) {

        if (null == box) {
            return null;
        }

        if ("AA".equals(box)) {
            return new BoxAA();
        }

        if ("BB".equals(box)) {
            return new BoxBB("BB");
        }

        return null;
    }

}
