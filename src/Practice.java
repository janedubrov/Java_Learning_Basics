import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {

        //  substring() is a method used to extract a portion of a string
        //           .substring(start, end)

        Scanner input = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Please enter your email: ");

        email = input.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Your email must contain @");
        }
        input.close();
         }
        }


