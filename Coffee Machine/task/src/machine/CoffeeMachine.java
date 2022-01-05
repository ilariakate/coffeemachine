package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.showOptions();
    }

    private Scanner scanner = new Scanner(System.in);
    private enum CoffeeType {
        ESPRESSO, LATTE, CAPPUCCINO;
    }
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    private int cash = 550;

    private final int ES_WATER = 250;
    private final int ES_COFFEE_BEANS = 16;
    private final int ES_COST = 4;

    private final int LT_WATER = 350;
    private final int LT_MILK = 75;
    private final int LT_COFFEE_BEANS = 20;
    private final int LT_COST = 7;

    private final int CP_WATER = 200;
    private final int CP_MILK = 100;
    private final int CP_COFFEE_BEANS = 12;
    private final int CP_COST = 6;

    public void showOptions() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();
        switch (action) {
            case "buy":
                this.buy();
                break;
            case "fill":
                this.fill();
                break;
            case "take":
                this.take();
                break;
            case "remaining":
                this.remaining();
                break;
            case "exit":
                this.exit();
                break;
            default:
                throw new RuntimeException("Unsupported keyword");

        }
    }

    public void buy() {
        // print options
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String action = scanner.nextLine();
        switch (action) {
            case "1":
                makeCoffee(CoffeeType.ESPRESSO);
                break;
            case "2":
                makeCoffee(CoffeeType.LATTE);
                break;
            case "3":
                makeCoffee(CoffeeType.CAPPUCCINO);
                break;
            case "back":
                showOptions();
                break;
            default:
                throw new RuntimeException("Unsupported buy option");
        }
        showOptions();
    }

    private void makeCoffee(CoffeeType type) {
        if (! hasEnoughWater(type)) {
            System.out.println("Sorry, not enough water!");
        } else if(! hasEnoughCoffeeBeans(type)) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if(! hasEnoughMilk(type)) {
            System.out.println("Sorry, not enough milk!");
        } else {
            consumeResources(type);
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    private void consumeResources(CoffeeType type) {
        switch (type) {
            case LATTE:
                water -= LT_WATER;
                milk -= LT_MILK;
                coffeeBeans -= LT_COFFEE_BEANS;
                cash += LT_COST;
                cups--;
                break;
            case ESPRESSO:
                water -= ES_WATER;
                coffeeBeans -= ES_COFFEE_BEANS;
                cash += ES_COST;
                cups--;
                break;
            case CAPPUCCINO:
                water -= CP_WATER;
                milk -= CP_MILK;
                coffeeBeans -= CP_COFFEE_BEANS;
                cash += CP_COST;
                cups--;
                break;
            default:
                throw new RuntimeException("Invalid coffee type");
        }
    }

    public void fill() {
        // print options
        System.out.println("Write how many ml of water you want to add:");
        int waterToFill = Integer.parseInt(scanner.nextLine());


        water = water + waterToFill;
        System.out.println("Write how many ml of milk you want to add:");
        int milkToFill = Integer.parseInt(scanner.nextLine());
        milk = milk + milkToFill;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beansToFill = Integer.parseInt(scanner.nextLine());
        coffeeBeans = coffeeBeans + beansToFill;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cupsToFill = Integer.parseInt(scanner.nextLine());
        cups = cups + cupsToFill;
        showOptions();
    }

    public void take() {
        // money withdraw
        System.out.println("I gave you $" + cash);
        cash = cash - cash;
        showOptions();
    }

    public void remaining() {
        // show remaining
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + cash + " of money");

        showOptions();

    }

    public void exit() {
        // turn off machine
        System.exit(0);

    }

    private boolean hasEnoughWater(CoffeeType type) {
        switch (type) {
            case ESPRESSO:
                return water > ES_WATER;
            case LATTE:
                return water > LT_WATER;
            case CAPPUCCINO:
                return water > CP_WATER;

        }
        return false;
    }
    private boolean hasEnoughMilk(CoffeeType type) {
        switch (type) {
            case ESPRESSO:
                return true;
            case LATTE:
                return milk > LT_MILK;
            case CAPPUCCINO:
                return milk > CP_MILK;

        }
        return false;
    }

    private boolean hasEnoughCoffeeBeans(CoffeeType type) {
        switch (type) {
            case ESPRESSO:
                return coffeeBeans > ES_COFFEE_BEANS;
            case LATTE:
                return coffeeBeans > LT_COFFEE_BEANS;
            case CAPPUCCINO:
                return coffeeBeans > CP_COFFEE_BEANS;
        }
        return false;
    }


}
