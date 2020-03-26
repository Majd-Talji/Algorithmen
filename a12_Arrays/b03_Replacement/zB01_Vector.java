package a12_Arrays.b03_Replacement;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB01_Vector {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int[] vector;
        
        do {            
            System.out.print("Enter the length of th vector: ");
            N = input.nextInt();
        } while ( N <= 0 );
        
        System.out.print("-----------------------------------\n");
        
        vector = new int[N];
        System.out.print("vector contains " + vector.length + " elements\n");
        
        System.out.print("-----------------------------------\n");
        
        for (int i = 0; i <= (N - 1); i++) {
            System.out.print( "Enter vector[" + i + "]: " );
            vector[i] = input.nextInt();
        }
        
        System.out.print("-----------------------------------\n");
        
        for (int i = 0; i <= (vector.length - 1); i++) {
            System.out.print("vector[" + i + "]: " + vector[i] + "\n");
        }
        
    }
    
}
