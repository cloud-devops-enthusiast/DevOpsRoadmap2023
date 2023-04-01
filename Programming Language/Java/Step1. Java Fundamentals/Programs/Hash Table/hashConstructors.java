import java.io.*;
import java.util.*;

public class hashConstructors {
    public static void main(String[] args){
        //Need to mention the generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        //Need to initialize a hashtable using generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

        //Loading data into ht1
        ht1.put(1, "One");
        ht1.put(2, "Two");
        ht1.put(3, "Three");

        //Loading data into ht2
        ht2.put(4, "Four");
        ht2.put(5, "Five");
        ht2.put(6, "Six");

        //Print mappings to the console of ht1 and ht2
        System.out.println("Mappings of ht1"+ht1);
        System.out.println("Mappings of ht2"+ht2);
    }    
}

/*
Output:
Mappings of ht1{3=Three, 2=Two, 1=One}
Mappings of ht2{6=Six, 5=Five, 4=Four}
*/