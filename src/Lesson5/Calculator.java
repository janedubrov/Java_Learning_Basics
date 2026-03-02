package Lesson5;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        int years;
        int compoundTimes;
        double amount;

        System.out.print("Enter the prinicipal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        rate = input.nextInt() / 100.0;

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        System.out.print("Enter the number of compounds: ");
        compoundTimes = input.nextInt();

        amount = principal * Math.pow(1 + rate / compoundTimes , compoundTimes * years);
        System.out.printf("At the end of the period the amount will be $%.2f", amount);

        input.close();

    }
}
