package Lesson5;

public class Methods {
    public static void main(String[] args) {
    int hours = 8;
    int rateInEuro = 10;
    int salary = calculateSalary(hours, rateInEuro);
        System.out.println("Your daily salary is " + salary + " dollars") ;
}
static int calculateSalary(int hours, int rate){
        return hours * rate;
}
}
