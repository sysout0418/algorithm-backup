package com.kim.algorithm.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 삽입 정렬 알고리즘
 *
 * 최선의 성능 O(n) : 리스트가 역순으로 정렬되어 있을 때
 * 최악의 성능 O(n^2) : 리스트가 이미 정렬되어 있을 때
 */
public class InsertSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 7, 1, 6, 3, 5, 4));
        List<Integer> result = insertSort(numbers);
        System.out.println(result);
    }

    private static List<Integer> insertSort(final List<Integer> numbers) {
        final List<Integer> sortedList = new LinkedList<>();

        originalList: for (Integer number : numbers) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }
        return sortedList;
    }

}
