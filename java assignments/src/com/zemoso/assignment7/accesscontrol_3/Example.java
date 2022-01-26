package com.zemoso.assignment7.accesscontrol_3;

public class Example extends Concrete implements CommonInterface{

    @Override
    public void commonMethod() {
        System.out.println("This is the common interface method");
    }

    @Override
    public void someInterface1() {
        System.out.println("Method of someInterface1");
    }

    @Override
    public void someInterface2() {
        System.out.println("Method of someInterface2");
    }

    @Override
    public void someInterface3() {
        System.out.println("Method of someInterface3");
    }

    @Override
    public void method1(SomeInterface1 interface1) {
        interface1.someInterface1();
    }
}
