package a12_Arrays.b03_Replacement;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB05_Vector {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int[] vector;
        
        do {            
            System.out.print("Enter the length of the vector: ");
            N = input.nextInt();
        } while ( N <= 0 );
        
        vector = new int[N];
        
        System.out.print("\n");
        
        for (int i = 0; i <= ( N - 1 ); i++) {
            System.out.print("Enter vector[" + i + "]: ");
            vector[i] = input.nextInt();
        }
        
        System.out.print("\nBefore changing\n");
        
        for (int i = 0; i <= ( N - 1 ); i++) {
            System.out.print("vector[" + i + "]: " + vector[i] + "\n");
        }
        
        for (int i = 0; i <= ( N - 1 ); i++) {
            if ( vector[i] > 0 ) {
                vector[i] = 1;
            } else if ( vector[i] < 0 ) {
                vector[i] = -1;
            }
        }
        
        System.out.print("\nAfter changing:\n");
        
        for (int i = 0; i <= ( N - 1 ); i++) {
            System.out.print("vector[" + i + "]: " + vector[i] + "\n");
        }
        
        System.out.print("\n");
        
    }
    
}
