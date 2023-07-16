package me.h9w.algorithm.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {9,6,5,3,2,1};

        for(int i :insertionSort(array)) {
            System.out.println(i);
        }
    }

    public static int[] insertionSort(int[] array) {

        int key;
        int minIndex = 0;
        for(int i = 1; i < array.length; i++) {
            key = array[i];

            for(int j = i - 1; j >= 0 && key < array[j]; j--) {

              array[j + 1] = array[j];
              minIndex = j;

            }
            array[minIndex] = key;
        }

        return array;
    }
}
