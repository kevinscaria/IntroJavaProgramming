public class ForLoopChallenge2 {

    public static void main(String[] args) {
        int sumVal = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++){
            if ((i%3==0) && (i%5==0)){
                sumVal+=i;
                counter++;
                if (counter == 5){
                    break;
                }
            }
        }
        System.out.println("The current sum is: " + sumVal);

    }
}
