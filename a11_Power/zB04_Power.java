package a11_Power;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB04_Power {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        double P;
        double S = 0;
        
        System.out.print("Enter a number for N: ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            P = 1;
            for (int k = 1; k <= i; k++) {
                P = P * i;
            }
            S = S + P;
        }
        
        System.out.print("S = "  + S + "\n");
        
    }
    
}
