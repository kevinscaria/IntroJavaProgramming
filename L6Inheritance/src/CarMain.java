public class CarMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car myCar = new Car();

        // Getter Method Invoking
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        myCar.describeCar();

        // Setter Method Invoking
        myCar.setMake("Hyundai");
        myCar.setColor("Black");
        myCar.setModel("Verna");
        myCar.setConvertible(false);
        myCar.setDoors(4);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        myCar.describeCar();

        // Setter Method - Make Field Control
        myCar.setMake("Tata");

        // Getter Method Invoking - After Setter
        System.out.println("Make: " + myCar.getMake());
    }
}