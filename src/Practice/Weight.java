package Practice;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the Weight conversion program! ");
        System.out.println("1. Convert lbs to kgs ");
        System.out.println("2. Convert kgs to lbs ");

        System.out.print("Choose an option: ");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter your weight in lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.4536;
            System.out.printf("Your weight in kgs: %.2f ", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter your weight in kgs: ");
            weight = input.nextDouble();
            newWeight = weight * 2.20;
            System.out.printf("Your weight in lbs: %.2f ", newWeight);

        } else {
            System.out.println("Your choice is not valid");
        }


        input.close();

    }
}

