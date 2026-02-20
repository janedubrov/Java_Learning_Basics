import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hey " + name);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("You are " + age+ " years old");

        System.out.print("What is your temperature? ");
        double temp = input.nextDouble();
        System.out.println("oh, " + temp + " . You are warm enough :))");

        System.out.print("Are yoou a student? (true / false): ");
        boolean isStudent = input.nextBoolean();

        if(isStudent){
            System.out.println("You are enrolled as a student! ");
        }
        else{
            System.out.println("You are NOT enrolled as a student");
        }

        input.close();

    }
}
