package me.h9w.programmers.java.level1;

public class Code155652 {
    public static void main(String[] args) {

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(solution2(s, skip, index));
    }

    public static String solution2(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for(char letter: s.toCharArray()) {
            char temp = letter;
            int count = 0;
            while(count < index) {
                temp = temp == 'z'? 'a' : (char) (temp + 1);
                if(!skip.contains(String.valueOf(temp))) {
                    count++;
                }
            }

            answer.append(temp);
        }

        return answer.toString();
    }

    public static String solution(String s, String skip, int index) {
        /*둘만의 암호
        * https://school.programmers.co.kr/learn/courses/30/lessons/155652
        *
        * 풀이 과정 :
        * s와 skip을 배열로 만들어 준 후 , s는 문자열, skip엔 a ~ z까지의 인덱스 중 해당 인덱스의 값 표시.
        * 그 후 s의 길이만큼 반복하며 index만큼 더해준다.
        * 이 과정에서  skip배열을 참고하여 추가로 더해준다.
        * */
        String answer = "";
        char[] sarr = s.toCharArray();
        boolean[] skiparr = new boolean['z' - 'a' + 1];

        char loop = 'z' - 'a' + 1;
        for(int i = 0; i < skip.length(); i++) {
            skiparr[skip.charAt(i) - 'a'] = true;
        }


        int count;
        for(int i = 0; i < sarr.length; i++) {
            count = 0;
            while(count < index) {
                if(sarr[i] + 1 > 'z') sarr[i] -= loop;
                if(!skiparr[sarr[i] - 'a' + 1]){
                    count++;
                }
                sarr[i]++;
            }
        }

        for(int i = 0; i < sarr.length; i++) {
            answer += sarr[i];
        }
        return answer;
    }
}
