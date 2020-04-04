package _08_nested_loops;

/**
 *
 * @author Majd Talji
 */
public class zB03_Columns_Numbers {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        
    }
    
}
