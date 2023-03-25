package Queue;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;

public class priorityQueue {
    public static void main(String[] args){
        Queue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(30);
        pQueue.add(40);
        // Printing the top element of
        // the PriorityQueue
        System.out.println(pQueue.peek());
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
        // Printing the top element again
        System.out.println(pQueue.peek());
    }
}
/*
Output:
10
10
20
*/