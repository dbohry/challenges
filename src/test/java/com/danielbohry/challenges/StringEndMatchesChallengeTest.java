package com.danielbohry.challenges;

import org.junit.jupiter.api.Test;

class StringEndMatchesChallengeTest {

    private final StringEndMatchesChallenge challenge = new StringEndMatchesChallenge();

    @Test
    void should_check_if_string_end_matches() {
        //when
        boolean result1 = challenge.checkEnd("abc", "bc");
        boolean result2 = challenge.checkEnd("abc", "d");
        boolean result3 = challenge.checkEnd("samurai", "zi");
        boolean result4 = challenge.checkEnd("feminine", "nine");
        boolean result5 = challenge.checkEnd("convention", "tio");

        //then
        assert result1 == true;
        assert result2 == false;
        assert result3 == false;
        assert result4 == true;
        assert result5 == false;

    }
}