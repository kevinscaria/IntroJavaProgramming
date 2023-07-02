public class MethodsChallenge1 {

    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(1000));
        displayHighScorePosition("Percy", calculateHighScorePosition(500));
        displayHighScorePosition("Gilbert", calculateHighScorePosition(100));
        displayHighScorePosition("James", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition +
                " on the high score list.");
    }

    public static short calculateHighScorePosition(int playerScore) {
        short highScorePosition = (short) 4;
        if (playerScore >= 1000){
            highScorePosition = (short) 1;
        } else if (playerScore >= 500) {
            highScorePosition = (short)  2;
        } else if (playerScore >= 100) {
            highScorePosition = (short)  3;
        }
        return highScorePosition;
    }
}
