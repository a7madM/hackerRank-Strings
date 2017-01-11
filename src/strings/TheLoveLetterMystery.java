package strings;

import java.util.Scanner;

/**
 * Created by a7medM on 5/5/2016.
 */

// Problem on HackerRank: https://www.hackerrank.com/challenges/the-love-letter-mystery

public class TheLoveLetterMystery {
    public TheLoveLetterMystery() {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int t = 0; t < testCases; t++) {
            String input = scanner.nextLine();
            char ch1, ch2;
            int minOperations = 0;
            int times = input.length() / 2;
            if (input.length() % 2 != 0)
                times = input.length() / 2 + 1;
            for (int i = 0; i < times; i++) {
                ch1 = input.charAt(i);
                ch2 = input.charAt(input.length() - i - 1);
                if (ch1 == ch2) {
                    continue;
                } else {
                    minOperations += Math.abs(ch1 - ch2);
                }
            }
            System.out.println(minOperations);
        }
    }
}
