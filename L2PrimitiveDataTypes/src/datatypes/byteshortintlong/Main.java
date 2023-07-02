package datatypes.byteshortintlong;

public class Main {
    public static void main(String [] args){

        byte myByteMin = Byte.MIN_VALUE;
        byte myByteMax = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + myByteMin);
        System.out.println("Byte maximum value: " + myByteMax);

        short myShortMin = Short.MIN_VALUE;
        short myShortMax = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + myShortMin);
        System.out.println("Short maximum value: " + myShortMax);

        int myIntMin = Integer.MIN_VALUE;
        int myIntMax = Integer.MAX_VALUE;
        System.out.println("Integer minimum value: " + myIntMin);
        System.out.println("Integer maximum value: " + myIntMax);
        System.out.println("Busted minimum value: " + (myIntMin - 1));
        System.out.println("Busted maximum value: " + (myIntMax + 1));

        long myLongMin = Long.MIN_VALUE;
        long myLongMax = Long.MAX_VALUE;
        System.out.println("Long minimum value: " + myLongMin);
        System.out.println("Long maximum value: " + myLongMax);

        float myFloatMin = Float.MIN_VALUE;
        float myFloatMax = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myFloatMin);
        System.out.println("Float maximum value: " + myFloatMax);

        double myDoubleMin = Double.MIN_VALUE;
        double myDoubleMax = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myDoubleMin);
        System.out.println("Double maximum value: " + myDoubleMax);

        char myChar = '\u1006';
        System.out.println("Char value: " + myChar);

        String myFirstString = "Kevin";
        String mySecondString = "Joseph";
        String myThirdString = "50";
        int myNumInt = 25;
        float myNumFloat = (float) 1234.56;
        System.out.println("Name: " + myFirstString + mySecondString);
        System.out.println("String will convert other values to string: " + myThirdString + myNumInt);
        System.out.println("String will convert other values to string: " + myThirdString + myNumFloat);
    }
}
