package com.danielbohry.challenges;

/*
 * Create a method that takes a string and returns the word count. The string will be a sentence.
 * */
public class WordCountChallenge {

    public int countWords(String sentence) {
        return sentence.split(" ").length;
    }

}
