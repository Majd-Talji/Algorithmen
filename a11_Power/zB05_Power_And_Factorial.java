package a11_Power;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB05_Power_And_Factorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        double P;
        double F;
        double S = 0;
        
        System.out.print("Enter a number for N: ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if ( i % 2 == 1 ) {
                P = 1;
                for (int k = 1; k <= i; k++) {
                    P = P * i;
                }
                S = S + P;
            } else {
                F = 1;
                for (int k = 1; k <= i; k++) {
                    F = F * k;
                }
                S = S + ( 1 / F );
            }
        }
        
        System.out.print("S = " + S + "\n");
        
    }
    
}
