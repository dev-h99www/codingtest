package me.h9w.programmers.java.level2;

public class Code12953 {

    public static void main(String[] args) {

        gcd2(12, 18);
//        System.out.println(solution(new int[] {2,6,8,14}));
    }

    public static int solution(int[] arr) {
        /*N개의 최소공배수
        * https://school.programmers.co.kr/learn/courses/30/lessons/12953
        * */
        int mul = 1;
        for(int i = 0; i < arr.length; i++) {
            mul = mul * arr[i] / gcd2(mul, arr[i]);
        }


        return mul;
    }

    public static int gcd(int a, int b) {

        int gcd = 1;
        for(int i = 1; i <= (a < b? a: b); i++) {
            if(a % i == 0 && b % i == 0) gcd = i;
        }

        return gcd;
    }
    public static int gcd2(int a, int b) {

        if(b == 0) return a;
        return gcd2(b, a % b);
    }
}
