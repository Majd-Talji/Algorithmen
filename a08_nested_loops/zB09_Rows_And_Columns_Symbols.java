package a08_nested_loops;

/**
 *
 * @author Majd Talji
 */
public class zB09_Rows_And_Columns_Symbols {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            
            for (int k = 1; k <= ( i - 1 ) ; k++) {
                System.out.print("- ");
            }
            
            for (int j = 1; j <= ( 5 - i + 1 ) ; j++) {
                System.out.print("* ");
            }
            
            System.out.print("\n");
            
        }
        
    }
    
}
