package _13_Methods.b03_Recursive_Function;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB01_Recursion {
    
    public static int CountFromTo ( int start, int end ){
        
        if ( start <= end ) {
            System.out.print("counter = " + start + "\n");
            return CountFromTo(start + 1, end);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        
        CountFromTo(1, 3);
        
    }
    
}
