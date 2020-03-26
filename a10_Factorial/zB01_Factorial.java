package a10_Factorial;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB01_Factorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int F = 1;
        
        System.out.print("Enter a number: ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            F = F * i;
        }
        
        System.out.print(N + "! =" + F + "\n");
        
    }
    
}
