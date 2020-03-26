package a12_Arrays.b04_Matrix.c02_Length;

/**
 *
 * @author Majd Talji
 */
public class zB04_Matrix {
    
    public static void main(String[] args) {
        
        int elements_found  = 0;
        
        int[][] matrix = {
                            {1, 2, 3},
                            {4, 5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14}
                         };
        
        for (int i = 0; i < matrix.length; i++) {
            elements_found = elements_found + matrix[i].length;
        }
        
        System.out.print("the number of elements is : " + elements_found + "\n");
        
    }
    
}
