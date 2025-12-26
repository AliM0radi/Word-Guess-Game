public class Word {

    // کدهای رنگی ANSI
    public static final String RESET = "\u001B[0m";
    public static final String BLUE  = "\u001B[34m";

    // کلمه‌ای که باید حدس زده شود
    private String secretWord;

    // جمله راهنما
    private String hint;

    // وضعیت حروف حدس زده شده
    private char[] guessedLetters;

    // سازنده کلاس
    public Word(String secretWord, String hint) {
        this.secretWord = secretWord.toUpperCase();
        this.hint = hint;
        this.guessedLetters = new char[secretWord.length()];

        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }
    }

    // نمایش راهنما با رنگ آبی
    public void showHint() {
        System.out.println(BLUE + "Hint: " + hint + RESET);
    }

    // بررسی وجود حرف در کلمه
    public boolean guessLetter(char letter) {
        boolean correct = false;
        letter = Character.toUpperCase(letter);

        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter) {
                guessedLetters[i] = letter;
                correct = true;
            }
        }
        return correct;
    }

    // بررسی کامل حدس زده شدن کلمه
    public boolean isComplete() {
        for (char c : guessedLetters) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    // نمایش وضعیت فعلی کلمه
    public void display() {
        for (char c : guessedLetters) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
