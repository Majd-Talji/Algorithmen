package _11_Power;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB03_Power {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int P;
        double S = 0;
        
        System.out.print("Enter a number for N: ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            P = 1;
            for (int k = 1; k <= 2; k++) {
                P = P * i;
            }
            S = S + P;
        }
        
        System.out.print("S = " + S + "\n");
        
    }
    
}
