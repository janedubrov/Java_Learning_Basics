public class Length {
    public static void main(String[] args) {


        prepareDough();
        makeVeggiePizza();
        finisching();
        prepareDough();
        makeHawaianPizza();
        finisching();
    }

    public static void makeVeggiePizza() {
        System.out.println("Adding some vegetables");
        System.out.println("Adding a cheese");
    }

        public static void makeHawaianPizza() {
        System.out.println("Adding some ham");
            System.out.println("Adding a pineapple");

    }

    public static void prepareDough() {
        System.out.println("Prepairing a dough");
        System.out.println("Adding a souce");
    }
    public static void finisching() {
        System.out.println("Your pizza is ready!");
    }


    }