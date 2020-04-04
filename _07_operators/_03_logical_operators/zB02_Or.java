package _07_operators._03_logical_operators;

/**
 *
 * @author Majd Talji
 */
public class zB02_Or {
    
    public static void main(String[] args) {
        
        String name = "Ahmad";
        
        if ( name == "Ahmad" || name == "Majd" ) {
            System.out.print( name + " is my brother." );
        } else {
            System.out.print( "Sorry " + name + ", I don't know you !!!" );
        }
        
        System.out.print("\n");
        
    }
    
}
