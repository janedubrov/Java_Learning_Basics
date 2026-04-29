import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = input.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit?  (C or F) : ");
        unit = input.next().toUpperCase();

        if(unit.equals("C")){
            newtemp = (temp * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + newtemp + "F");

        }
        else if(unit.contains("F")){
            newtemp = (temp - 32) / 1.8;
            System.out.printf("The temperature in Celcius is: %.2f C", newtemp);
        }
//        else{
//            System.out.println("Please enter a valid temperature");
        input.close();
        }





         }



