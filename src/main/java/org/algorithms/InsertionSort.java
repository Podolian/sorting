package org.algorithms;

public final class InsertionSort implements Sortable {

    @Override
    public int[] sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;
            while (j > -1 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = current;
        }
        return numbers;
    }
}
