package com.kim.algorithm.programmers.recursion;

/**
 * Factorial
 * 0! = 1
 * n! = n x (n - 1)! (단, n > 0)
 */
public class Code04 {

    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
