public class StringManipulation {

    public static void main(String[] args) {

//        Substring method
        String birthDate = "25/11/1995";
        int startingIndex = birthDate.indexOf("1995");
        System.out.println("Starting Index of Year: " + startingIndex );
        System.out.println("Birth Year: " + birthDate.substring(startingIndex));

        int delimiterOne = birthDate.indexOf("/");
        int delimiterTwo = birthDate.indexOf("/", delimiterOne+1);
        String day = birthDate.substring(0, delimiterOne);
        String month = birthDate.substring(delimiterOne+1, delimiterTwo);
        System.out.println("The day is: " + day + " and month is: " + month);

//        Join Strings with Delimiter
        String bioData = String.join(":", "Kevin", "Engineer", "Computer Science", "NLP");
        System.out.println(bioData);

//        Concat method - Less efficient (Runtime operation)
        String birthDateConcat = "25";
        birthDateConcat = birthDateConcat.concat("/").concat("11").concat("/").concat("2000");
        System.out.println("Con catenated Birth Date: " + birthDateConcat);

//        Replace method
        System.out.println(birthDate.replace("/", "-"));
        System.out.println(birthDate.replace("1", "X"));

//        Replace and ReplaceAll is different because the later accept regex whereas former accepts targets
        System.out.println(birthDate.replaceFirst("1", "X"));
        System.out.println(birthDate.replaceAll("1", "-X*"));

//        Repeat method
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

//        Repeat method
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
