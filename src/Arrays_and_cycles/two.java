package Arrays_and_cycles;

public class two {
    public static void main(String[] args) {
        theStarEmployee();
    }

    public static void theStarEmployee(){

        int[] sales = {42, 55, 30, 78, 61 };
        int bestSales = sales[0];
        int index = 0;

        for(int i = 0; i < sales.length; i++ ){
            if(sales[i] > bestSales){
                bestSales = sales[i];
                index = i;
                }
            }
        System.out.println("Best sales is: " + bestSales + " and Index: " + index);

        if(bestSales >50){
            bestSales = bestSales + 10;

        }

        System.out.println("The sales + bonus now is: " + bestSales);

    }
}
