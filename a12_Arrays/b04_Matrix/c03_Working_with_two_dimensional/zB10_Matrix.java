package a12_Arrays.b04_Matrix.c03_Working_with_two_dimensional;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB10_Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];
        int[] vector = new int[3];
        int i;
        int j;
        int S;
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
        
        System.out.print("matrix contain these values:\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        for (i = 0; i < 3; i++) {
            S = 0;
            for (j = 0; j < 3; j++) {
                S = S + matrix[i][j];
            }
            vector[i] = S;
        }
        
        System.out.print("\nvector contain these values:\n");
        for (i = 0; i < 3; i++) {
            System.out.print(vector[i] + "\t");
        }
        
        System.out.print("\n");
    }
    
}
