abstract class abstract_Method { //abstract class
    abstract void display(); //abstract method
}
public class abstractMethod extends abstract_Method {
    //abstract method implementation
    void display(){
        System.out.println("This is an abstract method");
    }

public static void main(String[] args){
    //Creating object of abstract class
    abstractMethod obj = new abstractMethod();
    //invoking abstract method
    obj.display();
}
}
/*
Output:
This is an abstract method
*/