package _11_Power;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB01_Power {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int P = 1;
        
        System.out.print("Enter the base number: ");
        a = input.nextInt();
        
        System.out.print("Enter the power number: ");
        b = input.nextInt();
        
        for (int i = 1; i <= b; i++) {
            P = P * a;
        }
        
        System.out.print( a + " ^ " + b + " = " + P + "\n");
        
    }
    
}
