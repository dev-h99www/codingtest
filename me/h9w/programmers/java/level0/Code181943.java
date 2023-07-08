package me.h9w.programmers.java.level0;

public class Code181943 {
    public static void main(String[] args) {
        //문자열 겹쳐쓰기
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        //my_string의 s index부터 overwite_string을 겹치는 문제
        //첫 풀이
        StringBuilder answer = new StringBuilder();
        int index_o = 0;
        int index_m = 0;

        for(int i = 0; i < my_string.length(); i++) {
            if(i >= s && i < s + overwrite_string.length()) {
                answer.append(overwrite_string.charAt(index_o));
                index_o++;
                index_m++;

            } else {
                answer.append(my_string.charAt(index_m));
                index_m++;
            }
        }

        // 더 나은 방법 > substring사용
        String start = my_string.substring(0, s);
        String end = my_string.substring(s + overwrite_string.length(), my_string.length());
        String result = start + overwrite_string + end;


        //후기 > substring을 몰라서 이 방법을 생각하지 못했다. 다양한 함수들을 익혀서 자연스럽게 쓰는 실력을 길러야할 것 같다.
    }
}
