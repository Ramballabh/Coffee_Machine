package stage2;

public class Stage2 {
    public void quantityOfDifferentMaterial(int coffee) {
        int water = 200 * coffee;
        int milk = 50 * coffee;
        int beans = 15 * coffee;
        System.out.println("For " + coffee + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
    }

}
