package a12_Arrays.b04_Matrix.c02_Length;

/**
 *
 * @author Majd Talji
 */
public class zB03_Matrix {
    
    public static void main(String[] args) {
        
        int[][] matrix = {
                            {1, 2, 3, 4, 5},
                            {6, 7, 8, 9, 3},
                            {9, 6, 3, 1, 7}
                         };
        
        System.out.print("the number of elements is : " + (matrix.length * matrix[0].length) + "\n");

    }
    
}
