import java.util.*;
import java.io.*;

public class removingElementHashtable {
    public static void main(String[] args){
        //Creating a hashtable
        Map<Integer, String> ht = new Hashtable<Integer, String>();

        //Adding key-value pairs to a hashtable
        ht.put(1, "Abhinav");
        ht.put(2, "Virpal");
        ht.put(3, "Singh");

        //Displaying hashtable
        System.out.println("Initial map: "+ht);

        //Removing value for key 2
        ht.remove(2);

        //Displaying updated hashtable
        System.out.println("Updated map: "+ht);
    }
}

/*
Output:
Initial map: {3=Singh, 2=Virpal, 1=Abhinav}
Updated map: {3=Singh, 1=Abhinav}
*/