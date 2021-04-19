package com.alpha.practicalwork29.work3;

import java.util.*;

public class MyTranslator {

    private final Map<String, String> dict;

    public MyTranslator() {
        dict = new HashMap<>();
    }

    public Map<String, String> getDict() {
        return dict;
    }

    public void addWords(String en, String ru) {
        dict.put(en, ru);
    }

    public String translate(String phrase) {
        List<String> list = new ArrayList<>(Arrays.asList(phrase.trim().toLowerCase().split(" ")));
        StringBuilder result = new StringBuilder();
        for(String word : list) {
            if (dict.containsKey(word))
                result.append(dict.get(word)).append(" ");
            else
                result.append("<unknown word : ").append(word).append("> ");
        }
        return result.toString();
    }
}
