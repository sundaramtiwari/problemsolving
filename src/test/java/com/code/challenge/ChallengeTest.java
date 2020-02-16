package com.code.challenge;

import com.challenge.Challenge;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTest {

    @Test
    public void shouldPassForValidSmoothie() {
        assertEquals("banana,honey,mango,peach,pineapple,strawberry", Challenge.ingredients("Classic"));
    }

    @Test
    public void shouldPassForValidSmoothieWithAllergens() {
        assertEquals("banana,honey,mango,peach,pineapple", Challenge.ingredients("Classic,-strawberry,-peanut"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewIngredient() {
        Challenge.ingredients("Classic,chocolate");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSmoothie() {
        Challenge.ingredients("Vitamin smoothie");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailForBlankOrEmptySmoothie() {
        Challenge.ingredients("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailForNullSmoothie() {
        Challenge.ingredients(null);
    }
}
