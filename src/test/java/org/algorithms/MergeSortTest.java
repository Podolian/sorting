package org.algorithms;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortTest {

    private MergeSort mergeSort = new MergeSort();

    @Test
    public void sorts() {
        int[] array = {8, 7, 6, 4, 5, 3, 1, 2};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8};

        assertTrue(Arrays.equals(mergeSort.sort(array), sortedArray));
    }
}