package Methods;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sales;
        double bonus;

        System.out.print("How much money did you earned? : ");
        sales = input.nextDouble();

        bonus = calculateBonus(sales);
        System.out.println("Your bonus is: " + bonus);

}
     static double calculateBonus(double sales){
        double bonus;
        if (sales > 1000){
             bonus = sales * 0.10;
        }
        else {
             bonus = sales * 0.05;
        }
        return bonus;
        }

}
