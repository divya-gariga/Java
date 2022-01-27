package com.zemoso.assignment6;

public class ConstructorOverloading {
    int x,y;
ConstructorOverloading(){
    this(10,20);
}
ConstructorOverloading(int x, int y)
{
    this.x=x;
    this.y=y;
    System.out.println(x+y);
}

    public static void main(String[] args) {
        ConstructorOverloading add=new ConstructorOverloading();
    }
}

