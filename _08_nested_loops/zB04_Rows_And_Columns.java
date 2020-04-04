package _08_nested_loops;

/**
 *
 * @author Majd Talji
 */
public class zB04_Rows_And_Columns {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= ( 5 - i + 1 ); j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        
    }
    
}
