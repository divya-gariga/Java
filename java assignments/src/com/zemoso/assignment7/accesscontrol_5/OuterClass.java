package com.zemoso.assignment7.accesscontrol_5;

public class OuterClass {

    int x=10;
    public class InnerClass{
        int y=20;
        public void print(){
            System.out.println("Inner class of outer class");
        }
    }
}
