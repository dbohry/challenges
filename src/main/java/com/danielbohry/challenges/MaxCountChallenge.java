package com.danielbohry.challenges;

import java.util.List;

/*
 * Given an array nums sorted non-decreasing order, return the maximum between the number of positive integers
 * and the number of negative integers
 * */
public class MaxCountChallenge {

    public int maxCount(List<Integer> nums) {
        return Math.max(
                (int) nums.stream().filter(i -> i > 0).count(),
                (int) nums.stream().filter(i -> i < 0).count()
        );
    }

}
