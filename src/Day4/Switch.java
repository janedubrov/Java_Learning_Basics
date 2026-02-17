package Day4;

public class Switch {
    public static void main(String[] args) {
        // 1- Monday ... 7- Sunday
        int numberDay = 3;

        switch (numberDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Such day doesn't exist");

        }
//        if (numberDay == 1) {
//            System.out.println('Monday');
//        } else if (numberDay == 2) {
//            System.out.println('Tuesday');
        }
    }
