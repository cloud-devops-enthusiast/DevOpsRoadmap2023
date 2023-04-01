import java.io.*;
import java.util.*;

public class addelementhashtable {
    public static void main(String[] args){
        Map<Integer, String> Map = new HashMap<>();

        Map.put(1, "One");
        Map.put(2, "Two");
        Map.put(3, "Three");

        Hashtable <Integer, String> ht = new Hashtable<Integer, String>(Map);

        System.out.println("Mappings of ht: " + ht);
    }
}

/*
Output:
Mappings of ht: {3=Three, 2=Two, 1=One}
*/