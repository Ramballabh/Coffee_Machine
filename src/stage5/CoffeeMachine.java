package stage5;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    static Scanner in = new Scanner(System.in);

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String result = "";
        switch (in.nextLine()) {
            case ("1"): {
                result = CoffeeMachine.makeCoffee(250, 0, 16, 4);
                break;
            }
            case ("2"): {
                result = CoffeeMachine.makeCoffee(350, 75, 20, 7);
                break;
            }
            case ("3"): {
                result = CoffeeMachine.makeCoffee(200, 100, 12, 6);
                break;
            }
            default: {
                return;
            }
        }
    }

    public static String makeCoffee(int water, int milk, int coffeeBeans, int money) {
        String res = "Sorry, not enough ";
        water = CoffeeMachine.water - water;
        milk = CoffeeMachine.milk - milk;
        coffeeBeans = CoffeeMachine.coffeeBeans - coffeeBeans;
        if (water < 0) {
            res += "water ";
        }
        if (milk < 0) {
            res += "milk ";
        }
        if (coffeeBeans < 0) {
            res += "coffee ";
        }
        if (CoffeeMachine.disposableCups < 1) {
            res += "disposable cups";
        }
        if (res.length() == 18) {
            CoffeeMachine.water = water;
            CoffeeMachine.milk = milk;
            CoffeeMachine.coffeeBeans = coffeeBeans;
            CoffeeMachine.money += money;
            CoffeeMachine.disposableCups--;
            res = "I have enough resources, making you a coffee!";
        }
        return res;
    }

    public static void take() {
        System.out.printf("I gave you $%d\n", CoffeeMachine.money);
        CoffeeMachine.money = 0;
    }

    public static void fill() {
        System.out.println("Write, how many ml of water do you want to add:");
        CoffeeMachine.water += Integer.parseInt(in.nextLine());

        System.out.println("Write, how many ml of milk do you want to add:");
        CoffeeMachine.milk += Integer.parseInt(in.nextLine());

        System.out.println("Write, how many grams of coffee beans do you want to add:");
        CoffeeMachine.coffeeBeans += Integer.parseInt(in.nextLine());

        System.out.println("Write, how many disposable cups of coffee do you want to add:");
        CoffeeMachine.disposableCups += Integer.parseInt(in.nextLine());
    }

    public static void showStats() {
        System.out.printf("The coffee machine has:\n" +
                        "%d of water\n" +
                        "%d of milk\n" +
                        "%d of coffee beans\n" +
                        "%d of disposal cups\n" +
                        "%d of money\n",
                CoffeeMachine.water, CoffeeMachine.milk, CoffeeMachine.coffeeBeans, CoffeeMachine.disposableCups, CoffeeMachine.money);
    }
}
