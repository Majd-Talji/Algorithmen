package a12_Arrays.b04_Matrix.c03_Working_with_two_dimensional;

/**
 *
 * @author Majd Talji
 */
public class zB00_Matrix {
    
    public static void main(String[] args) {
        
        int[][] matrix = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                         };
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Row [" + i + "] values: ");
            for (int j = 0; j < 3; j++) {
                System.out.print( matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for (int j = 0; j < 3; j++) {
            System.out.print("Col [" + j + "] values: ");
            for (int i = 0; i < 3; i++) {
                System.out.print( matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
    
}
