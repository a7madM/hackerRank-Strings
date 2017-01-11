package strings;

import java.util.Scanner;

/**
 * Created by a7mad on 11/01/17.
 */

// problem https://www.hackerrank.com/challenges/camelcase
public class CamelCase {

    public CamelCase() {

    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int getWordsNumber(String input) {
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }
}
