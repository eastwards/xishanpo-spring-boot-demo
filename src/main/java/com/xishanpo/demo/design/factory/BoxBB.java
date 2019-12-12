package com.xishanpo.demo.design.factory;

public class BoxBB implements Box {


    @Override
    public void open() {
        System.out.println("Box BB opening!");
    }

    @Override
    public void close() {
        System.out.println("Box BB closed!");
    }

}
