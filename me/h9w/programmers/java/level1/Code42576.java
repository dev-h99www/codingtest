package me.h9w.programmers.java.level1;

import java.util.HashMap;
import java.util.Set;

public class Code42576 {

    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String answer = solution(participant, completion);
        System.out.println(answer);

    }

    public static String solution(String[] participant, String[] completion) {
        /*완주하지 못한 선수
        * https://school.programmers.co.kr/learn/courses/30/lessons/42576
        *
        * 마라톤 참가 선수 명단 : participant
        * 마라톤 완주 선수 명단 : completion
        *
        * 이때 두 배열을 비교해서 마라톤에 참가했지만 완주하지 못한 선수 구하기
        * 동명이인이 있을 수 있음
        *
        * 풀이 과정 :
        * 우선 Map에 참가선수를 저장하고, value에 1을 저장한다.
        * 동명이인의 경우 기존 값의 + 1을 저장
        *
        * 그 후 completion의 선수에 대해 value를 -1 씩 해주고, value가 1 이상인 key값이 완주하지 못한 선수
        * */

        String answer = "";

        HashMap<String, Integer> runnerList = new HashMap<>();

        for(int i = 0; i < participant.length; i++) {
            runnerList.put(participant[i], runnerList.get(participant[i]) == null? 0: runnerList.get(participant[i]) + 1);
        }

        for(int i = 0; i < completion.length; i++) {
            runnerList.put(completion[i], runnerList.get(completion[i]) - 1);
        }

        for(String key: runnerList.keySet()) {
            if(runnerList.get(key) > 0) {
                answer = key;
            }
        }

        return answer;
    }
}





















