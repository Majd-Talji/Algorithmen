package _12_Arrays._01_Vector;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB01_Vector {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] vector = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter vector[" + i + "]: ");
            vector[i] = input.nextInt();
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("vector[" + i + "]: " + vector[i] + "\n");
        }
        
        System.out.print("\n");
        
    }
    
}
