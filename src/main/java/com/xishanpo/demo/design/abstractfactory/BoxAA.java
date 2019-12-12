package com.xishanpo.demo.design.abstractfactory;

public class BoxAA implements Box {


    @Override
    public void open() {
        System.out.println("Box AA opening!");
    }

    @Override
    public void close() {
        System.out.println("Box AA closed!");
    }
}
