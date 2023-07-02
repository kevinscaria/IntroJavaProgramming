import java.util.Scanner;

public class addUserInputNumbers {
    public static void main(String[] args) {
        System.out.println("---- Number Sum ----");
        double sumFiveNumbers = sumNumbers();
        System.out.println("The sum of the numbers are: " + sumFiveNumbers);
    }

    public static double sumNumbers(){
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        double sum = 0;
        while (idx < 5){
            try {
                System.out.println("Enter number #" + (idx+1) + ": ");
                sum+=Double.parseDouble(sc.nextLine());
                idx++;
            } catch (Exception e){
                System.out.println("Invalid entry for number #" + (idx+1) + ".");
            }

        }
        return sum;
    }
}
