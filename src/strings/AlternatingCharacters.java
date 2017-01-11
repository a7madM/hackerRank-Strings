package strings;


import java.util.Scanner;

/**
 * Created by a7medM on 5/5/2016.
 */

// Problem on HackerRank: https://www.hackerrank.com/challenges/alternating-characters

public class AlternatingCharacters {
    public AlternatingCharacters() {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int t = 0; t < testCases; t++) {
            String input = scanner.nextLine();
            char ch1, ch2;
            int minDelete = 0;
            for (int i = 0; i < input.length() - 1; i++) {
                ch1 = input.charAt(i);
                ch2 = input.charAt(i + 1);
                if (ch1 == ch2)
                    minDelete++;
            }
            System.out.println(minDelete);
        }
    }
}
