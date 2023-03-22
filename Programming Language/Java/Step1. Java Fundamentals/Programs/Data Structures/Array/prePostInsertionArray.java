package Array;

public class prePostInsertionArray {
    public static void main(String[] args){
        int arr[] = {95,61,62,24,49};
        int i;
        System.out.println("Elements of array are:");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]+"[Index:"+i+"]");
        }
        System.out.println("Inserting 69 at the beginning of array:");
        int temp[] = new int[arr.length+1];
        temp[0] = 69;
        for(i=0;i<arr.length;i++){
            temp[i+1] = arr[i];
        }
        arr = temp;
        System.out.println("Elements of array are:");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]+"[Index:"+i+"]");
        }
    }
}
/*
Output:
Elements of array are:
95[Index:0]
61[Index:1]
62[Index:2]
24[Index:3]
49[Index:4]
Inserting 69 at the beginning of array:
Elements of array are:
69[Index:0]
95[Index:1]
61[Index:2]
62[Index:3]
24[Index:4]
49[Index:5]
*/