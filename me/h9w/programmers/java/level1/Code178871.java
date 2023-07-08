package me.h9w.programmers.java.level1;

import java.util.HashMap;
import java.util.Map;

public class Code178871 {
    public static void main(String[] args) {
        /* 달리기 경주
        players와 callings 문자열 배열이 주어진다.
        players는 경주에 참가한 선수 명단이고 callings는 추월한 선수의 이름이다.
        1, 2, 3의 선수가 있고, 2가 calling되면 2가 추월했다는 뜻이므로 현재 순위는 2, 1, 3이 된다.
        */
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] answer = {};
        /* 처음 생각은 callings의 길이만큼 반복하여
        *  players의 전체를 순회하며 callings[index]와 비교 후 찾은 players의 멤버의 스왑이었다.
        * 이렇게되면 최악의 경우 callings의 길이 * players의 길이 의 시간복잡도가 나온다.
        * */
        /* 처음 풀이 */
//        String temp = "";
//        for(int i = 0; i < callings.length; i++) {
//            int index = 0;
//
//            for(int j = 0; j < players.length; j ++) {
//                if(callings[i].equals(players[j])) {
//
//                    temp = players[j -1];
//                    players[j - 1] = players[j];
//                    players[j] = temp;
//
//                    break;
//                }
//            }
//        }
        Map<String, Integer> rankMap = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        for(String calling : callings) {
            //호명될 선수의 랭킹
            int rank = rankMap.get(calling);

            //랭킹으로 호명된 선수와, 추월당한 선수 저장
            String passed = players[rank - 1];
            String called = players[rank];

            //맵에 랭크 변경
            rankMap.put(passed, rank);
            rankMap.put(called, rank - 1);

            //원래 배열에 순위 반영
            players[rank] = passed;
            players[rank - 1] = called;
        }

    }
}
