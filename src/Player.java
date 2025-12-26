import java.util.Scanner;

public class Player {

    // شی Scanner برای دریافت ورودی
    private Scanner scanner;

    // سازنده کلاس
    public Player() {
        scanner = new Scanner(System.in);
    }

    // دریافت یک حرف از کاربر
    public char getGuess() {
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        return input.charAt(0);
    }
}
