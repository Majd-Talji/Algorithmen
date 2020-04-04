package _12_Arrays._03_Replacement;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB02_Vector {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int S = 0;
        int[] vector;
        
        do {            
            System.out.print("Enter the length of the vector: ");
            N = input.nextInt();
        } while ( N <= 0 );
        
        vector = new int[N];
        
        for (int i = 0; i <= (N - 1); i++) {
            System.out.print("Enter vector[" + i + "]: ");
            vector[i] = input.nextInt();
            S = S + vector[i];
        }
        
        System.out.print("The sum of all elements is: " + S + "\n");
        
    }
    
}
