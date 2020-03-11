package com.kim.algorithm.study;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 6, 3, 5, 4};
        int[] result = bubbleSort(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] numbers) {
        boolean numbersSwitched;
        do {
            numbersSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                    numbersSwitched = true;
                }
            }
        } while (numbersSwitched);
        return numbers;
    }
}
