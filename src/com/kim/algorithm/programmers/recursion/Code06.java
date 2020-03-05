package com.kim.algorithm.programmers.recursion;

/**
 * Fibonacci Number
 * f0 = 0
 * f1 = 1
 * fn = fn-1 + fn-2 (단, n > 1)
 */
public class Code06 {

    public static void main(String[] args) {
        int result = fibonacci(4);
        System.out.println(result);
    }

    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
