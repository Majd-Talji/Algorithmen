package a07_operators.b04_Umfassung_Uebung;

/**
 *
 * @author Majd Talji
 */
public class zB06_Sum_Odd_And_Even_Numbers {
    
    public static void main(String[] args) {
        
        double S = 0;
        
        for (double i = 1; i <= 100; i++) {
            
            if ( i % 2 == 1 ) {
                S = S + ( 1 / i );
            } else { // if ( i % 2 == 0 ) 
                S = S - ( 1 / i );
            }
            
        }
        
        System.out.print(" S = " + S + "\n");
        
    }
    
}
