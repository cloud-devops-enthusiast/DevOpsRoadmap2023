package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class exampleQueue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        // add elements to the queue
        for(int i=0; i<5; i++)
            q.add(i);
        // display the queue
        System.out.println("Elements of queue: " + q);
        // remove the head of the queue
        int removedHead = q.remove();
        System.out.println("Removed element: " + removedHead);
        // view the head of the queue
        System.out.println("Elements of queue: " + q);
        // view the queue after removing the head
        int head = q.peek();
        System.out.println("Head of queue: " + head);
        // To view the head of the queue
        int size = q.size();
        System.out.println("Size of queue: " + size);
        // To view the size of the queue
    }    
}
/*
Output:
Elements of queue: [0, 1, 2, 3, 4]
Removed element: 0
Elements of queue: [1, 2, 3, 4]
Head of queue: 1
Size of queue: 4
*/