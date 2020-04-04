package _13_Methods.b02_Parameter;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB05_Parameters {
    
    public static void FindAll ( int[] a, int b ){
        
        int found = 0;
        
        for (int i = 0; i < a.length; i++) {
            if ( a[i] == b ) {
                System.out.print( b + " is exist at index number: " + i + "\n");
                found++;
            }
        }
        
        if ( found == 0 ) {
            System.out.print( b + " is not exist.\n");
        } else {
            System.out.print("es is: " + found + "\n");
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] Numbers = {2, 7, 5, 6, 9, 14, 0, 5, 12, 5};
        int x;
        
        System.out.print("Find all: ");
        x = input.nextInt();
        
        FindAll(Numbers, x);
        
    }
    
}
