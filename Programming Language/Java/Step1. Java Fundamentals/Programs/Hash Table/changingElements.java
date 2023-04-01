import java.util.*;
import java.io.*;

public class changingElements {
    public static void main(String[] args){
        //Creating a Hashtable
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        //Adding key-value pairs to a Hashtable
        ht.put(1, "Abhinav");
        ht.put(2, "V");
        ht.put(3, "Singh");
        //Displaying Hashtable
        System.out.println("Initial map: "+ht);
        //Updating value for key 2
        ht.put(2, "Virpal");
        //Displaying Updated Hashtable
        System.out.println("Updated map: "+ht);
    }
}

/*
Output:
Initial map: {3=Singh, 2=V, 1=Abhinav}
Updated map: {3=Singh, 2=Virpal, 1=Abhinav}
 */