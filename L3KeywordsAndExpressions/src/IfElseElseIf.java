public class IfElseElseIf {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            score+=(levelCompleted * bonus);
            System.out.println("Final score: " + score);
        }

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            score += (levelCompleted * bonus);
            System.out.println("Final score: " + score);
        }
    }
}
