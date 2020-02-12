package com.dynamicprogramming.houserobber;

import java.util.Arrays;
import java.util.List;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint
 * stopping you from robbing each of them is that adjacent houses have
 * security system connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money
 * of each house, determine the maximum amount of money you can rob tonight
 * without alerting the police.
 */
public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(maxGainOfRobbing(Arrays.asList(4, 15, 3, 9, 5)));
    }

    private static long maxGainOfRobbing(List<Integer> houseList) {
        long maxGain = 0l;

        for (int i = 0; i < houseList.size(); i++) {
            int gain = houseList.get(i);

            // scan right list for max gain
            long rightGain = i < houseList.size() - 2 ? maxGainOfRobbing(houseList.subList(i + 2, houseList.size())) : 0;

            // scan left list for max gain
            long leftGain = i > 1 ? maxGainOfRobbing(houseList.subList(0, i - 1)) : 0;

            long totalGain = gain + rightGain + leftGain;
            if (maxGain < totalGain) {
                maxGain = totalGain;
            }
        }

        return maxGain;
    }
}
