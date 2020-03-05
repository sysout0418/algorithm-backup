package com.kim.algorithm.programmers.recursion;

/**
 * 1 ~ n 까지의 합
 */
public class Code03 {

    public static void main(String[] args) {
        int result = func(4);
        System.out.println(result);
    }

    public static int func(int n) {
        if (n == 0) // n=0 이라면 합은 0이다.
            return 0;
        else
            return n + func(n - 1); // n이 0보다 크다면 0에서 n까지의 합은 0에서 n-1까지의 합에 n을 더한 것이다.
    }
}
