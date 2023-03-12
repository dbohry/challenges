package com.danielbohry.challenges;

import java.util.Arrays;

/*
 * Write a function that returns true if there exists at least one number that is larger than or equal to n
 * */
public class ExistsNumberHigherChallenge {

    public boolean existsHigher(int[] nums, int n) {
        return Arrays.stream(nums).anyMatch(i -> i >= n);
    }

}
