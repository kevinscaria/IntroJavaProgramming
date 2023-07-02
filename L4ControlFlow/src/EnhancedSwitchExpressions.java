public class EnhancedSwitchExpressions {
//    Available from JDK14
    public static void main(String[] args) {
        int switchVal = 5;

        switch (switchVal) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> System.out.println("Value is " + switchVal);
            case 6, 7, 8 -> {
                System.out.println("Value is 6, 7, 8");
                System.out.println("Value is " + switchVal);
            }
            default -> System.out.println("None of 1, 2, 3, 4, 5, 6, 7 or 8");
        }

        // Without Yield Using Return
        System.out.println("The quarter is: " + getQuarter("January"));

        // With Yield Using Return
        String monthVal = "October";
        System.out.println(getQuarterWithYield(monthVal));

        monthVal = "Octoberzz";
        System.out.println(getQuarterWithYield(monthVal));
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "January", "February", "March" -> "Q1";
            case "April", "May", "June" -> "Q2";
            case "July", "August", "September" -> "Q3";
            case "October", "November", "December" -> "Q4";
            default -> "bad";
        };
    }

    public static String getQuarterWithYield(String month){
        return switch (month) {
            case "January", "February", "March" -> {
                String returnValCase1 = "The quarter for month " + month + " is " + "Q1";
                yield returnValCase1;
            }
            case "April", "May", "June" -> {
                String returnValCase2 = "The quarter for month " + month + " is " + "Q2";
                yield returnValCase2;
            }
            case "July", "August", "September" -> {
                String returnValCase3 = "The quarter for month " + month + " is " + "Q3";
                yield returnValCase3;
            }
            case "October", "November", "December" -> {
                String returnValCase4 = "The quarter for month " + month + " is " + "Q4";
                yield returnValCase4;
            }
            default -> {
                String badException = "The month " + month + " is a bad input. Enter a valid month.";
                yield badException;
            }
        };
    }

}
