import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println("The error is " + e);
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hey, what's your name?");
        System.out.println("Hi " + name + " welcome.");

        String dob = System.console().readLine("What is the year of birth?");
        int yob = Integer.parseInt(dob);
        System.out.println("You are " + (currentYear - yob) + " years old.");
        return "";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        int age = 0;
        boolean validYob = false;
        do {
            System.out.println("Enter your year of birth: (>=" + (currentYear - 125) +
                    " <= " + (currentYear) + ")");
            try {
                age = checkData(currentYear, sc.nextLine());
                validYob = age < 0 ? false : true;
            } catch (NumberFormatException e){
                System.out.println("Enter a valid year.");
            }
        } while (!validYob);

        return "You are " + age + " years old.";
    }

    public static int checkData(int currentYear, String yobString){
        int yob = Integer.parseInt(yobString);
        int minYear = currentYear - 125;
        if ((yob < minYear) || (yob > currentYear)){
            return -1;
        } else {
            return currentYear - yob;
        }

    }
}