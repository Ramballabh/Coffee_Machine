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

    public void setCups(int cups) {
        this.cups += cups;
    }

    public void setWaterN(int waterN) {
        this.waterN += waterN;
    }

    public void setMilkN(int milkN) {
        this.milkN += milkN;
    }

    public void setCoffeeN(int coffeeN) {
        this.coffeeN += coffeeN;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String askAnswer(String ask) {
        System.out.println(ask);
        return scanner.nextLine();
    }

    public void makeEspresso() {
        this.waterN -= 250;
        this.cups -= 1;
        this.coffeeN -= 16;
        this.money += 4;

    }

    public void makeLatte() {
        this.milkN -= 75;
        this.waterN -= 350;
        this.cups -= 1;
        this.coffeeN -= 20;
        this.money += 7;
    }

    public void makeCappuccino() {
        this.milkN -= 100;
        this.waterN -= 200;
        this.cups -= 1;
        this.coffeeN -= 12;
        this.money += 6;
    }

    public void fillAction(CoffeeMachine coffeeMachine) {
        coffeeMachine.setWaterN(Integer.parseInt(coffeeMachine.askAnswer("Write how many ml of water do you want to add: ")));
        coffeeMachine.setMilkN(Integer.parseInt(coffeeMachine.askAnswer("Write how many ml of milk do you want to add: ")));
        coffeeMachine.setCoffeeN(Integer.parseInt(coffeeMachine.askAnswer("Write how many grams of coffee beans do you want to add: ")));
        coffeeMachine.setCups(Integer.parseInt(coffeeMachine.askAnswer("Write how many disposable cups of coffee do you want to add:")));
    }

    public void takeAction(CoffeeMachine coffeeMachine) {

    }

}
