package com.zemoso.assignment7.accesscontrol_1;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Gerbil();
        rodents[1]=new Hamster();
        rodents[2]=new Mouse();

        for(int i=0;i<rodents.length;i++)
        {
            rodents[i].eat();
            rodents[i].place();
        }

    }
}
