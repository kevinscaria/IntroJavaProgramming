import java.util.Scanner;

public class rollingMinMax {
    public static void main(String[] args) {
        int loopCounter = 0;
        double rollingMin = 0;
        double rollingMax = 0;
        while (true){
            try {
                System.out.println("Enter a number: ");
                Scanner sc = new Scanner(System.in);
                double userNumber = Double.parseDouble(sc.nextLine());
                if (loopCounter == 0){
                    rollingMin = userNumber;
                    rollingMax = userNumber;
                } else{
                    rollingMin = Math.min(userNumber, rollingMin);
                    rollingMax = Math.max(userNumber, rollingMax);
                }

                System.out.println("Current number: " + userNumber +
                        " | Current Min: " + rollingMin + " | Current Max: " + rollingMax);
            } catch (NumberFormatException e){
                break;
            }
            loopCounter++;
        }
    }
}
