package com.danielbohry.challenges;

/*
 * Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.
 * */
public class StringEndMatchesChallenge {

    public boolean checkEnd(String a, String b) {
        int endSize = b.length();
        String end = a.substring(a.length() - endSize);

        return end.equals(b);
    }

}
