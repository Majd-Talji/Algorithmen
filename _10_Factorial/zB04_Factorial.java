package _10_Factorial;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB04_Factorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int F;
        double S = 0;
        
        System.out.print("Enter a number For N : ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            
            F = 1;
            for (int k = 1; k <= i; k++) {
                F = F * k;
            }
            
            if ( i % 2 == 1 ) {
                S = S + F;
            } else {
                S = S - F;
            }
            
        }
        
        System.out.print("S = " + S + "\n");
        
    }
    
}
