package com.danielbohry.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExistsNumberHigherChallengeTest {

    private final ExistsNumberHigherChallenge challenge = new ExistsNumberHigherChallenge();

    @Test
    void should_check_if_exists_number_higher() {
        assertTrue(challenge.existsHigher(new int[]{5, 3, 15, 22, 4}, 10));
        assertTrue(challenge.existsHigher(new int[]{4, 3, 3, 3, 2, 2, 2}, 4));
        assertFalse(challenge.existsHigher(new int[]{1, 2, 3, 4, 5}, 8));
        assertFalse(challenge.existsHigher(new int[]{}, 5));
    }
}