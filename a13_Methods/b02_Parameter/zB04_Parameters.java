package a13_Methods.b02_Parameter;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB04_Parameters {
    
    public static void FindFirst(int[] a, int b) {
        
        boolean stopSearch = false;
        int i = 0;
        
        while ( stopSearch == false && i < a.length ) {            
            if ( a[i] == b ) {
                System.out.print(b + " is exist at index number: " + i + "\n");
                stopSearch = true;
            }
            i++;
        }
        
        if ( stopSearch == false ) {
            System.out.print(b + " is not exist.\n");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] Numbers = {2, 7, 5, 6, 9, 14, 0, 5, 12, 5};
        int x;
        
        System.out.print("Find: ");
        x = input.nextInt();
        
        FindFirst(Numbers, x);
        
    }
    
}
