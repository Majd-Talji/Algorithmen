package a08_nested_loops;

/**
 *
 * @author Majd Talji
 */
public class zB10_Rows_And_Columns_Symbols {
    
    public static void main(String[] args) {
        
        System.out.print("* \n");
        
        for (int i = 2; i <= 7; i++) {
            
            System.out.print("* ");
            
            for (int k = 1; k <= ( i - 2 ) ; k++) {
                System.out.print("- ");
            }
            
            System.out.print("* \n");
            
        }
        
        for (int j = 1; j <= 8; j++) {
            System.out.print("* ");
        }
        
        System.out.print("\n");
        
    }
    
}
