public class positiveNegative {
    public static void main(String[] args){
        int number = -23;
        //Using ternary operator
        String Output=(number>0)?"Positive Number":(number<0)?"Negative Number":"Zero";
        System.out.println(Output);
    }
}
/*
Output:
Negative Number
 */