package com.kim.algorithm.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 퀵 정렬 알고리즘
 *
 * 원소들을 두 개의 리스트로 분리하는 시간 복잡도는 O(n)이고
 * 각각의 재귀 호출은 각 리스트의 절반만큼의 횟수만 발생한다.
 * 그래서 이 알고리즘의 복잡도는 O(n log n)이다. (평균적인 성능)
 *
 * 하지만 최악의 경우에는 여전히 O(n^2)이다.
 * pivot을 선택하는 방법에 따라 다를 수 있기 때문이다.
 * pivot을 항상 첫 번째 원소로 사용하는 경우 리스트가 역순으로 정렬되어 있다면
 * 재귀 단계에서는 단지 각 리스트로 분리하는 시간만 줄일 수 있다.
 * 따라서 리스트의 각 부분마다 발생하는 재귀 호출은 다른 정렬과는 독립적이면서 병렬로 실행되는 것이 좋다.
 */
public class QuickSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 7, 1, 6, 3, 5, 4));
        List<Integer> result = quickSort(numbers);
        System.out.println(result);
    }

    public static List<Integer> quickSort(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return numbers;
        }

        final Integer pivot = numbers.get(0);
        final List<Integer> lower = new ArrayList<>();
        final List<Integer> higher = new ArrayList<>();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < pivot) {
                lower.add(numbers.get(i));
            } else {
                higher.add(numbers.get(i));
            }
        }

        final List<Integer> sorted = quickSort(lower);
        sorted.add(pivot);
        sorted.addAll(quickSort(higher));

        return sorted;
    }
}
