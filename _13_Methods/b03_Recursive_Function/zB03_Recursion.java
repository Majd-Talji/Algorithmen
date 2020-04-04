package _13_Methods.b03_Recursive_Function;

/**
 *
 * @author Majd Talji
 */
public class zB03_Recursion {
    
    public static int Factorial ( int n ){
        
        if ( n > 0 ) { // ( n > 0 ) || ( n > 1 ) || ( n != 0 )
            return n * Factorial( n - 1 );
        }
        return 1;
    }
    
    public static void main(String[] args) {
        
        System.out.print( Factorial(4) + "\n" );
        
    }
    
}
