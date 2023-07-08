package me.h9w.programmers.java.level1;

import java.util.*;

public class Code135808 {
    public static int solution(int k, int m, int[] score) {
        /*과일 장수
        * https://school.programmers.co.kr/learn/courses/30/lessons/135808
        *
        * score의 갯수만큼 사과가 있다.
        * 이 때 m개로 구성된 박스를 판다.
        * 박스의 가격은 박스의 최하 품질가격 * m 이다.
        *
        * 풀이 과정 :
        * score을 list에 담고, sort 한다.
        * 그 후 score.length / m (박스의 갯수)만큼 list의 큰 순서대로 m개씩 뽑아낸다.
        * m개씩 뽑을 때, 가장 마지막으로 뽑힌 숫자가 그 상자의 과일 단가이다.
        * */
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            list.add(score[i]);
        }

        list.sort(Comparator.reverseOrder());
        for(int i = 1; i <= score.length / m; i++) {

            answer += m * list.get(i * m - 1);

        }

        return answer;
    }
}
