package a07_operators.b03_logical_operators;

/**
 *
 * @author Majd Talji
 */
public class zB01_And {
    
    public static void main(String[] args) {
        
        int note = 15; // 15 7 -5 21
        
        if ( note > 9 && note <= 20 ) {
            System.out.print( note + " is between 10 and 20, so you succeed" );
        } 
        
        else if ( note >= 0 && note < 10 ) {
            System.out.print( note + " is betwwen 0 and 9, so you failed");
        } 
        
        else if ( note < 0 ) {
            System.out.print( note + " , note can't be a negative number !!!");
        } 
        
        else {
            System.out.print( note + " note can't be more than 20 !!!");
        }
        
        System.out.print("\n");
        
    }
    
}
