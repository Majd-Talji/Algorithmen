package a12_Arrays.b04_Matrix.c01_Grundlage;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB03_Matrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
        
        System.out.print("matrix values \n");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

}
