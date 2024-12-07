package Training;

import java.util.Random;
import java.util.Scanner;

public class learna {
    public static void main(String[] args) {

        //System Object
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Game Variabel
        String[] enemies = { "Skeleton", "Zombie", "Creeper"};
        int maxEnemiesHealth = 75;
        int maxAttackDamage = 25;

        //Player Variabel
        int healthPlauer = 100;
        int attackDamage = 50;
        int regeneration = 3;
        int healthPotioonHealAmount = 30;
        int healthPotionDropPotion = 50; //percentage

        boolean running = true;

        System.out.println("Welcome to the Journey Adventure");

        GAME:
        while (running) {
            System.out.println("======================");

            int enemyHealth = rand.nextInt(maxEnemiesHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t");
        }



    }

}
