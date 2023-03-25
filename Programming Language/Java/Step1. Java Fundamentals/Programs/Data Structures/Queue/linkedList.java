package Queue;

import java.util.*;

public class linkedList {
    public static void main(String[] args){
        Queue<Integer> lQueue = new LinkedList<Integer>();
        lQueue.add(10);
        lQueue.add(20);
        lQueue.add(30);
        lQueue.add(40);
        // Printing the top element of the LinkedList
        System.out.println(lQueue.peek());
        // Printing the top element and removing it from the LinkedList container
        System.out.println(lQueue.poll());
        // Printing the top element again
        System.out.println(lQueue.peek());
    }
}
/*
Output:
10
10
20
*/