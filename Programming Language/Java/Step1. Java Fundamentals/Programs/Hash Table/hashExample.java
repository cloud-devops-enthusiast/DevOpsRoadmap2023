import java.util.Hashtable;
import java.util.Enumeration;

public class hashExample {
    public static void main(String[] args){
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("A", 1);
        ht.put("B", 2);
        ht.put("C", 3);
        ht.put("D", 4);
        ht.put("E", 5);
        ht.put("F", 6);
        ht.put("G", 7);
        ht.put("H", 8);

        int ValueString = ht.get("A");
        System.out.println("Value of String A"+ValueString);

        ht.remove("A",8);

        Enumeration<String> keys = ht.keys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Key: "+key+" & Value: "+ht.get(key));
        }
    }
}

/*
Output:
Value of String A1
Key: A & Value: 1
Key: H & Value: 8
Key: G & Value: 7
Key: F & Value: 6
Key: E & Value: 5
Key: D & Value: 4
Key: C & Value: 3
Key: B & Value: 2
*/