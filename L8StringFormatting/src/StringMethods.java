public class StringMethods {

    public static void main(String[] args) {
        String sampleString = "My name is Kevin";
        printString(sampleString);

        String sampleEmptyString = "";
        printString(sampleEmptyString);

        String sampleBlankString = "\t \n";
        printString(sampleBlankString);

        String helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf("r"));

        System.out.printf("Index of l = %d %n", helloWorld.indexOf("l"));
        System.out.printf("LastIndex of l = %d %n", helloWorld.lastIndexOf("l"));

        System.out.printf("Index of l = %d %n", helloWorld.indexOf("l", 3));
        System.out.printf("LastIndex of l = %d %n", helloWorld.lastIndexOf("l", 5));

        String helloWorldLower = helloWorld.toLowerCase();
        boolean containsHello = helloWorldLower.contains("hello");
        System.out.printf("The string contains hello: %s %n", containsHello);
        System.out.printf("Is %s = %s: %b %n", helloWorld, helloWorldLower, helloWorld.equals(helloWorldLower));

        String prefix = "hello";
        String suffix = "d";
        System.out.printf("Does %s start with %s: %b %n", helloWorldLower, prefix, helloWorldLower.startsWith(prefix));
        System.out.printf("Does %s end with %s: %b %n", helloWorldLower, suffix, helloWorldLower.endsWith(suffix ));

    }

    public static void printString(String string) {
        int length = string.length();
        if (string.isEmpty()){
            System.out.println("The string is empty");
            return;
        } else if (string.isBlank()) {
            System.out.println("The string is blank");
        }

        System.out.printf("String length: %d %n", length);
        System.out.printf("First character: %c %n", string.charAt(0));
        System.out.printf("Last character: %c %n", string.charAt(length-1));
    }

}
