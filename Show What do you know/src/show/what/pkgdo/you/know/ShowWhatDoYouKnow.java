/*
 * Lee Li "Show What Do You Know" Program at 1/11/2018
 */

package show.what.pkgdo.you.know;

import java.util.Scanner;
/**
 *
 * @author qili5995
 */
public class ShowWhatDoYouKnow {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mark1;
        int mark2;
        int mark3;
        int mark4;
        int mark5;
        int averages;
        
        Scanner keyedInput = new Scanner(System.in);
        
        System.out.println("Please enter your last 5 assigment marks.");
        
        mark1 = keyedInput.nextInt();
        mark2 = keyedInput.nextInt();
        mark3 = keyedInput.nextInt();
        mark4 = keyedInput.nextInt();
        mark5 = keyedInput.nextInt();
        
        averages = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
        
        System.out.println("Here is your averages ! " + averages);
    
        
    }
    
}
