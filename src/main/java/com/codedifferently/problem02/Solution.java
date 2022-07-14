package com.codedifferently.problem02;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public String howManyLettersDoYouSee(String input){

        String[] wordArray = input.split("");

        Map<String, Integer> wordCount = new TreeMap<>();

        for(String word: wordArray){
            if(!wordCount.containsKey(word))
                wordCount.put(word, 1);
            else {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = wordCount.entrySet().iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            stringBuilder.append(entry.getKey()+ ":" + entry.getValue());
        }

        return stringBuilder.toString();
    }
}
