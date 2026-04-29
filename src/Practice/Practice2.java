package Practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double amountEuro;
        Double amountDollars;
        int choice;
        double fee;
        double custGets;

        System.out.print("If you want to exchange euro to dollars, press '1', if dollars to euro, press '2' :");
        choice = input.nextInt();

        if(choice == 1){
            System.out.print("Enter the amount in EUR: ");
            amountEuro = input.nextDouble();
            amountDollars = amountEuro * 1.09;
            fee = amountDollars * 0.03;
            custGets = amountDollars - fee;

            System.out.printf("The amount in dollars is %.2f , the fee is : %.2f doll%n" , custGets,fee );
        }
        else if(choice == 2){
            System.out.print("Enter the amount in DOLL: ");
            amountDollars = input.nextDouble();
            amountEuro = amountDollars * 0.92;
            fee = amountEuro * 0.03;
            custGets = amountEuro - fee;
            System.out.printf("The amount in euro is %.2f , the fee is : %.2f eur%n" , custGets,fee );
        }
        else{
            System.out.println("Your choice is not valid. ");
        }

        input.close();
    }
}
