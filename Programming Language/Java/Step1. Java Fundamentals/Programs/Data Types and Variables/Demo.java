class demo{
    public static void main(String[] args){
        byte x;
        int a = 270;
        double b = 128.128;
        System.out.println("Int coverted to byte.");
        x = (byte) a;
        System.out.println("a and x:" + a + "" + x);
        System.out.println("Double coverted to int.");
        a = (int) b;
        System.out.println("b and a:" + b + "" + a);
        System.out.println("\nDouble coverted to byte.");
        x = (byte) b;
        System.out.println("b and x:" + b + "" + x);
    }
}

/*Output:
Int coverted to byte.
a and x:27014
Double coverted to int.
b and a:128.128128      

Double coverted to byte.
b and x:128.128-128
*/