import java.util.Scanner;
public class additionMethod {
    public static void main(String[] args){
        //Creating a scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //Taking input from user
        int num1 = scan.nextInt();
        System.out.println("Enter another number: ");
        //Taking input from user
        int num2 = scan.nextInt();
        //Method calling
        addition(num1,num2);
    }
    //Method definition
    public static void addition(int num1,int num2){
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
/*
Output:
Enter a number: 
99
Enter another number: 
77
The sum of the two numbers is: 176
*/