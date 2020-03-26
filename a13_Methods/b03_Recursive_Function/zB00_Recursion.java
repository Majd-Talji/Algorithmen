package a13_Methods.b03_Recursive_Function;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB00_Recursion {
    
    public static int Recursion(int n){
        System.out.println(n);
        if ( n <= 0 ) {
            return 0;
        } else {
            return Recursion(n - 1) + 1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println(Recursion(5) + " Ende");

    }

}
