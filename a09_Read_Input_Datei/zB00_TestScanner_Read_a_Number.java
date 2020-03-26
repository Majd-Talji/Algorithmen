package a09_Read_Input_Datei;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB00_TestScanner_Read_a_Number {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a; 
        
        System.out.print( "Enter a number: " );
        a = input.nextInt();
        
        System.out.print( "You have entered the number: " + a + "\n" );
        
    }
    
}
