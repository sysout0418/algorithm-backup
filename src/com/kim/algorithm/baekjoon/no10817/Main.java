package com.kim.algorithm.baekjoon.no10817;

import java.util.Scanner;

/**
 * 세 수
 *
 * 문제
 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 *
 * 출력
 * 두 번째로 큰 정수를 출력한다.
 *
 * 예제 입력 1
 * 20 30 10
 * 예제 출력 1
 * 20
 * 예제 입력 2
 * 30 30 10
 * 예제 출력 2
 * 30
 * 예제 입력 3
 * 40 40 40
 * 예제 출력 3
 * 40
 * 예제 입력 4
 * 20 10 10
 * 예제 출력 4
 * 10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();
        String[] numbers = number.split(" ");

        if (numbers != null && numbers.length == 3) {
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 0; i < numbers.length; i++) {
                switch (i) {
                    case 0 : a = Integer.parseInt(numbers[i]); break;
                    case 1 : b = Integer.parseInt(numbers[i]); break;
                    case 2 : c = Integer.parseInt(numbers[i]); break;
                }
            }
            if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100) && (c >= 1 && c <= 100)) {
                if ((a >= b && a <= c) || (a >= c && a <= b)) {
                    System.out.println(a);
                } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
                    System.out.println(b);
                } else if ((c >= a && c <= b) || (c >= b && c <= a)) {
                    System.out.println(c);
                }
            }
        }
    }
}
