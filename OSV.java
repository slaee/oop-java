/**
 * @author Sly Kint Bacalso
 * @version JDK 11
 * 
 ** Hey there enjoy using my modules you can copy it to your
 ** Java OOP lesson and always credit me. Thank you!
 ** HAPPY HACKING :))
 */

import java.util.*;

import osvclass.OsvLight;
import osvclass.OsvMath;

public class OSV{
    
    /** 
     * @param args
     */
    public static void main(String [] args) {

        // Scanner num = new Scanner(System.in);
        // int numerator = num.nextInt();
        // int denominator = num.nextInt();
        // OsvMath.getMixedFraction(numerator, denominator);

        // // always close scanner after using it
        // num.close();

        // visualizing light interfaces
        OsvLight light = new OsvLight();
        light.on();
        light.off();
        light.status();
    }
}