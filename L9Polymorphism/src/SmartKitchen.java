public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen() {
        iceBox = new Refrigerator();
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
    }

    private void orderFoodUsingRefrigerator() {
        iceBox.orderFood();
    }

    private void brewCoffeeUsingCoffeeMaker() {
        brewMaster.brewCoffee();
    }

    private void loadDishesUsingDishWasher() {
        dishWasher.doDishes();
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);

    }

    public void doKitchenWork() {
        brewCoffeeUsingCoffeeMaker();
        orderFoodUsingRefrigerator();
        loadDishesUsingDishWasher();
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (this.hasWorkToDo) {
            System.out.println("Ordering food.");
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (this.hasWorkToDo) {
            System.out.println("Doing dishes.");
        }
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (this.hasWorkToDo) {
            System.out.println("Brewing Coffee.");
        }
    }
}
