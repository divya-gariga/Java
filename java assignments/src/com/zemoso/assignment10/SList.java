package com.zemoso.assignment10;

public class SList<T> {

    public static class Node<T>{
        T data;
        Node<T> next;
        Node(T data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public SListIterator iterator(){
        return new SListIterator();
    }
    public String toString(SListIterator<T> iterator){
        Node<T> head=iterator.head;
        if(head==null)
            return "List is Empty";
        else {
            String str="";
            SList.Node<T> temp = head;
            while (temp.next != null) {
                str=str+temp.data+" ";
                temp=temp.next;
            }
            str+=temp.data;
            return str;
        }
    }

}
