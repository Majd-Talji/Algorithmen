package a05_for_dowhile_loop;

/**
 *
 * @author Majd Talji
 */
public class zB01_02_SumWhile {
    
    public static void main(String[] args) {
        
        int i = 1;
        int S = 0;
        
        while ( i <= 100 ) {
            S = S + i;
            i = i + 1;
        }
        
        System.out.print("The sum while is: " + S + "\n");
        
    }
    
}
