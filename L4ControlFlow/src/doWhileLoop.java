public class doWhileLoop {

    public static void main(String[] args) {
        int myMarks = 98;
        boolean crossThresh = true;
        do {
            if (myMarks > 50){
                myMarks-=5;
                System.out.println("My current mark is: " + myMarks);
            } else {
                crossThresh = false;
            }
        } while (crossThresh);
    }
}
