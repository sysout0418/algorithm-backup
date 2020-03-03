package com.kim.algorithm.baekjoon.no15802;

import java.io.*;

/**
 * 타노스
 *
 * 문제
 * 이 일이 끝나면 인류의 절반은 살아남을 것이다.
 *
 * 타노스가 당신 앞에 나타났다.
 *
 * 당신은 살아남을 수 있을까?
 *
 * 입력
 * 이 문제는 입력이 주어지지 않는다.
 *
 * 출력
 * 당신이 살아남는다면 1을, 살아남지 못한다면 0을 출력한다.
 *
 * 예제 입력 1
 * baekjoon
 * 예제 출력 1
 * 0
 * 예제 입력 2
 * lll4592
 * 예제 출력 2
 * 1
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = br.readLine();

        if(name.equals("sysout0418")){
            bw.write(String.valueOf("0"));
        }else{
            bw.write(String.valueOf("1"));
        }

        bw.flush();
    }
}
