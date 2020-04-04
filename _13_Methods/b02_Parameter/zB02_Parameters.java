package _13_Methods.b02_Parameter;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB02_Parameters {
    
    public static int Maximum (int a, int b){
        if ( a > b ) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        System.out.print("The max is: " + Maximum(num1, num2) + "\n");
        
    }
    
}
