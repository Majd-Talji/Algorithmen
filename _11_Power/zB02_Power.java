package _11_Power;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB02_Power {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        double S = 0;
        
        System.out.print("Enter a number for N: ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            S = S + ( i * i );
        }
        
        System.out.print("S = " + S + "\n");
        
    }
    
}
