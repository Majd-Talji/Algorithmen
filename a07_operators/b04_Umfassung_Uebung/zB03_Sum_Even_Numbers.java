package a07_operators.b04_Umfassung_Uebung;

/**
 *
 * @author Majd Talji
 */
public class zB03_Sum_Even_Numbers {
    
    public static void main(String[] args) {
        
        int S = 0;
        
        for (int i = 2; i < 11; i=i+2) {
            System.out.print("S = " + S + " + " + i + " = " + (S + i) + "\n");
            S = S + i;
        }
        
        System.out.print("\n");
        
    }
    
}
