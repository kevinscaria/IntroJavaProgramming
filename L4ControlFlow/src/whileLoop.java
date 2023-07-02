public class whileLoop {
    public static void main(String[] args) {
        int myAge = 55;
        while (myAge > 0){
            if (myAge == 35) {
                myAge-=2;
                continue;
            }
            else{
                myAge-=5;
            }
            System.out.println("My current age is: " + myAge);
        }
        System.out.println("My age is: " + myAge);
    }
}
