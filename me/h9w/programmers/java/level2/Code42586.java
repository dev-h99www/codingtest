package me.h9w.programmers.java.level2;

import java.util.ArrayList;
import java.util.List;

public class Code42586 {

    public static void main(String[] args) {
        /* 기능개발
         * https://school.programmers.co.kr/learn/courses/30/lessons/42586
         **/
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = solution(progresses, speeds);

        List.of(answer).forEach(System.out::println);
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<Integer>();

        int answerIndex = 0;
        while(true) {
            /* 진행률 증가 과정 진행 (진행률 100%가 되면 -1로 상태 변경) */
            for (int i = 0; i < progresses.length; i++) {

                if(progresses[i] > 0) {
                    progresses[i] += speeds[i];
                }

                if(progresses[i] >= 100) {
                    progresses[i] = -1;
                }
            }

            /* 진행률 100% 내역(-1) 카운트 및 카운트 센 내역들은 -2로 상태 변경 */
            int doneCnt = 0;
            int resultCnt = 0;
            for (int i = 0; i < progresses.length; i++) {
                if(progresses[i] == -1) {
                    doneCnt++;
                    resultCnt++;
                    progresses[i] = -2;
                } else if(progresses[i] == -2) {
                    doneCnt++;
                } else {
                    break;
                }
            }

            /* 완료된 내역이 있다면 추가 */
            if(resultCnt != 0) {
                answer.add(resultCnt);
            }

            /* 모든 과정에 대해 카운트가 끝나면 while문 종료 */
            if(doneCnt == progresses.length) {
                break;
            }

        }

        return answer.stream().mapToInt(i -> i).toArray();

    }
}
