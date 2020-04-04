package _12_Arrays;

/**
 *
 * @author Majd Talji
 */
public class zB00_Vector {
    
    public static void main(String[] args) {
        
        int[] vector = new int[5];
        System.out.println(vector.length + " size");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector["+i+"] = "+ vector[i] + "\n");
        }
        System.out.println();
        vector[0] = 7;
        vector[1] = 40;
        vector[2] = -20;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector["+i+"] = "+ vector[i] + "\n");
        }
        System.out.println();
        
        int[] vector2 = {7, 20, -45, 0, 0};
        System.out.println(vector2.length + " size");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("vector2["+i+"] = "+ vector2[i] + "\n");
        }
        System.out.println();
        
        vector2[0] = 3;
        vector2[3] = 124;
        vector2[4] = 210;
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("vector2["+i+"] = "+ vector2[i] + "\n");
        }
        
    }
    
}
