package a12_Arrays.b03_Replacement;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB04_Vector {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] vector = new int[5];
        int temp;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter vector[" + i + "]: ");
            vector[i] = input.nextInt();
        }
        
        System.out.print("\nBefore arrangement: \n");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector[" + i + "]: " + vector[i] + "\n");
        }
        
        for (int i = 0; i < ( vector.length - 1 ); i++) {
            for (int j = ( i + 1 ); j < vector.length; j++) {
                if ( vector[i] > vector[j] ) {
                    temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }         
        }
        
        System.out.print("\nAfter arrangement: \n");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector[" + i + "]: " + vector[i] + "\n");
        }
        
    }
    
}
