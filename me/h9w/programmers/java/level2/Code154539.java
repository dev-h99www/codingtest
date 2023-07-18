package me.h9w.programmers.java.level2;

public class Code154539 {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] numbers) {
        /*뒤에 있는 큰 수 찾기
        * https://school.programmers.co.kr/learn/courses/30/lessons/154539
        * */
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length - 1; i++) {
            int dif = -1;
            int index = 0;
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] <numbers[j]) {
                    dif = numbers[j] - numbers[i];
                    answer[i] = numbers[j];
                    break;
                }
            }
            if(dif == -1) answer[i] = dif;
        }
        answer[numbers.length - 1] = -1;

        return answer;
    }
}
