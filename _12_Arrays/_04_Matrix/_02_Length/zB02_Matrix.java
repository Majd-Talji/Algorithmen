package _12_Arrays._04_Matrix._02_Length;

/**
 *
 * @author Majd Talji
 */
public class zB02_Matrix {
    
    public static void main(String[] args) {
        
        int[][] matrix = {
                            {1, 2, 3},
                            {6, 7, 8},
                            {9, 6, 3}
                         };
        
        System.out.print("the number of elements is : " + (matrix.length * matrix[0].length) + "\n");

        System.out.print("the number of elements is : " + (matrix[0].length * matrix[0].length) + "\n");

        System.out.print("the number of elements is : " + (matrix.length * matrix.length) + "\n");
        
    }
    
}
