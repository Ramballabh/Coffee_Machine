package stage3;

public class Stage3 {
    public void amountOfCoffee(int water, int milk, int beans, int n) {
        water /= 200;
        milk /= 50;
        beans /= 15;

        int min = Math.min(water, milk);
        min = Math.min(beans, min);
    }

    public void printMessage(int n, int min) {
        if (n == min) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (n < min) {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (min - n) + " more than that)");
        } else {
            System.out.println("No, I can make only " + min + " cup(s) of coffee");
        }
    }
}
