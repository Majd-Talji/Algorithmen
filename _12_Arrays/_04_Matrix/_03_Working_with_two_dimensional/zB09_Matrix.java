package _12_Arrays._04_Matrix._03_Working_with_two_dimensional;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB09_Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][5];
        int x;
        boolean found = false;
        
        int i;
        int j;
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        System.out.print("\nEnter any number: ");
        x = input.nextInt();
        
        i = 0;
        while (i < 3 && found == false) {            
            j = 0;
            while ( j < 5 && found == false) {                
                if ( matrix[i][j] == x ) {
                    found = true;
                }
                j++;
            }
            i++;
        }
        
        if ( found == true ) {
            System.out.print( x + " is exist in the matrix \n");
        } else {
            System.out.print( x + " is not exist in the matrix \n");
        }

    }
    
}
