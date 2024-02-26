public class StringBuilderMethods {

    public static void main(String[] args) {
//        Mutable string option using StringBuilder

        String helloWorldString = "Hello" + "World";
//        When change is not updated with new variable name, there is no change observed.
        helloWorldString.concat(". How are you today?");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        helloWorldBuilder.append(". How are you today?");

        printInformation(helloWorldString);
        printInformation(helloWorldBuilder);

//        Capacity of StringBuilders - Default 16 characters.
        StringBuilder builderString = new StringBuilder();
        builderString.append("ABC".repeat(8));

        StringBuilder builderString32 = new StringBuilder(32);
        builderString32.append("ABC".repeat(17));

        printInformation(builderString);
        printInformation(builderString32);

//        Mutable Option methods
        StringBuilder builderPlus = new StringBuilder("Hello" + "Bro");
        builderPlus.append(". Doing Good?");
        System.out.println(builderPlus);
        int indexOfCharacterToReplaceToLowerCase = builderPlus.indexOf("G");
        builderPlus.deleteCharAt(indexOfCharacterToReplaceToLowerCase).insert(indexOfCharacterToReplaceToLowerCase, 'g');
        System.out.println(builderPlus);

        int indexOfCharacterToReplaceToUpperCase = builderPlus.lastIndexOf("g");
        builderPlus.replace(indexOfCharacterToReplaceToUpperCase, indexOfCharacterToReplaceToUpperCase+1, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length: " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length: " + builder.length());
        System.out.println("Capacity: " + builder.capacity());
    }
}
