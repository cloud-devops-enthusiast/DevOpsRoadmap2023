public class instanceMethod {
    public static void main(String[] args){
        //Creating an object of the class
        instanceMethod obj = new instanceMethod();
        //Invoking the method
        System.out.println("The sum is: " + obj.add(33, 87));
    }
    int result;
    public int add(int a, int b){
       int result = a + b;
       return result;
    }
}
/*
Output:
The sum is: 120
*/