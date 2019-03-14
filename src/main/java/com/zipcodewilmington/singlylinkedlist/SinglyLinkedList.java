package com.zipcodewilmington.singlylinkedlist;

import java.util.Map;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    public static SinglyLinkedList myLinkedList;



    private static int counter;
    private Node head;

    public SinglyLinkedList() {

    }


    private int listCount;


    public void add(Object data) {


        if (head == null) {
            head = new Node(data);
        }

        Node listTemp = new Node(data);
        Node listCurrent = head;

        if (listCurrent != null) {

            while (listCurrent.getNext() != null) {
                listCurrent = listCurrent.getNext();
            }

            listCurrent.setNext(listTemp);
        }

        incrementCounter();


    }
    public void remove(Object data) {

        Node listCurrent = head;
        Node prev = null;
        if (listCurrent != null && listCurrent.data == data) {
            head = listCurrent.next;
            return;
        }
        while (listCurrent != null && listCurrent.data != data)
        {
            prev = listCurrent;
            listCurrent = listCurrent.getNext();
        }
        if (listCurrent == null) return;

        // Unlink the node from linked list
        prev.setNext(listCurrent.getNext());
    }


    public void removeAtIndex(int index) {
        Node listCurrent = head;

        if (listCurrent != null){


            for (int i=0; i<index; i++) {

                if (listCurrent.getNext() == null) {
                    System.out.println("No Element");
                }


                listCurrent = listCurrent.getNext();





            }
            listCurrent.setNext(listCurrent.getNext().getNext());


     decrementCounter();

            }
        }




    public void clear(SinglyLinkedList<T> myNewList) {


              Integer size  = myNewList.size();


            for (int i=0; i<size;) {

                removeAtIndex(i);
                size=size-1;

                 }


            }



    public void clearAll() {


        Node listCurrent = head;
        head=null;
    }








        public SinglyLinkedList <T> copyList(SinglyLinkedList<T> mylist) {


            SinglyLinkedList<T> myNewList = new SinglyLinkedList();
            Node listCurrent = head;

            if (listCurrent != null) {


                for (int i = 0; i < mylist.size(); i++) {

                    if (listCurrent.getNext() == null) {
                       break;
                   }


                    listCurrent = listCurrent.getNext();


                    Object addNode =  listCurrent.getData();

                    myNewList.add(addNode);

                }

            }


            return myNewList;
        }



    public SinglyLinkedList<T>sortedList(SinglyLinkedList<T> mylist) {


        SinglyLinkedList<T> mySortedList = new SinglyLinkedList();
        Node listCurrent = head;
        Node newNode = null;
        Node listtemp=null;


        if (listCurrent != null) {


            //for (int i = 0; i < mylist.size(); i++) {

                if (listCurrent.getData().hashCode()<listCurrent.getNext().getData().hashCode()) {

                    mySortedList.add(listCurrent.getData());

                    listCurrent = listtemp;

                    listCurrent = listCurrent.getNext();


                }

            }
        return mySortedList;
        }



    public Object getAtIndex(int index) {
        Node listCurrent = head;

        if (listCurrent != null){


            for (int i=0; i<=index; i++) {

                if (listCurrent.getNext() == null) {
                    System.out.println("No Element");
                }


                listCurrent = listCurrent.getNext();

            }
         }
        return listCurrent.getData();
    }



    public Integer size(){

        Node listCurrent = head;

        for (int i=0; listCurrent==null ; i++){
            incrementCounter();

        }

     return counter;

    }




    public Boolean isContain(Object data){
        Node listCurrent = head;
      Boolean  ans = true;

        Node prev = null;
        if (listCurrent != null && listCurrent.getData() == data) {
            head = listCurrent.next;
            ans = true;
        }
        while (listCurrent != null && listCurrent.getData() != data)
        {
            prev = listCurrent;
            listCurrent = listCurrent.next;
        }
        if (listCurrent == null) {
            ans =  false;
        }
     return ans;

    }




    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }





    public String toString() {
        String output = "";
        Node listCurrent = head;

        if (head != null) {
           listCurrent = head.getNext();
            while (listCurrent != null) {
                output += "[" +listCurrent.getData().toString() + "]";
                listCurrent = listCurrent.getNext();
            }

        }
        return output;
    }







    private class Node<Object>{
        Object data;
        Node next;


        public   Node(Object dataValue)
        {
            data = dataValue;
            next = null;
        }




        public Object getData() {
            return data;
        }
        public void setData() {
            this.data = data;
        }

        public void setData(Object dataValue) {
            this.data=dataValue;
        }




        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}








