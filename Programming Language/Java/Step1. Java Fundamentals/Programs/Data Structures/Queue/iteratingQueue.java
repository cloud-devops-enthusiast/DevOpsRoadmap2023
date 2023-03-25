package Queue;

import java.util.*;
import java.util.LinkedList;

public class iteratingQueue {
    public static void main(String[] args){
        Queue<String> pq = new LinkedList<>();
        pq.add("I");
        pq.add("like");
        pq.add("coding");
        pq.add("in silent");
        pq.add("environment");
        Iterator iterator = pq.iterator(); 
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            // Print the queue elements in same line
        }
    }
}
/*
Output:
I like coding in silent environment
*/