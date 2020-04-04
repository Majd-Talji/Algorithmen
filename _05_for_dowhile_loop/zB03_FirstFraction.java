
package _05_for_dowhile_loop;

/**
 *
 * @author Majd Talji
 */
public class zB03_FirstFraction {
    
    public static void main(String[] args) {
        
        double S = 0;
        
        for (double i = 1; i <= 100; i=i+1) {
            S = S + (1/i);
        }
        
        System.out.print("The Sum is: " + S + "\n");
        
    }
    
}
