import java.util.Scanner;

public class CalcNew {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;
        String operation;

        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter operation:(+, -, *, /): ");
        operation = input.nextLine();


        System.out.println();

        switch (operation){
            case "+" :
                result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println(result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println(result);
                break;
            case "/":
                if(secondNumber == 0){
                    System.out.println("The second number can not be 0");

                } else {
                    result = firstNumber / secondNumber;
                    System.out.println(result);
            }
                break;

                }

        }

            }


