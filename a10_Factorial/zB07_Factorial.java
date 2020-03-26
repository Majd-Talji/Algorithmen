package a10_Factorial;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB07_Factorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        double F;
        double S = 0;
        
        System.out.print("Enter a number For N : ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if ( i % 2 == 1 ) {
                S = S + i;
            } else {
                F = 1;
                for (int k = 1; k <= i; k++) {
                    F = F * k;
                }
                S = S + ( 1 / F );
            }
        }
        
        System.out.println("S = " + S + "\n");
        
    }
    
}
