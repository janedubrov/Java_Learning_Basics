package Lesson5;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        // IF statement = performs a block of a code, if it´s condition is TRUE

        Scanner input = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Are you a student? true /false");
        isStudent = input.nextBoolean();
        input.nextLine();

        // Group 3:

        if (isStudent){
            System.out.println("Congrats, you are a student!");
        }
        else{
            System.out.println("Try next year to become a student");
        }

        // Group 1:

        if (name.isEmpty()){
            System.out.println("You didn´t enter your name");

        }
        else{
            System.out.println("Hello, " + name + "!");
        }


        // GROUP 2:

        if (age >= 65) {
            System.out.println("you are an senior");
        }
        else if (age < 0) {
            System.out.println("you haven´t been born yet");
        }
        else if (age == 0) {
            System.out.println("your a baby!");
        }
        else if(age >= 18){
            System.out.println("You are a adult");
        }

        else {
            System.out.println("You are a child");
        }

        input.close();
    }
}


