package com.xishanpo.demo.design.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if ("box".equals(factory)) {
            System.out.println("Box Factory build.");
            return new BoxFactory();
        }
        if ("door".equals(factory)) {
            System.out.println("door Factory build.");
            return new DoorFactory();
        }
        return null;
    }
}
