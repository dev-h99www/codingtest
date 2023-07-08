package me.h9w.programmers.java.level0;

public class Code181942 {

    public static void main(String[] args) {
        //문자열 섞기
        //길이가 같은 문자열이 주어지면, 이를 한 글자씩 번갈아 등장하는 문자열을 반환하는 문제
        //answer에 번갈아가며 문자열의 한 글자씩 추가해줄 계획이라 StringBuilder 사용한다.

        String str1 = "aaaaa";
        String str2 = "bbbbb";

        StringBuilder answer = new StringBuilder();
        int length = str1.length();

        for(int i = 0; i < length; i++) {
        answer.append(str1.charAt(i));
        answer.append(str2.charAt(i));
        }
    }
}
