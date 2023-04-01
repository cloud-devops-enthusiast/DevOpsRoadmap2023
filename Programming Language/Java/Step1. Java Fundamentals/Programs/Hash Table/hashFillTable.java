import java.util.*;

public class hashFillTable {
    public static void main(String[] args){
        //No need to specify the generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>(4, 0.75f);

        //Initialization of hashtable using generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(3, 0.5f);

        //Inserting elements into ht1
        ht1.put(1, "One");
        ht1.put(2, "Two");
        ht1.put(3, "Three");

        //Inserting elements into ht2
        ht2.put(4, "Four");
        ht2.put(5, "Five");
        ht2.put(6, "Six");

        //Print the mappings of both the hash tables
        System.out.println("Mappings of ht1: " + ht1);
        System.out.println("Mappings of ht2: " + ht2);
    }
}

/*
Output:
Mappings of ht1: {3=Three, 2=Two, 1=One}
Mappings of ht2: {6=Six, 5=Five, 4=Four}
*/