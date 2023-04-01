import java.util.*;
import java.io.*;

public class traversalHashTable {
    public static void main(String[] args){
        //Creating a hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        //Adding key-value pairs to a hashtable
        ht.put("Abhinav", 1);
        ht.put("Virpal", 2);
        ht.put("Singh", 3);
        
        //Displaying hashtable
        for(Map.Entry<String, Integer> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

/*
Output:
Virpal 2
Singh 3
Abhinav 1
*/