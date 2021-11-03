package oop;

public class OsvMath {
    public OsvMath(){

    }

    /**
     * Calcualtes the the fraction numerator and 
     * fraction denominator using Euclidean Algorithm
     * 
     * @param fn
     * @param fd
     * @return a
     * @see https://en.wikipedia.org/wiki/Euclidean_algorithm
     */
    public static int euclideanGcd(int fn, int fd){
        int a = fn, b = fd;
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    /**
     * This method wi
     * @param numerator
     * @param denominator
     */
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
