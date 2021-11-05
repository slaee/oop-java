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

    // calculate the sum of two fractions
    public static void sumFraction(int numerator1, int denominator1, int numerator2, int denominator2){
        int fn1 = numerator1;
        int fd1 = denominator1;
        int fn2 = numerator2;
        int fd2 = denominator2;
        int gcd = euclideanGcd(fn1, fd1);
        fn1 /= gcd;
        fd1 /= gcd;
        gcd = euclideanGcd(fn2, fd2);
        fn2 /= gcd;
        fd2 /= gcd;
        int fn = fn1 * fd2 + fn2 * fd1;
        int fd = fd1 * fd2;
        gcd = euclideanGcd(fn, fd);
        fn /= gcd ;
        fd /= gcd;
        System.out.println(fn+"/"+fd);
    }
}
