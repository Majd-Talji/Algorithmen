package _05_for_dowhile_loop;

/**
 *
 * @author Majd Talji
 */
public class zB00ForWhileDoWhile {
    
    public static void main(String[] args) {
        
        System.out.println("For");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        System.out.println("While");
        int w = 1;
        while (w <= 5) {            
            System.out.println(w);
            w++;
        }        
        
        System.out.println("Do While");
        int d = 1;
        do {            
            System.out.println(d);
            d++;
        } while (d <= 5);
        
    }
    
}
