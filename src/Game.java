public class Game {

    // کدهای رنگی ANSI
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED   = "\u001B[31m";

    private Word word;
    private Player player;
    private int attempts;

    // سازنده کلاس
    public Game(Word word, int attempts) {
        this.word = word;
        this.player = new Player();
        this.attempts = attempts;
    }

    // اجرای بازی برای یک کلمه
    // اگر کاربر موفق شود true برمی‌گرداند
    public boolean start() {

        System.out.println("\n-----------------------------");
        word.showHint();

        // حلقه اصلی بازی
        while (attempts > 0 && !word.isComplete()) {
            word.display();
            char guess = player.getGuess();

            if (word.guessLetter(guess)) {
                System.out.println(GREEN + "Correct!" + RESET);
            } else {
                attempts--;
                System.out.println(RED + "Wrong! Remaining attempts: " + attempts + RESET);
            }
        }

        // نتیجه نهایی
        if (word.isComplete()) {
            System.out.println(GREEN + "You guessed the word!" + RESET);
            return true;
        } else {
            System.out.println(RED + "Failed to guess the word." + RESET);
            return false;
        }
    }
}
