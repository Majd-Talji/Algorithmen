package _12_Arrays._04_Matrix._03_Working_with_two_dimensional;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB04_Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];
        int S;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: " );
                matrix[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
        
        for (int j = 0; j < 3; j++) {
            S = 0;
            
            for (int i = 0; i < 3; i++) {
                S = S + matrix[i][j];
            }
            
            System.out.print("The sum of elements in column " + j + " is : " + S + "\n");
        }
        
    }
    
}
