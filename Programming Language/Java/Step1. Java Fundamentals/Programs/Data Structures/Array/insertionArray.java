package Array;

import java.util.Arrays;
//Import the arrays class from the java.util package

public class insertionArray {
    // Declare a public class named insertionArray
    public static void main(String[] args){
        // Declare a public static method named main that takes a string array as an argument
        int [] arr = new int[3];
        // Declare an integer array named arr and initialize it with a new array of size 3
        arr[0]=1;
        // Assign the value 1 to the first element of the array
        arr[1]=2;
        // Assign the value 2 to the second element of the array
        arr[2]=3;
        // Assign the value 3 to the third element of the array
        System.out.println(Arrays.toString(arr));
        // Print the array using the toString method of the Arrays class
    }
}
/*
Output:
[1, 2, 3]
*/