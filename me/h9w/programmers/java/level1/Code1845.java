package me.h9w.programmers.java.level1;

import java.util.HashSet;
import java.util.Set;

public class Code1845 {

    public static int solution(int[] nums) {
        /*폰켓몬
        * https://school.programmers.co.kr/learn/courses/30/lessons/1845
        *
        * nums에 들어오는 숫자를 카테고리화해서 저장하려고 한다.
        * 중복되는 숫자는 하나만 저장하기위해 Set을 사용할 것이다.
        * 그 후 N/2와 카테고리의 갯수 중 적은 값을 반환하려고 한다.
        * */

        Set<Integer> categories = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            categories.add(nums[i]);
        }

        return categories.size() > nums.length / 2? nums.length / 2 : categories.size();
    }

}
