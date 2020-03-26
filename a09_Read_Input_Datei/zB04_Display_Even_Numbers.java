package a09_Read_Input_Datei;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB04_Display_Even_Numbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.print("Enter first number : ");
        a = input.nextInt();
        
        System.out.print("Enter second number : ");
        b = input.nextInt();
        
        System.out.print("\n");
        
        System.out.print("The even numbers between " + a + " and " + b + " are : \n");
        
        for (int i = a; i <= b; i++) {
            if ( i % 2 == 0) {
                System.out.print( i + "\n");
            }
        }
        
    }
    
}
