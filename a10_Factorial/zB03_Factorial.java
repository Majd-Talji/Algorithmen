/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a10_Factorial;

import java.util.Scanner;

/**
 *
 * @author Majd Talji
 */
public class zB03_Factorial {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int F = 1;
        double S = 0;
        
        System.out.print("Enter a number for N: ");
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            F = F * i;
            S = S + F;
        }
        
        System.out.print("S = " + S + "\n");
    }
}
