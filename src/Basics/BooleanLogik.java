package Basics;

public class BooleanLogik {
    public static void main(String[] args) {
        // son, buy some bread:
        boolean isBoughtBread = true;
        // son, buy some milk:
        boolean isBoughtMilk = true;

        // And - YES: if true and true -> TRUE, if true and false or false and false --> FALSE
        boolean isBoughtBreadAndMilk = isBoughtBread && isBoughtMilk;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Great job, son!");
        } else if (isBoughtMilk) {
            System.out.println("Only milk can also work");
        } else if (isBoughtBread) {
            System.out.println("Bread we can use for toasts");
        } else {
            System.out.println("You need to go to the store one more time");
        }

// OR if one is true-> TRUE, if only all false --> FALSE
        boolean isBoughtMilkOrBread = true || true;
     //   boolean isBoughtMilkOrBread = TRUE;
     //   boolean isBoughtMilkOrBread = true || false;
     //   boolean isBoughtMilkOrBread = TRUE;
     //   boolean isBoughtMilkOrBread = false || false;
     //   boolean isBoughtMilkOrBread = FALSE;

        // NOT replaces true <-> false:
        // did he buy sweets or not:

        boolean isBoughtCandy = true;
        if (!isBoughtCandy){
            System.out.println("Mom is happy without candies");
        }






    }
}
