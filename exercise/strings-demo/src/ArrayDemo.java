public class ArrayDemo {
    public static void main(String[] args) {
        // Arrays. Наредена последователност от еднотипни елементи
        int[] myIntArray=new int[5];
        myIntArray[0]=0;
        myIntArray[3]=3;

        for(int i = 0; i < myIntArray.length; i++){
            System.out.printf("myIntArray [%1$d] = %2$d \n",i,myIntArray[i]);
        }

        // Foreach
        int[] myArray = {23,42,324, 65,76};
        for(int j: myArray){
            System.out.println(j);
        }

        String[] students={"Iliya","Jivlo","Nasko","Teodora","Desi"};

        // Multi dimensional array
        int[][] twoDimensionalArray;
        int[][][] threeDimensionalArray;

        int[][] matrix={
                {1,2,3,4}, // row 0 values
                {5,6,7,8} // row 1 values
        };
        // The matrix size is 2 x 4 (2 row, 4 cols)
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col<matrix[0].length;col++){
                System.out.printf("matrix[%1$d][%2$d] = %3$d \n", row, col, matrix[row][col]);
            }
            System.out.println();
        }

        int[][] matrixDefined = new int[2][3];
    }
}
