import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };
        System.out.println(Arrays.toString(words));
        Practice.runWordGame(words);
    }

    private static void runWordGame(String[] words) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomIndex = random.nextInt(words.length - 1);
        String answer = words[randomIndex];
        Practice.runWordGame(answer, scanner);
        scanner.close();
    }

    private static void runWordGame(String word, Scanner scanner) {
        System.out.println("Please choice word of array \n");
        String userAnswer = scanner.next().toLowerCase(Locale.ROOT);
        if (userAnswer.equals(word)) {
            System.out.println("You are right. It is really " + word);
        } else {
            StringBuilder output = new StringBuilder();
            int minLength = Math.min(word.length(), userAnswer.length());
            for (int i = 0; i < minLength; i++) {
                output.append(word.charAt(i) == userAnswer.charAt(i) ? word.charAt(i) : "#");
            }
            output.append("#".repeat(15 - minLength));
            System.out.println(output.toString());
            Practice.runWordGame(word, scanner);
        }
    }

    private static void runNumberGame() throws Exception {
        StringBuilder output = new StringBuilder();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int answer = random.nextInt(10);
        System.out.println("Please choice the number from 1 to 9\n");
        for (int i = 0; i < 3; i++) {
            int userAnswer = scanner.nextInt();
            if (userAnswer == answer) {
                output = new StringBuilder("Wow! It is real number " + userAnswer + "! You win!");
                break;
            } else {
                String help = "No. Right number is "
                        + (userAnswer > answer ? "letter" : "greater")
                        + " then " + userAnswer + "\n";
                System.out.println(help);
                output.append(i == 2 ? "\nYou lose... It was " + answer : "");
            }
        }
        output.append("\nDo you want to play again? (1 - yes 0 - no)\n");
        System.out.println(output.toString());
        int repeat = scanner.nextInt();
        if (repeat == 1) {
            Practice.runNumberGame();
        } else if (repeat != 0) {
            throw new Exception("Unknown input agreement for repeat game. Exit.");
        }
        scanner.close();
    }
}
