package com.dynamicprogramming.climbingstairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You can climb 1 or 2 stairs with one step. How many different ways can you climb n stairs?
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairsIterative(4));
    }

    private static Map<Integer, Integer> cache = new HashMap<>();

    private static long climbStairs(int stairs) {
        if ( stairs == 1)
            return 1;
        if (stairs == 2)
            return 2;

        return climbStairs(stairs - 1) + climbStairs(stairs - 2);
    }

    private static long climbStairsIterative(int stairs) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for (int i=2; i < stairs; i++) {
            list.add(list.get(i-1) + list.get(i-2));
        }

        return list.get(stairs-1);
    }
}
