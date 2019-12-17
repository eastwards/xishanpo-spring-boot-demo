package com.xishanpo.demo.design.factory;

public class BoxAA implements Box {

    public String texture;

    BoxAA() {

    }

    BoxAA(String texture) {
        this.texture = texture;
    }


    @Override
    public void open() {
        System.out.println("Box AA opening! " + this.texture);
    }

    @Override
    public void close() {
        System.out.println("Box AA closed! " + this.texture);
    }
}
