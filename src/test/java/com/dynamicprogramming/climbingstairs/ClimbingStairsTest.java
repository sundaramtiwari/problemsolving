package com.dynamicprogramming.climbingstairs;

import org.junit.Test;

import static com.dynamicprogramming.climbingstairs.ClimbingStairs.climbStairsIterative;
import static com.dynamicprogramming.climbingstairs.ClimbingStairs.climbStairsRecursive;
import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void shouldPassForValidInput() {
        assertEquals(4, climbStairsIterative(5));
    }

    @Test
    public void shouldPassForValidInput_1() {
        assertEquals(4, climbStairsRecursive(5));
    }
}
