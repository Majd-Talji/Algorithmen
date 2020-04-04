package _05_for_dowhile_loop;

/**
 *
 * @author Majd Talji
 */
public class zB01_01_SumFor {
    
    public static void main(String[] args) {
        
        int i;
        int S = 0;
        
        for (i = 1; i <= 100; i=i+1) {
            S = S + i;
        }
        
        System.out.print("The sum is: " + S + "\n");
        
    }
    
}
