package _09_Read_Input_Datei;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB03_Sum_Odd_Numbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int S = 0;
        int N;
        
        System.out.print("Enter a value for N : ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if ( i % 2 == 1 ) {
                S = S + i;
            }
        }
        
        System.out.print("The sum is: " + S + "\n");
        
    }
    
}
