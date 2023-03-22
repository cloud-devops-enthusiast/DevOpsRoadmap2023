package Array;
/*
Searchingh for value 2 in the array

loop from i=0 to arr.length
    check if arr[i] == 2
        print "Found"
 */
public class searchingInArray {
    public static void main(String[] args){
        int[] arr = new int[10];
        //Declaring a new integer array and assigning values to it
        arr[0] = 95;
        arr[1] = 61;
        arr[2] = 62;
        arr[3] = 24;
        arr[4] = 49;
        arr[5] = 84;
        arr[6] = 59;
        arr[7] = 49;
        arr[8] = 69;
        arr[9] = 62;
        //Assigning values to the array
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 69){
                System.out.println(arr[i]+" is Found at index " + i);
            }
        }
    }
}
/*
Output:
69 is Found at index 8
*/