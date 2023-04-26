package com.example.sorting;

public class SortingUtility {

    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        int pos = 0;

        while (pos < data.length) {
            if (pos == 0 || (Integer) data[pos] >= (Integer) data[pos - 1]) {
                pos++;
            } else {
                swap(data, pos, pos - 1);
                pos--;
            }
        }
    }

    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

        for (int pos = 1; pos < data.length; pos++) {
            gnomierSort(data, pos);
        }
    }

    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {

        int pos = upperBound;
        while (pos > 0 && (Integer) data[pos - 1] > (Integer) data[pos]) {
            swap(data, pos - 1, pos);
            pos--;
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





