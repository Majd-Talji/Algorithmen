package a12_Arrays.b03_Replacement;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB03_Vector {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int L;
        int[] vector;
        int P = 0;
        int N = 0;
        int Z = 0;
        
        do {            
            System.out.print("Enter the length of the vector: ");
            L = input.nextInt();
        } while ( L <= 0 );
        
        vector = new int[L];
        
        for (int i = 0; i <= ( L - 1 ); i++) {
            System.out.print("Enter vector[" + i + "]: ");
            vector[i] = input.nextInt();
            
            if ( vector[i] > 0 ) {
                P = P + 1;
            } else if ( vector[i] < 0 ) {
                N = N + 1;
            } else {
                Z = Z + 1;
            }
        }
        
        System.out.print("The number of positive numbers is: " + P + "\n");
        System.out.print("The number of negative numbers is: " + N + "\n");
        System.out.print("The number of zero numbers is: " + Z + "\n");
        
    }
    
}
