package com.danielbohry.challenges;

import com.danielbohry.challenges.WordCountChallenge;
import org.junit.jupiter.api.Test;

public class WordCountChallengeTest {

    private final WordCountChallenge challenge = new WordCountChallenge();

    @Test
    public void should_return_word_count() {
        //given
        String sentence1 = "Just an example here move along";
        String sentence2 = "This is a test";
        String sentence3 = "What an easy task, right?";

        //when
        int result1 = challenge.countWords(sentence1);
        int result2 = challenge.countWords(sentence2);
        int result3 = challenge.countWords(sentence3);

        assert result1 == 6;
        assert result2 == 4;
        assert result3 == 5;
    }

}
