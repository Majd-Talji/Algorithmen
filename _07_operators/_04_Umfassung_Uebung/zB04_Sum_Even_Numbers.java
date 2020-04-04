package _07_operators._04_Umfassung_Uebung;

/**
 *
 * @author Majd Talji
 */
public class zB04_Sum_Even_Numbers {
    
    public static void main(String[] args) {
        
        int S = 0;
        
        for (int i = 1; i < 11; i++) {
            
            if ( i % 2 == 0 ) {
                System.out.print(" S = " + S + " + " + i + " = " + ( S + i ) + "\n");
                S = S + i;
            }
            
        }
        
        System.out.print("\n");
        
    }
    
}
