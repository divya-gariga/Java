package com.zemoso.assignment7.accesscontrol_5;

public class OuterClass {
    public OuterClass() {
        System.out.println("Outer class");
    }
    public class InnerClass{
        public InnerClass()
        {
            System.out.println("Innerclass of outerclass");
        }
    }
}
