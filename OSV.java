import java.util.*;
import osvclass.OsvMath;

public class OSV{
    public static void main(String [] args) {
        Scanner num = new Scanner(System.in);
        int numerator = num.nextInt();
        int denominator = num.nextInt();

        OsvMath.getMixedFraction(numerator, denominator);
        num.close();
    }
}