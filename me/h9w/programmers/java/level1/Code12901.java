package me.h9w.programmers.java.level1;

public class Code12901 {

    public static void main(String[] args) {
        /* 2016년
        * 2016년 1월 1일은 금요일이다.
        * 이 때 a월 b일은 무슨 요일인지를 계산해서 반환하자
        * */
        String[] dayOfWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] dateOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a = 5;
        int b = 25;
        String result = "";

        for(int i = 0; i < a - 1; i++) {
            b += dateOfMonth[i];
        }
        result = dayOfWeek[(b - 3 < 0? b + 4 : b - 3) % 7];
        System.out.println(result);
    }
}
