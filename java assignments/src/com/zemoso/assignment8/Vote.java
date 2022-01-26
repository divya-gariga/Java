package com.zemoso.assignment8;

public class Vote {
    public void voting(int age,String residency,String registered) throws InvalidAgeException, ResidencyNotMatch, NotRegistered {
        if(age<18)
            throw new InvalidAgeException("Age is less than 18, you cannot vote");


        if(residency.equals("India"))
            System.out.println("you can vote");
        else
            throw new ResidencyNotMatch("You are not Indian, You cannot vote!");

        if(registered.equals("yes"))
            System.out.print("You can vote");
        else
            throw new NotRegistered("You aren't registered to vote");

    }
}
