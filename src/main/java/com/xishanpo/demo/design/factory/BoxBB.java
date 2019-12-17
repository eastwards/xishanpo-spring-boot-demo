package com.xishanpo.demo.design.factory;

public class BoxBB implements Box {


    public String texture;

    BoxBB() {

    }

    BoxBB(String texture) {
        this.texture = texture;
    }

    @Override
    public void open() {
        System.out.println("Box BB opening! " + this.texture);
    }

    @Override
    public void close() {
        System.out.println("Box BB closed! " + this.texture);
    }

}
