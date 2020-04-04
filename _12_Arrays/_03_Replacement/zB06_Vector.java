package _12_Arrays._03_Replacement;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB06_Vector {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int[] A;
        int[] B;
        int[] C;
        
        do {            
            System.out.print("Enter the length for all verctors: ");
            N = input.nextInt();
        } while ( N <= 0 );
        
        A = new int[N];
        B = new int[N];
        C = new int[N];
        
        System.out.print("\n");
        
        for (int i = 0; i <= ( N - 1 ); i++) {
            System.out.print("Enter A[" + i + "]: ");
            A[i] = input.nextInt();
            
            System.out.print("Enter B[" + i + "]: ");
            B[i] = input.nextInt();
            
            C[i] = A[i] + B[i];
        }
        
        System.out.print("\n");
        
        for (int i = 0; i <= ( N - 1 ); i++) {
            System.out.print("C[" + i + "]: " + C[i] + "\n");
        }
        
        System.out.print("\n");
        
    }
    
}
