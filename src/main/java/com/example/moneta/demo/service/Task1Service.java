package com.example.moneta.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Task1Service {
    private final List<Character> specialChars = List.of('a','e','i','o','u','á','é','í','ó','ů','ú');

    public String transformString(String inputString){
        //normalize string
        String normalizedInput = inputString.trim().replaceAll(" +", " ");

        char[] charArray = normalizedInput.toCharArray();
        char[] result = new char[charArray.length];
        List<Integer> indexesOfSpecialChars = new ArrayList<>();


        for (int i = charArray.length - 1; i >= 0; i--) {
            int inputIndex = charArray.length - 1 - i;
            char currentChar = Character.toLowerCase(charArray[i]);
            result[inputIndex] = currentChar;
            if (specialChars.contains(currentChar)){
                indexesOfSpecialChars.add(i);
            }
        }

        for (Integer index : indexesOfSpecialChars) {
            result[index] = Character.toUpperCase(result[index]);
        }
        return String.copyValueOf(result);
    }
}
