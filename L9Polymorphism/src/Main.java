public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");

        Monitor theMonitor = new Monitor("27InchBeast", "Acer", 27, "2540 x 1440");

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 2, 4, "v2.44");

        PersonalComputer myPC = new PersonalComputer("2208", "Dell", theMonitor, theMotherBoard, theCase);

//        myPC.getMonitor().drawPixelAt(10, 10, "red");
//        myPC.getMotherBoard().loadProgram("Windows OS");
//        myPC.getComputerCase().pressPowerButton();

        myPC.powerUp();
    }
}