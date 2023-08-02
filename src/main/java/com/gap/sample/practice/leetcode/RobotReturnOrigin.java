package com.gap.sample.practice.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RobotReturnOrigin {


    public static void main(String[] args) {
        boolean isTrue = new RobotReturnOrigin().isRobotReturnOrigin("UDRLL");
        boolean isTrueAp2 = new RobotReturnOrigin().isRobotReturnOriginAppraoch2("UDRL");
        System.out.println(isTrue);
        System.out.println(isTrueAp2);
    }

    // Approach 1

    public Boolean isRobotReturnOrigin(String moves) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < moves.length(); i++) {
            char origin = moves.charAt(i);
            map.put(origin, map.getOrDefault(origin, 0) + 1);

        }

        if (Objects.equals(map.get('R'), map.get('L')) && Objects.equals(map.get('U'), map.get('D'))) {

            return true;
        }
        return false;
    }

    // Approach 2

    private boolean isRobotReturnOriginAppraoch2(String moves) {

        int lr = 0;
        int ud = 0;

        for (int i = 0; i < moves.length(); i++) {

            char currentMove = moves.charAt(i);

            if (currentMove == 'L') {
                lr++;
            } else if (currentMove == 'R') {
                lr--;
            } else if (currentMove == 'D') {
                ud++;
            } else if (currentMove == 'U') {
                ud--;
            }

            if (lr == 0 && ud == 0) {
                return true;
            }



        }
        return false;

    }
}
