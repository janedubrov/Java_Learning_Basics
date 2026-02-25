import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent = true;

        System.out.print("What is your name? ");
        name = input.nextLine();

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.print("Are you a student? true or false only : ");
        isStudent = input.nextBoolean();

        //Group 1:
        if(name.isEmpty()){
            System.out.println("You didn´t enter your name yet...");
        }
        else{
            System.out.println("Hello, " + name);
        }

        // Group 2:
    if( age >= 65){
        System.out.println("You are a senior!");
    }
    else if(age >= 18){
        System.out.println("You are an adult!");
    }
    else if(age < 0){
        System.out.println("You haven´t been born yet...");
    }
    else if (age==0){
        System.out.println("You are a baby!");
    }
    else{
        System.out.println("You are a child!");
    }

    // Group 3:
    if(isStudent){
        System.out.println("Cool, you are a student!");
            }
    else{
        System.out.println("Maybe you will enroll later.");
    }

    input.close();
    }
}
