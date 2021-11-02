package osvclass;

public class OsvMath {
    public OsvMath(){

    }

    public static int euclideanGcd(int fn, int fd){
        int a = fn, b = fd;
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void getMixedFraction(int numerator, int denominator){
        int wholeNumber = numerator / denominator;
        int fn = numerator % denominator;
        int fd = denominator;
        int gcd = euclideanGcd(fn, fd);
        
        fn /= gcd;
        fd /= gcd;
        System.out.println(wholeNumber+" "+fn+"/"+fd);
    }
}
