package com.zemoso.assignment8;

public class Main {
    public static void main(String[] args) {
        try{
            Vote vote=new Vote();
            vote.voting(16,"USA","no");
        }
        catch(InvalidAgeException | ResidencyNotMatch | NotRegistered e)
        {
            System.out.println(e.getMessage());
        }
    }
}
