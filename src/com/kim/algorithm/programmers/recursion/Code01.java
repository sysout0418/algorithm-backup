package com.kim.algorithm.programmers.recursion;

/**
 * 자기 자신을 호출하는 함수
 */
public class Code01 {
    public static void main(String[] args) {
        func();
    }

    public static void func() {
        System.out.println("Hello...");
        func();
    }
}
