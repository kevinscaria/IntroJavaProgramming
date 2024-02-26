public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("GenericAnimal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "slow");

        Dog tommy = new Dog("German Shepherd", 125, "Straight", "Bushy");
        doAnimalStuff(tommy, "fast");

        Dog wolf = new Dog("Wolf", 150, "Pointy", "Bushy");
        doAnimalStuff(wolf, "fast");

        Fish nemo = new Fish("AngelFish", 10, 3, 4);
        doAnimalStuff(nemo, "fast");

        Fish goldy = new Fish("GoldFish", 10, 3, 4);
        doAnimalStuff(goldy, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
}