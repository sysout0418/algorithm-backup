package com.kim.algorithm.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 병합 정렬 알고리즘
 *
 * 병합 정렬의 성능은 O(n log n)이고 각각의 병합 시간은 O(n)이며
 * 각 재귀 호출은 주어진 리스트 숫자의 절반만큼만 발생
 */
public class MergeSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 7, 1, 6, 3, 5, 4));
        List<Integer> result = mergeSort(numbers);
        System.out.println(result);
    }

    public static List<Integer> mergeSort(final List<Integer> values) {
        if (values.size() < 2) {
            return values;
        }

        final List<Integer> leftHalf = values.subList(0, values.size() / 2);
        final List<Integer> rightHalf = values.subList(values.size() / 2, values.size());

        return merge(mergeSort(leftHalf), mergeSort(rightHalf));
    }

    private static List<Integer> merge(final List<Integer> left, final List<Integer> right) {
        int leftPtr = 0;
        int rightPtr = 0;

        final List<Integer> merged = new ArrayList<>(left.size() * right.size());

        while (leftPtr < left.size() && rightPtr < right.size()) {
            if (left.get(leftPtr) < right.get(rightPtr)) {
                merged.add(left.get(leftPtr));
                leftPtr++;
            } else {
                merged.add(right.get(rightPtr));
                rightPtr++;
            }
        }

        while (leftPtr < left.size()) {
            merged.add(left.get(leftPtr));
            leftPtr++;
        }

        while (rightPtr < right.size()) {
            merged.add(right.get(rightPtr));
            rightPtr++;
        }

        return merged;
    }
}
