package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterPerCup = 200;
        int milkPerCup = 50;
        int coffeeBeansPerCup = 15;

        System.out.println("Write how many ml of water the coffee machine has: ");
        int capacityWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int capacityMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int capacityCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int coffeeCups = scanner.nextInt();

        int maxCupsWater = capacityWater / waterPerCup;
        int maxCupsMilk = capacityMilk / milkPerCup;
        int maxCupsCoffeeBeans = capacityCoffeeBeans / coffeeBeansPerCup;
        int maxCupsPossible = Math.min(Math.min(maxCupsWater, maxCupsMilk), maxCupsCoffeeBeans);

        if (coffeeCups < maxCupsPossible) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", maxCupsPossible - coffeeCups);
        } else if (coffeeCups > maxCupsPossible) {
            System.out.printf("No, I can make only %d cup(s) of coffee", maxCupsPossible);
        } else
            System.out.println("Yes, I can make that amount of coffee");
    }
}
