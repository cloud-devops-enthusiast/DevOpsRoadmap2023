import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args){
        //Creating a scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //Taking input from user
        int num = scan.nextInt();
        //Method calling
        findEvenOdd(num);
    }
    //Method definition
    public static void findEvenOdd(int num){
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
/*
Output:
Enter a number: 
2222
*/