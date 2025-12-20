package easyquestions.searching.easy.guessNumber_02;

public class GuessAPI {

    private static final int PICKED = 2;

    public static int guess(int num) {
        return Integer.compare(PICKED, num);
    }
}
