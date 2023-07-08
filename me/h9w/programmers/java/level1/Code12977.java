package me.h9w.programmers.java.level1;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Code12977 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 4, 6, 7};

        int result = solution(nums2);
    }

    public static int solution(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list.sort(Comparator.reverseOrder());

        List<Integer> primes = primeSet(list.get(0) + list.get(1) + list.get(2));

        int count = 0;
        for(int i = 0; i < nums.length - 2; i ++) {
            for(int j = i + 1; j < nums.length - 1; j ++) {
                for(int k = j + 1; k < nums.length; k++) {
                    for(int l = 0; l < primes.size(); l++) {
                        if(primes.get(l) == list.get(i) + list.get(j) + list.get(k)) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    public static List<Integer> primeSet(int num) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        for(int i = 5; i <= num; i++) {
            if(isPrime(i)) list.add(i);
        }
        return list;
    }

    public static boolean isPrime(int num) {
        boolean isTrue = true;
        for(int i =2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}
