public class Car {
    private String make = "Tesla";
    private String model = "S";
    private String color = "Red";
    private int doors = 4;
    private boolean convertible = true;

    // Set methods - With setter method we can validate before updating private fields.
    public void setMake(String make){
        if (make == null) make = "Unknown";
        String makeLowerCase = make.toLowerCase();
        switch (makeLowerCase){
            case "holden", "porsche", "tesla", "hyundai", "honda" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    // Get methods
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println(doors + " - Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }


}
