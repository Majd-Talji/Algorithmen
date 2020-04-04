package _12_Arrays._04_Matrix._03_Working_with_two_dimensional;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB06_Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][4];
        int[] vector = new int[ 3 * 4 ];
        int k = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
        
        System.out.print("matrix contain these values:\n");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                vector[k] = matrix[i][j];
                k = k + 1;
            }
        }
        
        System.out.print("\nvector contain these values:\n");
        
        for (int i = 0; i < vector.length ; i++) {
            System.out.print(vector[i] + "\t");
        }
        
        System.out.print("\n\n");
        
    }
    
}
