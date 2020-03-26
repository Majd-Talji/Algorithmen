package a13_Methods.b03_Recursive_Function;

/**
 *
 * @author Majd Talji
 */
public class zB02_Recursion {
    
    public static int CountRecursively ( int counter ) {
        
        if ( counter != 0 ) {
            System.out.print("counter = " + counter + "\n");
            return CountRecursively( counter - 1 );
        }
        
        return 0;
        
    }
    
    public static void main(String[] args) {
        
        CountRecursively(3);
        
    }
    
}
