package Queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class queueInterface {
    public static void main(String args[]){
        Queue<String> pq = new PriorityQueue<>();
        pq.add("i");
        pq.add("love");
        pq.add("programming");
        // Add elements to the queue
        System.out.println("Elements of queue: " + pq);
        // Print the queue elements
    }    
}
/*
Output:
Elements of queue: [i, love, programming]
 */