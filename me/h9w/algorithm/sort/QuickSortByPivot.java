package me.h9w.algorithm.sort;

import java.util.Arrays;

public class QuickSortByPivot {
    public static void main(String[] args) {
        int[] arr = {12, 2, 1, 4, 3, 6, 5, 8, 7, 9, 10, -1, -2};
        quicksort(arr, 0, arr.length - 1);
//        quickSortLeftPivot(arr, 0, arr.length - 1);
//        quickSortMiddlePivot(arr, 0, arr.length - 1);
//        quickSortRightPivot(arr, 0, arr.length - 1);
//        leftPivot(arr, 0, arr.length - 1);


        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quicksort(int[] arr, int start, int end) {

        if(start >= end) {
            return ;
        }

        int pivot = (start + end) / 2;
        int lo = start;
        int hi = end;
        int temp;

        while(lo < hi) {
            while(lo <= end && arr[lo] < arr[pivot]) lo++;
            while(hi > start && arr[hi] > arr[pivot]) hi--;
            if(lo > hi) {
                temp = arr[pivot];
                arr[pivot] = arr[hi];
                arr[hi] = temp;
            } else {
                temp = arr[hi];
                arr[hi] = arr[lo];
                arr[lo] = temp;
            }
        }
        quicksort(arr, start, lo - 1);
        quicksort(arr, lo + 1, end);

    }

    private static void leftPivot(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int pivot = start;
        int i = start + 1;
        int j = end;

        while(i <= j) {
            while(arr[i] <= arr[pivot]) i++;
            while(arr[j] >= arr[pivot] && j > start) j--;
            if(i > j) {
                swap(arr, pivot, j);
            } else {
                swap(arr, i, j);
            }
        }

        leftPivot(arr, start, j - 1);
        leftPivot(arr, j + 1, end);
    }

    private static void quickSortLeftPivot(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int pivot = start;
        int lo = start + 1;
        int hi = end;

        while(lo < hi) {
            while(lo <= end && arr[lo] < arr[pivot]) lo++;
            while(hi > start && arr[hi] > arr[pivot]) hi--;
            if(lo >= hi) {
                swap(arr, pivot, hi);
            } else {
                swap(arr, lo, hi);
            }
        }
        quickSortLeftPivot(arr, start, lo - 1);
        quickSortLeftPivot(arr, lo ,end);

    }

    private static void quickSortMiddlePivot(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int pivot = (start + end) / 2;
        int lo = start;
        int hi = end;

        while(lo <= hi) {
            while(lo <= end && arr[lo] <= arr[pivot]) lo++;
            while(hi >= start && arr[hi] > arr[pivot]) hi--;
            if(hi < lo) {
                swap(arr, pivot, hi);
            } else {
                swap(arr, hi, lo);
            }
        }

        quickSortMiddlePivot(arr, start, hi);
        quickSortMiddlePivot(arr, hi + 1, end);
    }

    private static void quickSortRightPivot(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int pivot = end;
        int lo = start;
        int hi = end - 1;

        while(lo <= hi) {
            while(lo < end && arr[lo] < arr[pivot]) lo++;
            while(hi >= start && arr[hi] > arr[pivot]) hi--;
            if(lo > hi) {
                swap(arr, pivot, lo);
            } else {
                swap(arr, lo, hi);
            }
        }

        quickSortRightPivot(arr, start, hi);
        quickSortRightPivot(arr, hi + 1, end);
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
