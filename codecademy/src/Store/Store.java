public class Store {
    // declare instance fields here!


    // constructor method
    public Store() {
        System.out.println("I am inside the constructor method.");
        String productType;
    }

    // main method
    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");

        Store lemonadeStand = new Store();

        System.out.println(lemonadeStand);
    }
}