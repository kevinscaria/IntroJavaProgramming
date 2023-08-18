public class StaticAndInstanceMain {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");

        fluffy.printStaticName(); // Both would print fluffy
        System.out.println();
        rex.printStaticName(); // Both would print fluffy
        // This is because the static variable is set as fluffy in the most recent instantiation

        System.out.println();
        System.out.println();
        fluffy.printInstanceName(); // Fluffy
        System.out.println();
        rex.printInstanceName(); // Rex
        // This is because the instance variable depends on instantiation

        Calculator.printSum(5, 10); // Directly call static method and object instantiation not needed
    }
}
