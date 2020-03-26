package a08_nested_loops;

/**
 *
 * @author Majd Talji
 */
public class zB06_Rows_And_Columns_Stars {
    
    public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}
