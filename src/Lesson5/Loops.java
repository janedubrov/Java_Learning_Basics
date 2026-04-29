package Lesson5;

public class Loops {
    public static void main(String[] args) {

   int food = 80;
   int eatFood = 15;
   int day;

   for(day = 1 ; day <= 5; day++){
       food = food - eatFood;
       if(food < 30){
           System.out.println("Low food " + food + " kg left");
       }
       else{
           System.out.println("Day " + day + ": " + food + " kg left");
       }
   }

    }
}