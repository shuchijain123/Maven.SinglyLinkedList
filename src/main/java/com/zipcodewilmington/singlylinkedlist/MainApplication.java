package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {


    public static void main(String[] args){
        SinglyLinkedList mylist = new SinglyLinkedList();
        SinglyLinkedList myNewlist = new SinglyLinkedList();
        SinglyLinkedList mySortedlist = new SinglyLinkedList();

        // add more elements to LinkedList
        mylist.add(4);
        mylist.add(2);
        mylist.add(5);
        mylist.add(3);
        mylist.add(1);

       System.out.println("Size of my List = " +mylist.size());

        if (mylist.isContain(8)){

            System.out.println("True;");
        }

      mySortedlist=  mylist.sortedList(mylist);

        System.out.println("my soreted list  is " +mySortedlist.toString());
        System.out.println("Element at Index 1= " +mylist.getAtIndex(1));

        System.out.println("Print: mylist: \t\t" + "" +mylist.toString());

        myNewlist = mylist.copyList(mylist);

        System.out.println("Print: myNewlist after Copy:" + " " +myNewlist.toString());

        mylist.removeAtIndex(1);
        mylist.remove(3);

        System.out.println("after removal (2) my List is " +mylist.toString());





    }
}
