package Arrays_and_cycles;

public class Array1 {
    public static void main(String[] args) {
        reduceStock();
    }

    public static void reduceStock(){
        int[] stock = {14, 50, 27, 100, 45, 8};

        int maxItem = stock [0];
        int index = 0;

        for(int i = 0; i < stock.length; i++ ){
            if(stock[i] > maxItem){
                maxItem = stock[i];
                index = i;

            }

        }
        System.out.println("Max amount of items is: " + maxItem + " and they are on : " + index + " shelf");

        int newAmount = maxItem / 2;

        System.out.println("The new amount on a shelf " + index + " is : " + newAmount );

    }
}

