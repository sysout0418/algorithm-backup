package com.kim.algorithm.dreamuscompany;

import java.util.Stack;

public class Question2 {

    public static void main(String[] args) {
        //int[] arr = {1,3,2};
        int[] arr = {3,1,2};
        boolean result = solution(arr);
        System.out.println(result);
    }

    public static boolean solution(int[] arr) {
        boolean answer = true;
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            if (answer) {
                if (num <= arr[i]) {
                    while (num <= arr[i]) {
                        stack.push(num++);
                        answer = true;
                    }
                }
                if(stack.isEmpty()) {
                    answer = false;
                } else {
                    while (stack.peek() >= arr[i]) {
                        stack.pop();
                        answer = true;
                        if (stack.isEmpty()) {
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
