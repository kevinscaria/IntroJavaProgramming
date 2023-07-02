public class ChallengeOne {
    public static void main(String[] args) {
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        System.out.println(firstDouble);
        System.out.println(secondDouble);
        double sumDoubleNumbers = (firstDouble + secondDouble) * 100.00;
        double remainderDoubleByForty = sumDoubleNumbers%40.00;
        System.out.println(sumDoubleNumbers);
        System.out.println(remainderDoubleByForty);
        boolean noRemExists = remainderDoubleByForty == 0? true:false;
        System.out.println(noRemExists);
        if (noRemExists == false){
            System.out.println("Got some remainder");
        }

    }
}
