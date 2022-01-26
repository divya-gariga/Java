package com.zemoso.assignment7.accesscontrol_5;

public class Main {
    public static void main(String[] args) {
        SecondOuterClass outer=new SecondOuterClass();
        SecondOuterClass.SecondInnerClass inner=outer.new SecondInnerClass();
        System.out.println(inner.y);
        inner.print();
    }
}
