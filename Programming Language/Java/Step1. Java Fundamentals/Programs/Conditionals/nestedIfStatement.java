public class nestedIfStatement {
    public static void main(String[] args){
        int age = 23;
        int weight = 70;
        if(age>=18){
            if(weight>=50){
                System.out.println("You are over-weight");
            }
        }
    }
}
/*
Output:
You are over-weight
 */