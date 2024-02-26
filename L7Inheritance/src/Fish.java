public class Fish extends Animal {

    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "Small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFins();
        }
        System.out.println();
    }

    private void moveMuscles(){
        System.out.print("Move muscles ");
    }

    private void moveBackFins(){
        System.out.print("Move backfin");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
