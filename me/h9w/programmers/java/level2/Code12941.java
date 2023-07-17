package me.h9w.programmers.java.level2;

import java.util.ArrayList;
import java.util.Comparator;

public class Code12941 {
    public static void main(String[] args) {

    }

    public static int solution(int []A, int []B) {
        /*최솟값 만들기
        * https://school.programmers.co.kr/learn/courses/30/lessons/12941
        *
        * */
        int answer = 0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i < A.length; i++) {
            arr1.add(A[i]);
            arr2.add(B[i]);
        }
        arr1.sort(Comparator.naturalOrder());
        arr2.sort(Comparator.reverseOrder());

        for(int i = 0; i < A.length; i++) {
            answer += arr1.get(i) * arr2.get(i);
        }
        return answer;
    }
}
