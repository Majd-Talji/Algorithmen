/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a04_for_loop;

/**
 *
 * @author Majd
 */
public class zB01FirstLoop {
    public static void main(String[] args) {
        
        String loop;
        loop = "your first loop";
        
        for (int i = 1; i <= 5; i=i+1) {
            System.out.print(loop + "\n");
        }
        
        System.out.print("---------------\n");
        
        for (int i = 1; i <= 5; i=i+1) {
            System.out.print("Majd Talji ");
        }
        
        System.out.print("\n");
    }
}
