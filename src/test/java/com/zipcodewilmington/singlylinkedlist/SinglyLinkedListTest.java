package com.zipcodewilmington.singlylinkedlist;
/**
 * Created by leon on 1/10/18.
 */



import org.junit.*;
//import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class SinglyLinkedListTest {


    SinglyLinkedList mycopylist = new SinglyLinkedList();
     SinglyLinkedList myclearlist = new SinglyLinkedList();


    @Test

    public void add() {
        SinglyLinkedList myprevlist = new SinglyLinkedList();


        myprevlist.add(4);
        myprevlist.add(2);
        myprevlist.add(5);
        myprevlist.add(3);
        myprevlist.add(1);

        Integer expectedSize = 15;
        Integer actualSize = myprevlist.size();

        Assert.assertEquals(expectedSize, actualSize);


    }


//
//   //@Test
// //   public void remove() {
//
//       mylist.remove(4);
//        Integer expectedSize =4;
//        Integer actualSize = mylist.size();
//
//
//        Assert.assertFalse(mylist.isContain(4));
//       // Assert.assertEquals(expectedSize,actualSize);
//
//
//
//    }

    @Test

    public void removeAtIndex() {
        SinglyLinkedList myprevlist = new SinglyLinkedList();



        myprevlist.add(4);
        myprevlist.add(2);
        myprevlist.add(5);
        myprevlist.add(3);
        myprevlist.add(1);


        myprevlist.removeAtIndex(1);
        Integer expectedSize = 34;
        Integer actualSize = myprevlist.size();


        // Assert.assertFalse(mylist.isContain(2));
        Assert.assertEquals(expectedSize, actualSize);


    }



    public void sortedList() {
    }

    @Test
    public void getAtIndex() {
        SinglyLinkedList myprevlist = new SinglyLinkedList();

        myprevlist.clearAll();

        myprevlist.add(4);
        myprevlist.add(2);
        myprevlist.add(5);
        myprevlist.add(3);
        myprevlist.add(1);


        Object expectedData = 2;

        Object actualData = myprevlist.getAtIndex(1);

        Assert.assertEquals(expectedData, actualData);


    }

    @Test
    public void size() {
        SinglyLinkedList mylist = new SinglyLinkedList();

        mylist.add(4);
        mylist.add(2);
        mylist.add(5);
        mylist.add(3);
        mylist.add(1);

        Integer expectedSize = 20;
        Integer actualSize = mylist.size();
        Assert.assertEquals(expectedSize, actualSize);


    }


    @Test
    public void clearTest() {
        SinglyLinkedList mylist = new SinglyLinkedList();

        mylist.add(4);
        mylist.add(2);
        mylist.add(5);
        mylist.add(3);
        mylist.add(1);
        mylist.add(7);
        mylist.add(9);


        mylist.clear(mylist);

        Integer expectedSize = 0;
        Integer actualSize = mylist.size();
        Assert.assertEquals(expectedSize, actualSize);

    }



@Test
    public void isContain() {

        SinglyLinkedList myfavlist = new SinglyLinkedList();

        myfavlist.add(4);
        myfavlist.add(2);
        myfavlist.add(5);
        myfavlist.add(3);
        myfavlist.add(1);


        Assert.assertFalse(myfavlist.isContain(8));
    }

    @Test
    public void copyList() {
        SinglyLinkedList myfavlist = new SinglyLinkedList();

        myfavlist.add(4);
        myfavlist.add(2);
        myfavlist.add(5);
        myfavlist.add(3);
        myfavlist.add(1);


        mycopylist = myfavlist.copyList(myfavlist);


        // Assert.assertFalse(mylist.isContain(4));
        Assert.assertEquals(mycopylist.size(), myfavlist.size());


    }





}
