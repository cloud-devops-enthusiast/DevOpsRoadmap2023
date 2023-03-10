public class narrowing {
    // Narrowing is the process of converting a value of a larger data type to a smaller data type.
    public static void main(String[] args){
        float a = 10.5f;
        int b = (int) a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
Output:
a = 10.5
b = 10
 */