package _10_Factorial;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB09_Factorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int F = 1;
        double S = 0;
        
        System.out.print("Enter a number For N : ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            F = F * ( i + 1 );
            
            if ( i % 2 == 1 ) {
                S = S - ( i + F );
            } else {
                S = S + ( i + F );
            }
        }
        
        System.out.print("S = " + S + "\n");
        
    }
    
}
