public class overflow {
    public static void main(String[] args){
        int a = 130;
        byte b = (byte) a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
Output:
a = 130
b = -126 
 */