public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = ((tonerLevel >= 0) && (tonerLevel <= 100)) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public Printer(int tonerLevel, boolean duplex) {
        this(tonerLevel, 0, duplex);
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAdded) {
        int tempTonerLevel = tonerLevel + tonerAdded;
        if (tempTonerLevel > 100) {
            return -1;
        } else if (tempTonerLevel <= 0) {
            return -1;
        } else {
            tonerLevel = tempTonerLevel;
            return tonerLevel;
        }
    }

    public int printPages(int numPages) {
        if (duplex) {
            System.out.println("Duplex printing.");
            int jobPages = (numPages/2) + (numPages%2);
            System.out.println("Pages printing in the job: ");
            System.out.println("Duplex: " + numPages/2);
            System.out.println("Single: " + numPages%2);
            pagesPrinted+=jobPages;
            return pagesPrinted;
        } else {
            System.out.println("Pages printing in the job: ");
            System.out.println(numPages);
            pagesPrinted+=numPages;
            return numPages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
