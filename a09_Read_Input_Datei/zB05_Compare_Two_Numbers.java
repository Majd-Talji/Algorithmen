
package a09_Read_Input_Datei;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB05_Compare_Two_Numbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.print("Enter first number: ");
        a = input.nextInt();
        
        System.out.print("Enter second number: ");
        b = input.nextInt();
        
        System.out.print("Result: ");
        
        if ( a > b ) {
            System.out.print( a + " > " + b + "\n");
        } else if ( a < b ) {
            System.out.print( a + " < " + b + "\n");
        } else {
            System.out.print( a + " = " + b + "\n");
        }
        
    }
    
}
