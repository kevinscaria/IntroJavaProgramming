public class TraditionalSwitchChallenge {

    public static void main(String[] args) {
        char alpha = 'B';
        System.out.println(toNato(alpha));
    }

    public static String toNato(char alphabet){
        switch (alphabet){
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Invalid Input";
        }
    }
}
