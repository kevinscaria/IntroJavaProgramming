public class SwitchStatements {

    public static void main(String[] args) {
        int value = 4;

        switch (value){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is " + value);
                break;
            default:
                System.out.println("Value not 1, 2, 3, 4 or 5");
                break;
        }

        System.out.println("The quarter is: " + getQuarter("October"));
    }

    public static String getQuarter(String month){
//        Two ways of writing multiple cases in single lines
        switch (month) {
            case "January", "February", "March":
                return "Q1";
            case "April", "May", "June":
                return "Q2";
            case "July", "August", "September":
                return "Q3";
            case "October": case "November": case "December":
                return "Q4";
        }
        return "Bad";
    }
}