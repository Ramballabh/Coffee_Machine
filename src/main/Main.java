package main;

import stage1.Stage1;
import stage2.Stage2;
import stage3.Stage3;
import stage4.CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Enter your choice :\n" +
                    "1. Stage1\n" +
                    "2. Stage2\n" +
                    "3. Stage3\n" +
                    "4. Stage4\n" +
                    "5. Stage5\n" +
                    "6. Stage6 or Final Stage\n" +
                    "7. Exit\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Stage1 stage1 = new Stage1();
                    stage1.printProcessSteps();
                    break;
                case 2:
                    Stage2 stage2 = new Stage2();
                    System.out.println("Write how many cups of coffee you will need:");
                    int coffees = scanner.nextInt();
                    stage2.quantityOfDifferentMaterial(coffees);
                    break;
                case 3:
                    Stage3 stage3 = new Stage3();

                    System.out.println("Write how many ml of water the coffee machine has:");
                    int water = scanner.nextInt();

                    System.out.println("Write how many ml of milk the coffee machine has:");
                    int milk = scanner.nextInt();

                    System.out.println("Write how many grams of coffee beans the coffee machine has:");
                    int beans = scanner.nextInt();

                    System.out.println("Write how many cups of coffee you will need:");
                    int n = scanner.nextInt();
                    stage3.amountOfCoffee(water, milk, beans, n);
                    break;
                case 4:
                    CoffeeMachine coffeeMachine = new CoffeeMachine();
                    coffeeMachine.printMachineState();
                    coffeeMachine.menu(coffeeMachine);
                    coffeeMachine.printMachineState();
                    break;
                case 5:
                    stage5.CoffeeMachine coffeeMachine1 = new stage5.CoffeeMachine();
                    while (true) {
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        switch (scanner.nextLine()) {
                            case ("buy"):
                                coffeeMachine1.buy();
                                break;
                            case ("fill"):
                                coffeeMachine1.fill();
                                break;
                            case ("take"):
                                coffeeMachine1.take();
                                break;
                            case ("remaining"):
                                coffeeMachine1.showStats();
                                break;
                            case ("exit"):
                                System.exit(0);
                        }
                    }
                case 6:
                    stage6.CoffeeMachine coffeeMachine2 = new stage6.CoffeeMachine();
                    boolean status;
                    do {
                        status = coffeeMachine2.processAction();
                    }
                    while (status);
                    break;
                case 7:
                    flag = false;
            }
        } while (flag);
    }
}
