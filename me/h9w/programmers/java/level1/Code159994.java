package me.h9w.programmers.java.level1;

public class Code159994 {

    public static void main(String[] args) {

        /*카드 뭉치
        * https://school.programmers.co.kr/learn/courses/30/lessons/159994
        *
        * 카드뭉치의 순서는 상관없고, 카드뭉치 내부의 순서대로 뽑아야 할때, 주어진 카드뭉치 두세트로 goal 문자열을 만들 수 있는지 판별
        * 해결 과정 :
        * 우선 goal의 길이만큼 cards1의 0번인덱스와 cards2의 0번인덱스 비교를 반복한다.
        * cards1과 cards2는 current_index1,2라는 인덱스를 갖는다.
        * goal의 0번 인덱스와 매칭되는 문자를 찾으면, current_index의 값을 1 증가시킨다.
        *
        * */

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String result = solution(cards1, cards2, goal);
        System.out.println(result);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean isPossible = true;
        int current_index1 = 0;
        int current_index2 = 0;

        for(int i = 0; i < goal.length; i++) {
            if(goal[i].equals(cards1[current_index1])) {
                current_index1++;
            } else if(goal[i].equals(cards2[current_index2])) {
                current_index2++;
            } else {
                isPossible = false;
            }
        }
        return isPossible? "Yes": "No";
    }
}
