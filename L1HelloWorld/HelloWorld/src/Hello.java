public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Kevin");

        // If else statements
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Kevin is not an alien");
            System.out.println("And I am scared of aliens");
        } else {
            System.out.println("Kevin is an alien");
            System.out.println("This is second statement of else block");
        }

        // Logical Operators
        int myAge = 10; int myHeight = 20;
        if ((myAge >= 10) && (myHeight > 15)){
            System.out.println("You are a quick bloomer!!");
        }
        if ((myAge < 10) && ((myHeight > 10) || (myHeight <= 15))){
            System.out.println("You are a quick bloomer!!");
        } else {
            System.out.println("You are a late bloomer");
        }

        // Assignment vs Equality Operator
        int myVal = 50;
        if (myVal == 50){ // Equality operator returns boolean
            System.out.println("My val is 50.");
        }

        boolean myBool = false;
        if (myBool = true){
            System.out.println("This will be printed since the if statement assigns myBool as true" +
                    "and returns true.");
        }

        myBool = true;
        if (myBool == true){
            System.out.println("This will be printed since the if statement has an equality operator.");
        }

        if (myBool){
            System.out.println("Valid statement to just type the boolean");
        }

        myBool = false;
        if (!myBool){
            System.out.println("Using ! as negation operator.");
        }

        // Ternary Operator
        String makeOfCar = "BMW";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false:true;

        String domesticOrNot = isDomestic == true? "True":"False";
        if (isDomestic){
            System.out.println("The car owned in domestic");
        }
        else{
            System.out.println("The car owned is international");
        }

        if (domesticOrNot == "True"){
            System.out.println("The car is domestic: " + domesticOrNot);
        }
    }
}
