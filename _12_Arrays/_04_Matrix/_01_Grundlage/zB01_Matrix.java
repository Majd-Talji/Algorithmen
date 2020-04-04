package _12_Arrays._04_Matrix._01_Grundlage;

/**
 *
 * @author Majd Talji
 */
public class zB01_Matrix {
    
    public static void main(String[] args) {
        
        int[][] matrix = new int[3][5];
        
        matrix[0][0] = 6;
        matrix[1][2] = -3;
        matrix[2][4] = 100;
        
        System.out.print("matrix[0][0]: " + matrix[0][0] + "\n");
        System.out.print("matrix[0][1]: " + matrix[0][1] + "\n");
        System.out.print("matrix[0][2]: " + matrix[0][2] + "\n");
        System.out.print("matrix[0][3]: " + matrix[0][3] + "\n");
        System.out.print("matrix[0][4]: " + matrix[0][4] + "\n\n");
                
        System.out.print("matrix[1][0]: " + matrix[1][0] + "\n");
        System.out.print("matrix[1][1]: " + matrix[1][1] + "\n");
        System.out.print("matrix[1][2]: " + matrix[1][2] + "\n");
        System.out.print("matrix[1][3]: " + matrix[1][3] + "\n");
        System.out.print("matrix[1][4]: " + matrix[1][4] + "\n\n");
        
        System.out.print("matrix[2][0]: " + matrix[2][0] + "\n");
        System.out.print("matrix[2][1]: " + matrix[2][1] + "\n");
        System.out.print("matrix[2][2]: " + matrix[2][2] + "\n");
        System.out.print("matrix[2][3]: " + matrix[2][3] + "\n");
        System.out.print("matrix[2][4]: " + matrix[2][4] + "\n\n");
        
    }
    
}
