public class Main {
    public static void main(String[] args) {

        // Create PLayer with no Encapsulation
        Player player = new Player();
        player.name = "Guy";
        player.health = 20;
        player.weapon = "Machete";

        int damage = 10;
        player.loseHealth(damage);
        int currentHealth = player.healthRemaining();
        System.out.println("CURRENT HEALTH: " + currentHealth);

        int extraHealth  = 60;
        player.restoreHealth(extraHealth);
        currentHealth = player.healthRemaining();
        System.out.println("CURRENT HEALTH: " + currentHealth);

        extraHealth  = 50;
        player.restoreHealth(extraHealth);
        currentHealth = player.healthRemaining();
        System.out.println("CURRENT HEALTH: " + currentHealth);

        // Main class going rogue is a problem
        player.health = 200;
        currentHealth = player.healthRemaining();
        System.out.println("CURRENT HEALTH IS " + currentHealth + ", BUT IT SHOULD NEVER BE >= 100");


        // Create Enhanced Player with Encapsulation
        EnhancedPlayer player2 = new EnhancedPlayer("Max Payne");
        System.out.println("The initial health for player is : " + player2.healthRemaining());



    }
}