public class widening {
    // Widening is the process of converting a value of a smaller data type to a larger data type.
    public static void main(String[] args){
        int a = 10;
        float b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

/*
Output:
a = 10
b = 10.0
*/