// Composition defines a HAS A relationship
public class PersonalComputer extends Product{
    private Monitor monitor;
    private Motherboard motherBoard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor,
                            Motherboard motherBoard,
                            ComputerCase computerCase
    ) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.computerCase = computerCase;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherBoard() {
//        return motherBoard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
}
