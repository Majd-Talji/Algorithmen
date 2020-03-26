package a12_Arrays.b04_Matrix.c01_Grundlage;

/**
 *
 * @author Majd Talji
 */
public class zB02_Matrix {

    public static void main(String[] args) {

        int[][] matrix = {
                            {6, 0, 0, 0, 0},
                            {0, 0, -3, 0, 0},
                            {0, 0, 0, 0, 100}
                         };

        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[0][3] = 40;
        matrix[0][4] = 50;

        matrix[1][0] = 60;
        matrix[1][1] = 70;
        matrix[1][2] = 80;
        matrix[1][3] = 90;
        matrix[1][4] = 100;
        
        matrix[2][0] = 110;
        matrix[2][1] = 120;
        matrix[2][2] = 130;
        matrix[2][3] = 140;
        matrix[2][4] = 150;

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
