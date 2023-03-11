public class nestedifStatement2 {
    public static void main(String[] args){
        int age = 12;
        int weight = 120;
        //apply conditions based on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
            else{
                System.out.println("You are not-eligible to donate blood");
            }
        }
        else{
            System.out.println("You are not-eligible to donate blood");
        }
    }
}
/*
Output:
You are not-eligible to donate blood
 */