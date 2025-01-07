public class ChallengeMain {
    public static void main(String[] args) {
        SmartKitchen mySmartKitchen = new SmartKitchen();
        mySmartKitchen.setKitchenState(true, true, true);
        mySmartKitchen.doKitchenWork();
        System.out.println();
        mySmartKitchen.setKitchenState(true, false, true);
        mySmartKitchen.doKitchenWork();
    }
}
