package Array;

public class multiDimensionalArray {
    public static void main(String[] args){
        int[][] matrix = {{95,61},{62,24},{49,69}};
        //Use nested for loops to access rows and columns
        for(int i=0; i < 3; i++){
            for(int j=0; j < 2; j++){
                System.out.print("matrix[" + i + "][]" + j + "] = " + matrix[i][j] + "\n");
            }
        }
    }
}
/*
Output:
matrix[0][]0] = 95
matrix[0][]1] = 61
matrix[1][]0] = 62
matrix[1][]1] = 24
matrix[2][]0] = 49
matrix[2][]1] = 69
*/