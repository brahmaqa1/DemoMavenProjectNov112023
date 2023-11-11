package com.accenture;

public class ReplaceExample {
	
    public static void main(String[] args) {
    	
        String s = "good morning good afternoon good evng good night";
        String targetWord = "good";
        String replacementWord = "bad";
        int occurrenceToReplace = 3;

        int count = 0;
        int lastIndex = 0;
        StringBuilder result = new StringBuilder();

        while (count < occurrenceToReplace && lastIndex != -1) {
            lastIndex = s.indexOf(targetWord, lastIndex + 1);
            count++;
        }

        if (count == occurrenceToReplace) {
            result.append(s, 0, lastIndex);
            result.append(replacementWord);
            result.append(s, lastIndex + targetWord.length(), s.length());
        } else {
            result.append(s);
        }

        System.out.println(result.toString());
    }
}
