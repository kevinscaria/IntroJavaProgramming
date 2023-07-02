public class whileLoopChallenge {
    public static void main(String[] args) {
        int numberToCheck = 5;
        int numEvenNumbers = 0;
        int numOddNumbers = 0;
        while (numberToCheck <= 20){
            if (isEven(numberToCheck)){
                numEvenNumbers++;
                System.out.println("The even number is: " + numberToCheck);
                if (numEvenNumbers == 5){
                    break;
                }
            } else {
                numOddNumbers++;
            }
            numberToCheck++;
        }
        System.out.println("There are " + numEvenNumbers + " even numbers and " + numOddNumbers + " odd numbers.");
    }

    public static boolean isEven(int checkNumber){
        if ((checkNumber % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
