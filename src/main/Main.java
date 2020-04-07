package main;

import stage1.Stage1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Stage1 stage1 = new Stage1();
                stage1.printProcessSteps();
        }
    }
}
