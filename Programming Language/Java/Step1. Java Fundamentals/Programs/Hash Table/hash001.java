import java.util.*;

public class hash001 {
    public static void main(String[] args){
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("One", 1);
        ht.put("Two", 2);
        ht.put("Three", 3);

        System.out.println("Size of map is: "+ ht.size());
        System.out.println("ht: " + ht);
        
        if(ht.containsKey("Two")){
            Integer a = ht.get("Two");
            System.out.println("Value for key \"Two\" is: "+ a);
        }
    }
}

/*
Output:
Size of map is: 3
ht: {One=1, Three=3, Two=2}
Value for key "Two" is: 2
*/