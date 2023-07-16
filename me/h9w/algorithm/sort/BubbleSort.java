package me.h9w.algorithm.sort;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {9,6,5,3,2,1};

        for(int i :bubbleSort(array)) {
            System.out.println(i);
        }
    }

    private static int[] bubbleSort(int[] array) {

        int temp;

        for(int i = array.length - 1; i > 0; i --) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
