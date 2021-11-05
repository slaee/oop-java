/**
 * @author: Sly The Great
 * @date: 2019/7/10
 * @description: oop/OsvArray.java
 * @version: 1.0
 * @classname: OsvArray
 * @github: https://github.com/slyg3nius/oop-java.git
 * @csdn: https://blog.csdn.net/sly_g3nius
 */

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
    private static int euclideanGcd(int fn, int fd){
        int a = fn, b = fd;
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    // eclideans gcd
    public static int gcd(int a, int b){
        return euclideanGcd(a, b);
    }

    /**
     * Gets mixed fraction from the given fraction
     * @param numerator
     * @param denominator
     */
    public static void getMixedFraction(int numerator, int denominator){
        int wholeNumber = numerator / denominator;
        int fn = numerator % denominator;
        int fd = denominator;
        int gcd = gcd(fn, fd);
        fn /= gcd;
        fd /= gcd;
        System.out.println(wholeNumber+" "+fn+"/"+fd);
    }

    /**
     * Sums two fractions
     * O(1) time complexity
     * @param fn1
     * @param fd1
     * @param fn2
     * @param fd2
     */
    public static void sumOfFractions(int fn1, int fd1, int fn2, int fd2){
        int fn = fn1 * fd2 + fn2 * fd1;
        int fd = fd1 * fd2;
        int gcd = gcd(fn, fd);
        fn /= gcd;
        fd /= gcd;
        System.out.println(fn+"/"+fd);
    }

    /** 
     * Sums two fractions that caters mixed fractions
     * O(1) time complexity
     * @param fn1
     * @param fd1
     * @param fn2
     * @param fd2
     */
    public static void sumOfFractions(int fn1, int fd1, int fn2, int fd2, boolean isMixed){
        int fn = fn1 * fd2 + fn2 * fd1;
        int fd = fd1 * fd2;
        int gcd = gcd(fn, fd);
        fn /= gcd;
        fd /= gcd;
        if(isMixed){
            int wholeNumber = fn / fd;
            fn %= fd;
            System.out.println(wholeNumber+" "+fn+"/"+fd);
        }else{
            System.out.println(fn+"/"+fd);
        }
    }
}
