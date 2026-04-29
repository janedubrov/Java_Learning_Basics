package Practice;

public class Scope {

    public static void main(String[] args) {
     String item1 = "Laptop";
     String address1 = "Berlin";
     String item2 = "Camera";
     String address2 = "Munchen";
     sendPackage(item1, address1);
     sendPackage(item1, address2);

        }
        static void sendPackage(String cargo, String destination) {
            System.out.println("Sending "+ cargo + " to "+ destination);
        }

    }
