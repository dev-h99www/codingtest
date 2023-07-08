package me.h9w.programmers.java.level1;

public class Code132267 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        /*콜라문제
        * https://school.programmers.co.kr/learn/courses/30/lessons/132267
        * 빈병 a개를 가져다 주면 b명을 주는 마트에서,
        * 빈병 n개가 있을 때 받을 수 있는 빈병의 총 개수
        * 풀이 과정 : 
        * n 병을 (n / a) * b 병으로 교환할 수 있다. 이 때 남은 병의 개수는 n % a개
        * 이 과정을 남은 병이 0개가 될 때까지 반복하면서 교환한 병을 누적 합산하려 한다.
        * */
        int answer = 0;
        int change = 0;
        int remain = n;
        while(remain >= a) {
            change = (remain / a) * b;
            answer += change;
            remain = change + remain % a;
        }
    }
}
