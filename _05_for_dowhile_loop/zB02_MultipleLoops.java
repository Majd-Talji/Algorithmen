package _05_for_dowhile_loop;

/**
 *
 * @author Majd Talji
 */
public class zB02_MultipleLoops {

    public static void main(String[] args) {

        int i = 1;
        int M = 1;

        // benuzen hier for
        System.out.print("1- using for loop:\n");
        for ( ; i <= 10; i=i+1) {
            M = M * i;
        }
        System.out.print("The multiple is: " + M + "\n");
        System.out.print("----------------------------------\n");
        
        // benuzen hier while
        System.out.print("2- using while loop:\n");
        i = 1;
        M = 1;
        while ( i <= 10 ) {            
            M = M * i;
            i = i + 1;
        }
        System.out.print("The multiple is: " + M + "\n");
        System.out.print("----------------------------------\n");
        
        // benuzen hier while
        System.out.print("3- using do while loop:\n");
        i = 1;
        M = 1;
        do {            
            M = M * i;
            i = i + 1;
        } while ( i <= 10 );
        System.out.print("The multiple is:  " + M + "\n");
        System.out.print("----------------------------------\n");

    }

}
