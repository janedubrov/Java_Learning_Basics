package Lesson5;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temp;
        double tempFahr;


        System.out.print("What is the temperature in Celcius? : ");
        temp = input.nextDouble();

        tempFahr = convertedTemp(temp);
        System.out.printf("Temperature in fahr is: %.2f C \n", tempFahr);

        if(tempFahr > 90.0){
            System.out.println("It is too hot outside! ");
        }

        input.close();

}
        static double convertedTemp(double temp){
        return temp * 1.8 + 32;
        }

}
