package a12_Arrays.b04_Matrix.c03_Working_with_two_dimensional;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB08_Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][5];
        int x;
        int found = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print( matrix[i][j] + "\t" );
            }
            System.out.print("\n");
        }
        
        System.out.print("\nEnter any number: ");
        x = input.nextInt();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if ( matrix[i][j] == x ) {
                    found = found + 1;
                }
            }
        }
        
        System.out.print(x + " is exist " + found + " times in the Matrix \n");
        
    }
    
}
