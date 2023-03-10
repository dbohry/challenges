package com.danielbohry.challenges;

import com.danielbohry.challenges.MaxCountChallenge;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MaxCountChallengeTest {

    private final MaxCountChallenge challenge = new MaxCountChallenge();

    @Test
    public void should_return_max_count() {
        //given
        List<Integer> array1 = List.of(-2, -1, -1, 1, 2, 3);
        List<Integer> array2 = List.of(-3, -2, -1, 0, 0, 1, 2);
        List<Integer> array3 = List.of(5, 20, 66, 1314);

        //when
        int result1 = challenge.maxCount(array1);
        int result2 = challenge.maxCount(array2);
        int result3 = challenge.maxCount(array3);

        //then
        assert result1 == 3;
        assert result2 == 3;
        assert result3 == 4;

    }


}
