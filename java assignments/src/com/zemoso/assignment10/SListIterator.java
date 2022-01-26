package com.zemoso.assignment10;

public class SListIterator<T> {
    SList.Node<T> head;
    public void add(T data){
        if(head==null){
            SList.Node<T> node=new SList.Node<>(data);
            head=node;
        }
        else{
            SList.Node<T> node=new SList.Node<T>(data);
            SList.Node<T> temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void remove()
    {
        if(head==null)
            System.out.println("List is empty");
        else if(head.next==null)
            head=null;
        else
        {
            SList.Node<T> temp=head;
            SList.Node<T> previous=temp;
            while(temp.next!=null)
            {
                previous=temp;
                temp=temp.next;
            }
            previous.next=null;
        }
    }

}
