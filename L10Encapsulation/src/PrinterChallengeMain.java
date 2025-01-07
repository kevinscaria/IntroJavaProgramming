public class PrinterChallengeMain {
    public static void main(String[] args) {
        Printer printer1 = new Printer(20, false);
        Printer printer2 = new Printer(40, true);

        printer1.addToner(30);
        System.out.println("Toner Level: " + printer1.getTonerLevel());
        printer1.addToner(60);
        System.out.println("Toner Level: " + printer1.getTonerLevel());
        printer1.printPages(20);
        System.out.println("Total pages printed: " + printer1.getPagesPrinted());

        System.out.println("Printer 2 Stats");
        System.out.println("Total pages printed: " + printer2.getPagesPrinted());
        printer2.printPages(23);
        System.out.println("Total pages printed: " + printer2.getPagesPrinted());
        printer2.printPages(20);
        System.out.println("Total pages printed: " + printer2.getPagesPrinted());

    }
}
