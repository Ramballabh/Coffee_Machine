package stage4;

import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);
    int cups;
    int waterN;
    int milkN;
    int coffeeN;
    int money;

    public CoffeeMachine() {
        this.cups = 9;
        this.waterN = 1200;
        this.milkN = 540;
        this.coffeeN = 120;
        this.money = 550;
    }

    public String askAnswer(String ask) {
        System.out.println(ask);
        return scanner.nextLine();
    }

}
