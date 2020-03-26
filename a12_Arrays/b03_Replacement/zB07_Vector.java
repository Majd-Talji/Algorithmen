package a12_Arrays.b03_Replacement;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB07_Vector {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int[] A;
        int[] B;
        int[] C;
        int k = 0;
        
        do {            
            System.out.print("Enter the length for vectors ( A ) and ( B ): ");
            N = input.nextInt();
        } while ( N <= 0 );
        
        A = new int[N];
        B = new int[N];
        C = new int[N * 2];
        
        System.out.print("\n");
        
        for (int i = 0; i <= ( N - 1 ); i++) {
            System.out.print("Enter A[" + i + "]: ");
            A[i] = input.nextInt();
            
            System.out.print("Enter B[" + i + "]: ");
            B[i] = input.nextInt();
        }
        
        System.out.print("\n");
        
        for (int i = 0; i <= ( N - 1 ); i++) {
            C[k] = A[i];
            C[k + 1] = B[i];
            
            k = k + 2;
        }
        
        System.out.print("\n");
        
        for (int i = 0; i <= ( N * 2 - 1 ); i++) {
            System.out.print("C[" + i + "]: " + C[i] + "\n");
        }
        
        System.err.print("\n");
        
        
        
        
    }
    
}
