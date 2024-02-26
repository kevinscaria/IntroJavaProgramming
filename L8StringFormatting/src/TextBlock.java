public class TextBlock {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

//        printf does not add newline character by default at the end
        int age = 35;
//        %d is a format specifier for Decimal Integer
        System.out.printf("Your age is %d\n", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d\n", age, yearOfBirth);

//        Use %n formatted for new line , %f is a format specifier for float
        System.out.printf("Age = %d, Birth year = %.2f%n", age, (float ) yearOfBirth);

//        Aligning numbers by specifying width (it is set as 9 because 6 digits + decimal point + 2 trailing zeros)
        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing numbers: %9.2f %n", (float) i);
        }

//        Other ways to do string formatting
        String formattedString = String.format("My age is %d", age);
        System.out.println(formattedString);

        String newFormattedString = "Hey I am %d years old and I like %s".formatted(25, "chocolates");
        System.out.println(newFormattedString);
    }
}