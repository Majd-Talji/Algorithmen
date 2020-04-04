package _13_Methods.b02_Parameter;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB01_Parameters {

    public static void Sum(int a, int b) {
        System.out.print("The sum is: " + ( a + b ) + "\n");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        Sum(num1, num2);

    }

}
