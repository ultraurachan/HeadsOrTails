import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;


        System.out.println("Tossing a coin...");
        for (int i = 1; i <= 3; i++) {
            String result = random.nextBoolean() ? "Heads" : "Tails";
            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
            System.out.println("Round " + i + ": " + result);
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
    }
}

