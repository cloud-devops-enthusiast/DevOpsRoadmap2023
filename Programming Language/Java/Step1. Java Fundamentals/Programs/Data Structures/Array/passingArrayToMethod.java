package Array;

public class passingArrayToMethod {
    private static void printArray(Integer[] intArray){
        System.out.println("Array contents printed through method");
        for(Integer val: intArray){
            System.out.println(val+" ");
        }
    }
    public static void main(String[] args){
        Integer[] intArray = {95,61,62,24,49,84,59,49,69,62};
        printArray(intArray);
    }
}
