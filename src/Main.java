public class Main {

    // کدهای رنگی ANSI
    public static final String RESET = "\u001B[0m";
    public static final String BLUE  = "\u001B[34m";

    public static void main(String[] args) {

        // لیست کلمات و راهنماها
        Word[] words = {
            new Word("CPU", "The main part of a computer"),
            new Word("RAM", "Temporary memory of a computer"),
            new Word("MOUSE", "Input device used to control the pointer"),
            new Word("KEYBOARD", "Device used to type text")
        };

        int score = 0; // امتیاز کل

        System.out.println("Word Guess Game Started!");

        // اجرای بازی برای هر کلمه
        for (Word word : words) {
            Game game = new Game(word, 5);
            boolean result = game.start();

            // اگر کلمه درست حدس زده شد
            if (result) {
                score += 10;
                System.out.println(BLUE + "Score +10" + RESET);
            }

            System.out.println(BLUE + "Current Score: " + score + RESET);
        }

        // نمایش امتیاز نهایی
        System.out.println("\n=============================");
        System.out.println(BLUE + "Final Score: " + score + RESET);
        System.out.println("=============================");
    }
}
