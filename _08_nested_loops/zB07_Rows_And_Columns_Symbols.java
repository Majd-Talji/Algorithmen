package _08_nested_loops;

/**
 *
 * @author Majd Talji
 */
public class zB07_Rows_And_Columns_Symbols {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            
            for (int k = 1; k <= ( 5 - i); k++) {
                System.out.print("- ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.print("\n");
            
        }
        
    }
    
}
