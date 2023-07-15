package me.h9w.programmers.java.level1;

public class Code81301 {
    public static void main(String[] args) {

        System.out.println(solution("one4seveneight"));
    }


    public static int solution(String s) {
        /*숫자 문자열과 영단어
        * https://school.programmers.co.kr/learn/courses/30/lessons/81301
        * */
        int answer = 0;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++) {
            s = s.replace(number[i], "" + i);
        }
//        s = s.replaceAll("one", "1").replaceAll("two", "2").replaceAll("three","3").replaceAll("four","4")
//                .replaceAll("five", "5").replaceAll("six", "6").replaceAll("seven", "7").replaceAll("eight", "8")
//                .replaceAll("nine", "9").replaceAll("zero", "0");

        return Integer.parseInt(s);
    }
}
