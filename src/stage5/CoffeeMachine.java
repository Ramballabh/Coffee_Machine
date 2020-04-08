package stage5;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    static Scanner in = new Scanner(System.in);

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
}
