package main;

import strings.CamelCase;

public class Main {

    public static void main(String[] args) {
        //    new Pangram();
        // new AlternatingCharacters();
        //    new TheLoveLetterMystery();

        CamelCase camelCase = new CamelCase();
        String word = camelCase.getInput();
        int count = camelCase.getWordsNumber(word);
        System.out.println(count);
    }
}