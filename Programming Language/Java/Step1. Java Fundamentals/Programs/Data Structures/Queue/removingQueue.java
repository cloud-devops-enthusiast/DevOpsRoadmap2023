package Queue;

import java.util.*;

public class removingQueue {
    public static void main(String[] args){
        Queue<String> pq = new LinkedList<>();
        pq.add("I");
        pq.add("like");
        pq.add("coding");
        pq.add("in silent");
        pq.add("environment");
        System.out.println("Initial Elements of queue: " + pq);
        // Print the queue elements
        pq.remove("environment");
        System.out.println("Elements of queue after removing: " + pq);
    }
}

/*
Output:
Initial Elements of queue: [I, like, coding, in silent, environment]
Elements of queue after removing: [I, like, coding, in silent]
 */