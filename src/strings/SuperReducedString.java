package strings;

import java.util.Scanner;

public class SuperReducedString {

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }

    public String reduce(String input) {
        boolean flag = false;
        StringBuilder stringBuilder = new StringBuilder(input);
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            char ch1 = stringBuilder.charAt(i);
            char ch2 = stringBuilder.charAt(i + 1);

            if (ch1 == ch2) {
                stringBuilder.delete(i, i + 2);
                flag = true;
            }
        }
        String output = stringBuilder.toString();

        if (flag) {
            return reduce(output);
        }
        return output;
    }

}