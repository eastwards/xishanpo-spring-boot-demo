package com.xishanpo.demo.design.abstractfactory;


public class FactoryTest {

    public static void main(String[] args) {

        AbstractFactory boxFactory = FactoryProducer.getFactory("box");

        Box aa = boxFactory.getBox("AA");

        aa.open();
        aa.close();

        Box bb = boxFactory.getBox("BB");

        bb.open();
        bb.close();

        AbstractFactory doorFactory = FactoryProducer.getFactory("door");

        Door daa = doorFactory.getDoor("AA");

        daa.open();
        daa.close();

        Door dbb = doorFactory.getDoor("BB");

        dbb.open();
        dbb.close();
    }
}
