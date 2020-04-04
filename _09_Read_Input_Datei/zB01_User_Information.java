package _09_Read_Input_Datei;

import java.util.Scanner;

public class zB01_User_Information {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String name;
        String job;
        int age;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter your job: ");
        job = input.nextLine();
        
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        System.out.print("\n---------- user info -----------\n");
        
        System.out.print("Name: " + name + "\n");
        System.out.print("Job: " + job + "\n");
        System.out.print("Age: " + age + "\n");
        
    }
    
}
