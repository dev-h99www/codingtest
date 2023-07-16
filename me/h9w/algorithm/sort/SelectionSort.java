package me.h9w.algorithm.sort;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {9,6,5,3,2,1};

        for(int i :selectionSort(array)) {
            System.out.println(i);
        }
    }

    public static int[] selectionSort(int[] array) {
        int temp;
        int minIndex;
        for(int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }
}
