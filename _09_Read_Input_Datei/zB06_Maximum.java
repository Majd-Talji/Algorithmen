package _09_Read_Input_Datei;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB06_Maximum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        
        int max_ab;
        
        System.out.print("Enter first number : ");
        a = input.nextInt();
        
        System.out.print("Enter second number : ");
        b = input.nextInt();
        
        System.out.print("Enter third number : ");
        c = input.nextInt();
        
        if ( a > b ) {
            max_ab = a;
        } else {
            max_ab = b;
        }
        
        if ( max_ab > c ) {
            System.out.print("the maximum is : " + max_ab + "\n");
        } else {
            System.out.print("the maximum is : " + c + "\n");
        }
        
    }
    
}
