package me.h9w.programmers.java.level1;

public class Code17681 {
    public static void main(String[] args) {

        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        for(String answer : solution(n, arr1, arr2)) {
            System.out.println(answer);
        }

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        /*[1차] 비밀지도
        * https://school.programmers.co.kr/learn/courses/30/lessons/17681
        *
        * */
        String[] answer = new String[n];
//        for(int i = 0; i < answer.length; i ++) {
//            answer[i] = "";
//        }
//
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                if((arr1[i] % 2 | arr2[i] % 2) == 1) {
//                    answer[i] = "#" + answer[i];
//                } else {
//                    answer[i] = " " + answer[i];
//                }
//                arr1[i] /= 2;
//                arr2[i] /= 2;
//            }
//        }

        for(int i = 0; i < n; i ++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#").replaceAll("0", " ");
        }

        return answer;
    }
}
