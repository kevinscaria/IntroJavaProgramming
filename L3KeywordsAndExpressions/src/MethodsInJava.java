public class MethodsInJava {

    public static void main(String[] args) {

        int score = calculateScore(true, 800, 5, 100);
        System.out.println("Score for first user: " + score);
        System.out.println("Score for second user: " +
                calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            score+=(levelCompleted * bonus);
        }
    return score;
    }
}
