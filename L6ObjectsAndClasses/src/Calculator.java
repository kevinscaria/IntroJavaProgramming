/**
 *<li>
 Static Methods can't access instance methods & variables directly
 </li>
 <li>
 Used for cases where data from instance is not required
 </li>
 <li>
 Instance methods can access instance methods and variables directly
 </li>
 <li>
 Instance methods can also access static methods and variables directly
 </li>
 */
public class Calculator {
    public static void printSum(int a, int b){
        System.out.println("\nSum: " + (a + b));
        printRandom(); // static methods in same class can be called directly methodName()
    }

    public static void printRandom(){
        System.out.println("Random");
    }
}
