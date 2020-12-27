import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws Exception {
        Practice.runNumberGame();
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
