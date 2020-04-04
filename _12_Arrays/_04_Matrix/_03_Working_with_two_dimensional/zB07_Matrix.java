package _12_Arrays._04_Matrix._03_Working_with_two_dimensional;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB07_Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[4][4];
        int SOD = 0;
        int SAD = 0;
        int SUD = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                do {                    
                    System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                    matrix[i][j] = input.nextInt();
                } while ( matrix[i][j] < 0 );
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ( i == j ) {
                    SOD = SOD + matrix[i][j];
                } else if ( i < j ) {
                    SAD = SAD + matrix[i][j];
                } else if ( i > j ) {
                    SUD = SUD + matrix[i][j];
                }
            }
        }
        
        System.out.print("\n");
        System.out.print("The sum of elements above the diagonal is: " + SAD + "\n");
        System.out.print("The sum of elements on the diagonal is: " + SOD + "\n");
        System.out.print("The sum of elements unter the diagonal is: " + SUD + "\n");
        
    }
    
}
