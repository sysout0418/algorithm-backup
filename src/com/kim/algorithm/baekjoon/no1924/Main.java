package com.kim.algorithm.baekjoon.no1924;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 2007년
 *
 * 문제
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 *
 * 출력
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 *
 * 예제 입력 1
 * 1 1
 * 예제 출력 1
 * MON
 * 예제 입력 2
 * 3 14
 * 예제 출력 2
 * WED
 * 예제 입력 3
 * 9 2
 * 예제 출력 3
 * SUN
 * 예제 입력 4
 * 12 25
 * 예제 출력 4
 * TUE
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        String xy = scan.nextLine();
        String[] xyArray = xy.split(" ");
        int x = Integer.parseInt(xyArray[0]);
        int y = Integer.parseInt(xyArray[1]);

        if ((x >= 1 && x <= 12) && (y >= 1 && y <= 31)) {
            cal.set(2007, x - 1, y);
            int num = cal.get(Calendar.DAY_OF_WEEK);
            switch (num) {
                case 1 : System.out.println("SUN"); break;
                case 2 : System.out.println("MON"); break;
                case 3 : System.out.println("TUE"); break;
                case 4 : System.out.println("WED"); break;
                case 5 : System.out.println("THU"); break;
                case 6 : System.out.println("FRI"); break;
                case 7 : System.out.println("SAT"); break;
            }
        }

        scan.close();
    }
}
