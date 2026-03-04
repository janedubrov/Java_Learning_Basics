package Lesson5;

public class Loops {
    public static void main(String[] args) {

        int time = 5;
        int floor;
        int totalTime = 0;

        for(floor = 1 ; floor <= 10; floor++){
            totalTime = totalTime +time;
            if(floor >= 7){
                System.out.println("Floor " + floor + ":" + " Almost there. Time : " + totalTime + " sec");

            }
            else{
                System.out.println("Floor " + floor + ":" + " Moving... Time " + totalTime + " sec");
            }
        }
    }
}