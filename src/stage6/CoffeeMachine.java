package stage6;

import java.util.Scanner;

public class CoffeeMachine {

    private Scanner scanner;

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    private CoffeeMachine() {
        this.scanner = new Scanner(System.in);
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public void printState() {
        System.out.println("The coffee machine has:\n" +
                String.format("%d of water\n", this.water) +
                String.format("%d of milk\n", this.milk) +
                String.format("%d of coffee beans\n", this.beans) +
                String.format("%d of disposable cups\n", this.cups) +
                String.format("%d of money", this.money));
    }

    private void processBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String type = this.scanner.nextLine();
        if (type.equals("back")) return;
        ;
    }

    private void processTake() {
        System.out.println(String.format("I gave you $%d", this.money));

    }

    private void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    private void take() {
        this.money = 0;
    }

    private void buy(int type) {
        int water = 0;
        int milk = 0;
        int beans = 0;
        int money = 0;
    }
}
