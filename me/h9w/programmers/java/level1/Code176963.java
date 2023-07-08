package me.h9w.programmers.java.level1;

import java.util.HashMap;
import java.util.Map;

public class Code176963 {
    public static void main(String[] args) {
        /* 추억 점수
        *  이름(name)에대한 추억점수(yearning)가 주어진다.
        *  사진에 찍힌 사람들의 이름이 저장되어있는데, 이때 추억점수가 존재하는 사람들의 각각의 점수를 더해
        *  사진의 총 추억점수가 몇점인지 반환하는 문제이다.
        * */
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"},{"kein", "deny", "may"},{"kon", "coni"}};
        int[] answer = new int[photo.length];


        Map<String, Integer> score = new HashMap<>();
        //score 맵에 이름별 그리움 점수를 담아준다.
        for(int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }
        //2차원 배열 photo의 row를 반복하고, column의 총 합을 answer에 저장한다
        for(int i = 0; i < photo.length; i++) {
            for(int  j = 0; j < photo[i].length; j++) {
                answer[i] += score.get(photo[i][j]) != null ? score.get(photo[i][j]) : 0;
            }
        }
        for(int a : answer) {
            System.out.println(a);
        }
    }
}
