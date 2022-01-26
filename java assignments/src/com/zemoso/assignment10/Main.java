package com.zemoso.assignment10;

public class Main {
    public static void main(String[] args) {
        SList<String> list=new SList<>();
        SListIterator<String> iterator= list.iterator();
        iterator.add("alice");
        iterator.add("ronnie");
        iterator.add("betty");
        iterator.add("cooper");
        iterator.remove();
        System.out.println(list.toString(iterator));

        //int
        SList<Integer> list1=new SList<>();
        SListIterator<Integer> iterator1= list.iterator();
        iterator1.add(1);
        iterator1.add(2);
        iterator1.add(3);
        iterator1.add(4);
        System.out.println(list1.toString(iterator1));


    }
}

