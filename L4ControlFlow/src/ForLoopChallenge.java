public class ForLoopChallenge {

    public static void main(String[] args) {

        for (int testCase = 0; testCase < 5; testCase++){
            System.out.println(testCase + " is " + ((isPrime(testCase))? "a " : "not a ") + "prime number.");
        }

        int rangeTop = 500;
        int primeCounter = 0;
        if (rangeTop <= 1000){
            for (int checkNum = 0; checkNum<rangeTop; checkNum++){
                if (isPrime(checkNum)){
                    System.out.println("Prime found: " + checkNum);
                    primeCounter++;
                    if (primeCounter == 3){
                        System.out.println("Three primes found!!");
                        break;
                    }
                }
            }
        }
    }

    public static boolean isPrime(int number){
        if (number <= 2) {
            return (number == 2);
        } else {
            for (int i = 2; i < number; i++){
                if (number%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
