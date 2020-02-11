package com.dynamicprogramming.cuttingrods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a rod of length n and prices P[i] for i=1,2,3...,n, where P[i] is
 * the price of a rod of length i. Find the maximum total revenue you can
 * make by cutting and selling the rod (assume no cost for cutting the rod).
 */
public class CuttingRods {

    public static void main(String[] args) {
        System.out.println(revenueIterative(5, Arrays.asList(1, 5, 8, 9, 10)));
    }

    private static int revenueIterative(int size, List<Integer> priceList) {
        List<Integer> revenueList = new ArrayList<>();
        revenueList.add(0, 0);

        for (int i = 1; i <= size; i++) {
            int maxVal = -1;
            for (int j = 1; j <= i; j++) {
                int temp = priceList.get(j - 1) + revenueList.get(i - j);
                if (temp > maxVal)
                    maxVal = temp;
            }
            revenueList.add(i, maxVal);
        }
        return revenueList.get(size);
    }

    private static int revenue(int size, List<Integer> priceList) {
        if (size == 0)
            return 0;
        int maxVal = -1;

        for (int i = 0; i < size; i++) {
            int temp = priceList.get(size - i - 1) + revenue(i, priceList);
            if (temp > maxVal)
                maxVal = temp;
        }

        return maxVal;
    }
}
