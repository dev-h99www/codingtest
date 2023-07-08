package me.h9w.programmers.java.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Code138477 {
    public static int[] solution(int k, int[] score) {
        /*명예의 전당(1)
        * https://school.programmers.co.kr/learn/courses/30/lessons/138477
        *
        * 풀이과정
        * k 순위까지 저장하고, score의 index가 몇일차 점수인지를 의미한다.
        *
        * 우선 k 크기의 배열 랭크를 만들어서 k순위까지의 랭크를 저장할 예정.
        *   > 이 과정에서 랭크의 sorting
        *
        * 새로운 점수가 들어오면 랭크에 반영하고, 발표점수를 저장.
        *   > 이 과정에서 sorting
        *
        * for문(score의 길이만큼) 안에 for문(sorting)을 사용하는 방식으로 풀려는 찰나
        * List에 sorting 기능을 사용하기로 계획 변경
        *  1. List의 sort 성능을 믿기로 함
        *  2. k의 값에 따라 k일 전과 후의 발표 index 설정이 까다로워서
        * */

        int[] answer = new int[score.length];

        List<Integer> rank = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            rank.sort(Comparator.reverseOrder());
            if(i < k) {
                answer[i] = rank.get(i);
            } else {
                answer[i] = rank.get(k - 1);
            }
        }



        return answer;
    }
}
