package Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        Double principal;
        Double amount;
        Double rate;
        int years;
        int compoundTimes;

        System.out.print("Enter the amount of principal: ");
        principal = input.nextDouble();

        System.out.print("Enter the rate in % : ");
        rate = input.nextDouble() /100;

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        System.out.print("Enter the number of compounds per years: ");
        compoundTimes = input.nextInt();

        amount = principal * Math.pow(1 + rate / compoundTimes , compoundTimes * years);
        System.out.printf("At the end of period your amount is $%.1f", amount);

        input.close();

    }
}
