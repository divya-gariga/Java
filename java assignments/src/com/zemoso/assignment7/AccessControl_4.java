package com.zemoso.assignment7;

interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    public void ride(){
        System.out.println("Riding Unicycle");
    }
}
class UniCycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    public void ride(){
        System.out.println("Riding Bicycle");
    }
}
class BiCycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    public void ride(){
        System.out.println("Riding Tricycle");
    }
}
class TriCycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}

public class AccessControl_4 {
    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        rideCycle(new UniCycleFactory());
        rideCycle(new BiCycleFactory());
        rideCycle(new TriCycleFactory());
    }
}

