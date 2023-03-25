package Queue;

import java.util.*;

// Java program for linked-list implementation of queue

public class linkedListQueue{
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + ((q.front != null) ? (q.front).key : -1));
        System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).key : -1));
    }
}

// A linked list (LL) node to store a queue entry

class Qnode{
    int key;
    Qnode next;

    // constructor to create a new linked list node

    public Qnode(int key){
        this.key=key;
        this.next=null;
    }
}

class Queue{
    Qnode front, rear;
    public Queue() { this.front = this.rear = null; }
 
    // Method to add an key to the queue.
    void enqueue(int key)
    {
 
        // Create a new LL node
        Qnode temp = new Qnode(key);
 
        // If queue is empty, then new node is front and
        // rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
 
        // Add the new node at the end of queue and change
        // rear
        this.rear.next = temp;
        this.rear = temp;
    }
 
    // Method to remove an key from queue.
    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;
 
        // Store previous front and move front one node
        // ahead
        Qnode temp = this.front;
        this.front = this.front.next;
 
        // If front becomes NULL, then change rear also as
        // NULL
        if (this.front == null)
            this.rear = null;
    }
}
/*
Output:
Queue Front : 40
Queue Rear : 50
*/