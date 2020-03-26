package a13_Methods.b02_Parameter;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB03_Parameters {
    
    public static void Average (double[] a){
        
        double S = 0;
        
        for (int i = 0; i < a.length; i++) {
            S = S + a[i];
        }
        
        S = S / a.length;
        
        System.out.print("Your average is: " + S + "\n");
        
        if ( S >= 10 && S <= 20 ) {
            System.out.print("Congratulations you have successed \n");
        } else if ( S >= 0 && S < 10 ) {
            System.out.print("Sorry you failed");
        } else {
            System.out.print("Impossible result! Please enter notes between 0 and 20 \n");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double[] Notes = new double[5];
        String[] Methods = {"Algorithm", "Java", "Android", "Linux", "Networks"};
        
        for (int i = 0; i < Notes.length; i++) {
            do {                
                System.out.print(Methods[i] + ": ");
                Notes[i] = input.nextDouble();
            } while ( Notes[i] < 0 || Notes[i] > 20 );
        }
        
        System.out.print("---------------------------\n");
        Average(Notes);
        
    }
    
}
