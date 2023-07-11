package me.h9w.programmers.java.level1;

import java.util.HashMap;
import java.util.Map;

public class Code142086 {

    public static void main(String[] args) {
        String s = "banana";
        int[] answer = solution2(s);

        for(int a: answer) {
            System.out.println(a);
        }
    }
    public static int[] solution2(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        char[] ca = s.toCharArray();
        for(int i = 0; i < s.length(); i ++) {
            if(!map.containsKey(ca[i])) {
                answer[i] = -1;
                map.put(ca[i], i);
            } else {
                answer[i] = i - map.get(ca[i]);
                map.put(ca[i], i);
            }
        }

        return answer;
    }

    public static int[] solution(String s) {
        /*가장 가까운 글자
        * https://school.programmers.co.kr/learn/courses/30/lessons/142086
        * 풀이 과정 :
        * 문제 조건에 문자열은 영어 소문자로만 이루어져 있다고 한다.
        * 1. a - z의 index를 저장하는 배열을 선언 후
        * 2. 문자열 s를 char[]로 변환하여 길이만실행한다.
        * 3. 알파벳에 해당되는 1번에 만든 배열의 index에 현재 index(2번 반복문의 index)를 저장 후 반복하여 위치를 기록한다.
        * */
        int[] alphabetIndexArray = new int['z' - 'a' + 1];
        for(int i = 0; i < alphabetIndexArray.length; i++) {
            alphabetIndexArray[i] = -1;
        }
        char[] carr = s.toCharArray();
        int[] answer = new int[carr.length];

        for(int i = 0; i < carr.length; i++) {
            if(alphabetIndexArray[carr[i] - 'a'] == -1) {
                answer[i] = -1;
                alphabetIndexArray[carr[i] - 'a'] = i;
            } else {
                answer[i] = i - alphabetIndexArray[carr[i] - 'a'];
                alphabetIndexArray[carr[i] - 'a'] = i;
            }
        }

        return answer;
    }
}
