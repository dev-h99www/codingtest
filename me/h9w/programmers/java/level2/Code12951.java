package me.h9w.programmers.java.level2;

public class Code12951 {
    public static void main(String[] args) {
        System.out.println(solution("a3people unFollowed me"));
        System.out.println(solution2("a3people unFollowed me"));

    }

    public static String solution2(String s) {
        String answer = "";

        boolean isFirst = true;
        for(String c : s.toLowerCase().split("")) {

            answer += isFirst ? c.toUpperCase() : c;
            isFirst = " ".equals(c) ? true : false;
        }

        return answer;
    }

    public static String solution(String s) {
        /*JadenCase 문자열 만들기
        * https://school.programmers.co.kr/learn/courses/30/lessons/12951
        * */
        char[] carr = s.toCharArray();

        s = "";
        for(int i = 0; i < carr.length; i++) {
            if(i == 0) {
                carr[i] = toUpper(carr[i]);
            }
            if(i != 0) {
                if(checkAlphabet(carr[i - 1])) {
                    carr[i] = toLower(carr[i]);
                } else {
                    carr[i] = toUpper(carr[i]);
                }
            }
            s += carr[i];
        }

        return s;
    }

    public static boolean checkAlphabet(char c) {
        boolean isAlphabet = false;
        if(c != ' ') isAlphabet = true;

        return isAlphabet;
    }
    public static char toUpper(char c) {
        if(c >= 'a' && c <= 'z') {
            c -= 'a' - 'A';
        }

        return c;
    }
    public static char toLower(char c) {
        if(c >= 'A' && c <= 'Z') {
            c += 'a' - 'A';
        }

        return c;
    }

}
