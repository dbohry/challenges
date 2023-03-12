package com.danielbohry.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AreNumbersEqualTest {

    private final AreNumbersEqualChallenge challenge = new AreNumbersEqualChallenge();

    @Test
    public void should_check_if_numbers_are_equal() {
        assertTrue(challenge.isEqual(1, 1));
        assertFalse(challenge.isEqual(5, 6));
        assertFalse(challenge.isEqual(35, 36));
    }

}