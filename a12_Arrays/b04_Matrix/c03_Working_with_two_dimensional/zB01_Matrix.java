package a12_Arrays.b04_Matrix.c03_Working_with_two_dimensional;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB01_Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int[][] matrix;
        
        do {            
            System.out.print("Enter the number of rows: ");
            a = input.nextInt();
        } while ( a <= 0);
        
        do {            
            System.out.print("Enter the number of columns: ");
            b = input.nextInt();
        } while ( b <= 0 );
        
        matrix = new int[a][b];
        
        System.out.print("\n");
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
    }
    
}
