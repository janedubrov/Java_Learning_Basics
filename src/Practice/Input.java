package Practice;

import java.util.Scanner; // 1. Need to import Scanner:

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);    // 2. Create an Object Scanner

        System.out.print("Enter your name: ");      // 4. Create a request for user
        String name = input.nextLine();               // 5. Create a variable name and assign the users input

        System.out.println("Hellew, " + name);

        input.close();         // 3. Close an Object (input)
    }
}
