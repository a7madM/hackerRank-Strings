package strings;

import java.util.ArrayList;
import java.util.Scanner;

// Problem on HackerRank: https://www.hackerrank.com/challenges/pangrams

public class Pangram {
    public Pangram() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            char ch = (char) i;
            characters.add(ch);
        }


        for (int i = 0; i < text.length(); i++) {
            Character character = text.charAt(i);
            character = Character.toLowerCase(character);
            for (int characterIndex = 0; characterIndex < characters.size(); characterIndex++) {
                char character2 = characters.get(characterIndex);
                if (character == character2)
                    characters.remove(characterIndex);
            }
        }
        if (characters.isEmpty()) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
