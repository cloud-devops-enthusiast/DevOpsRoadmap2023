import java.io.*;
import java.util.*;

public class hashInitialCapacity {
    public static void main(String[] args){
        Hashtable<Integer, String> ht1 = new Hashtable<>(4);

        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);

        //Loading data into ht1
        ht1.put(1, "One");
        ht1.put(2, "Two");
        ht1.put(3, "Three");

        //Loading data into ht2
        ht2.put(4, "Four");
        ht2.put(5, "Five");
        ht2.put(6, "Six");

        //Displaying ht1
        System.out.println("Mappings of ht1" + ht1);

        //Displaying ht2
        System.out.println("Mappings of ht2" + ht2);
    }
}

/*
Output:
Mappings of ht1{3=Three, 2=Two, 1=One}
Mappings of ht2{4=Four, 6=Six, 5=Five}
*/