public class MethodsChallenge3 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            long megaBytes = kiloBytes / 1024;
            long kiloByteRemaining = kiloBytes % 1024;
            System.out.println(kiloBytes + " = " + megaBytes +
                    " MB and " + kiloByteRemaining + "KB");
        }
    }
}
