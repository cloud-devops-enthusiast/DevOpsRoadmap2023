public class AccessAndMutatorMethod {
    private static int roll;
    private String name;
    public int getRoll_No() {
        return roll;
    }
    public void setRoll_No(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        AccessAndMutatorMethod obj = new AccessAndMutatorMethod();
        //Calling mutator method to set value of roll and name
        obj.setRoll_No(1);
        obj.setName("Abhinav");
        //Calling accessor method to get value of roll and name
        System.out.println("Roll No: "+obj.getRoll_No());
        System.out.println("Name: "+obj.getName());
    }
}
/*
Output:
Roll No: 1
Name: Abhinav
*/