package com.kim.algorithm.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 이진 검색 알고리즘
 *
 * 정렬된 리스트에서 값을 찾을 때 사용
 * 성능은 O(log2n)
 */
public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 4, 4, 5, 6, 7));
        boolean result = binarySearch(numbers, 8);
        System.out.println(result);
    }

    public static boolean binarySearch(final List<Integer> numbers, final Integer value) {
        if (numbers == null || numbers.isEmpty()) {
            return false;
        }

        final Integer comparison = numbers.get(numbers.size() / 2);
        if (value.equals(comparison)) {
            return true;
        }

        if (value < comparison) {
            return binarySearch(numbers.subList(0, numbers.size() / 2), value);
        } else {
            return binarySearch(numbers.subList(numbers.size() / 2 + 1, numbers.size()), value);
        }
    }
}
