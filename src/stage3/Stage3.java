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

    }
}
