package com.zemoso.assignment7.accesscontrol_2;

public class Main {
    public static void main(String[] args) {
        //upcasting
        Cycle cycle1=new Unicycle();
       // cycle1.balance(); //we can only call supertype specifics when upcasting
        cycle1.ride();

        //Downcasting
        Unicycle unicycle1=(Unicycle) cycle1;
        unicycle1.balance();
        unicycle1.ride(); //we can access all specific of subtype and supertype

    }
}
