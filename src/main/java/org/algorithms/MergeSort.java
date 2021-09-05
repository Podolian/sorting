package org.algorithms;

import java.util.Arrays;

public final class MergeSort implements Sortable {

    @Override
    public int[] sort(final int[] elements) {
        final int length = elements.length;
        if (length < 2) {
            return elements;
        } else {
            final int rightHalfFrom = (length + 1) / 2;
            /**
             * Here merge sort is storage consuming,
             * because we have to create a pair of new arrays
             */
            int[] leftHalf = Arrays.copyOfRange(elements, 0, rightHalfFrom);
            int[] rightHalf = Arrays.copyOfRange(elements, rightHalfFrom, length);

            final int[] leftHalfSorted = sort(leftHalf);
            final int[] rightHalfSorted = sort(rightHalf);

            return merge(leftHalfSorted, rightHalfSorted);
        }
    }

    private int[] merge(int[] leftHalf, int[] rightHalf) {
        int[] merged = new int[leftHalf.length + rightHalf.length];
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < leftHalf.length && rightIndex < rightHalf.length) {
            if (leftHalf[leftIndex] == rightHalf[rightIndex]) {
                throw new IllegalArgumentException("Duplicates in array");
            } else if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                merged[leftIndex + rightIndex] = leftHalf[leftIndex++];
            } else {
                merged[leftIndex + rightIndex] = rightHalf[rightIndex++];
            }
        }
        while (leftIndex < leftHalf.length) {
            merged[leftIndex + rightIndex] = leftHalf[leftIndex++];
        }
        while (rightIndex < rightHalf.length) {
            merged[leftIndex + rightIndex] = rightHalf[rightIndex++];
        }
        return merged;
    }
}
