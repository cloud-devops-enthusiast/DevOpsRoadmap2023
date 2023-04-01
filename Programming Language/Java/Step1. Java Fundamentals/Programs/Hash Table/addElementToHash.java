import java.io.*;
import java.util.*;

public class addElementToHash {
    public static void main(String[] args){
        // Create a hash table ht1
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        // Create a hash table ht2
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
        // Add elements to ht1
        ht1.put(1, "One");
        ht1.put(2, "Two");
        ht1.put(3, "Three");
        // Add elements to ht2
        ht2.put(4, "Four");
        ht2.put(5, "Five");
        ht2.put(6, "Six");
        // Print ht1 and ht2
        System.out.println("ht1: " + ht1);
        System.out.println("ht2: " + ht2);

    }
}

/*
Output:
ht1: {3=Three, 2=Two, 1=One}
ht2: {6=Six, 5=Five, 4=Four}
*/