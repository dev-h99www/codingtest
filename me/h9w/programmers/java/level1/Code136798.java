package me.h9w.programmers.java.level1;

public class Code136798 {
    public static void main(String[] args) {

        int number = 10;
        int limit = 3;
        int power = 2;

        solution(number, limit, power);

    }
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisors = new int[number];
        int count;
        for(int i = 1; i <=number; i++) {
            count = 0;
            for(int j = 1; j * j <= i; j++) {
                if(j * j == i) count++;
                else if(i % j == 0) count+=2;
            }
            if(count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }
}
