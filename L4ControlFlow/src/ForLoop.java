public class ForLoop {

    public static void main(String[] args) {

        for (int i = 1, height = 150, weight = 65; i <=5 && height <= 154 && weight <= 69; i++, height++, weight++){
            if (weight == 68){
                break;
            }
            System.out.println("BMI for student " + i + " is: " + calculateBMI(height, weight));
        }
    }

    public static double calculateBMI(int height, int weight){
        double heightInMetres = (double) height/100;
        return weight/(Math.pow(heightInMetres, 2));
    }

}
