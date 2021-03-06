package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given_three_numbers_when_added_to_linked_list_should_be_added_to_front() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.add(mySecondNode);
        linkedList.add(myThirdNode);
        linkedList.printMyNodes();

        boolean result = linkedList.head.equals(myThirdNode) &&
                         linkedList.head.getNext().equals(mySecondNode);
                         linkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given_three_numbers_when_appended_to_linked_list_should_be_added_to_last() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.printMyNodes();

        boolean result = linkedList.head.equals(myFirstNode) &&
                linkedList.head.getNext().equals(mySecondNode);
        linkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void when_a_number_is_inserted_should_be_middle() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(myThirdNode);
        linkedList.insert(mySecondNode, myThirdNode);
        linkedList.printMyNodes();

        boolean result = linkedList.head.equals(myFirstNode) &&
                linkedList.head.getNext().equals(mySecondNode);
                linkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void first_number_should_be_deleted_by_pop() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.popFirst();
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(mySecondNode) &&
                         linkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void last_number_should_be_deleted_by_popLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);

        linkedList.popLast();
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(myFirstNode) &&
                         linkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void when_three_numbers_given_search_a_number() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.search(mySecondNode);
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(myFirstNode) &&
                linkedList.head.getNext().equals(mySecondNode);
        linkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}