package main;

import stage1.Stage1;
import stage2.Stage2;
import stage3.Stage3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            case 3:
                Stage3 stage3 = new Stage3();
        }
    }
}
