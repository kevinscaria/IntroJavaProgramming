/**
 <p>
 This class will be used for showcasing the static variable type
 and instance variable type
 </p>
*/

public class Dog {

    // Static variable
    private static String staticName;

    // Instance variable
    private String instanceName;

    private static final String breed = "Doberman";

    public Dog(String name){
        this.instanceName = name;
        Dog.staticName = name;
        // Static Variable does not need object instantiation
    }

    void printStaticName(){
        System.out.printf("Dog is " + Dog.staticName);
    }

    void printInstanceName(){
        System.out.printf("Dog legs: " + instanceName);
    }

    void printBreed(){
        System.out.println("Dog breed is: " + Dog.breed);
    }
}
