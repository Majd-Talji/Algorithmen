package _05_for_dowhile_loop;

/**
 *
 * @author Majd Talji
 */
public class zB01_03_SumDoWhile {
    
    public static void main(String[] args) {
        
        int i = 1;
        int S = 0;
        
        do {            
            S = S + i;
            i = i + 1;
        } while ( i <= 100 );
        
        System.out.print("The sum Do While is: " + S + "\n");
        
    }
    
}
