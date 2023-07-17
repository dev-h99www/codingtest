package me.h9w.programmers.java.level2;

import java.util.ArrayList;
import java.util.Comparator;

public class Code12939 {
    public static void main(String[] args) {

        String s = "-1 -2 -3 -4";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        /*최댓값과 최솟값
        * https://school.programmers.co.kr/learn/courses/30/lessons/12939
        * */

        String[] sarray = s.split(" ");
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < sarray.length; i++) {
            array.add(Integer.parseInt(sarray[i]));
        }
        array.sort(Comparator.naturalOrder());
        return array.get(0) + " " + array.get(array.size() - 1);
    }

}
