package Arrays_and_cycles;

public class Nineteen {
    public static void main(String[] args) {

        int[][] array = {
                {5, 16, 66},
                {2, 9, 20},
                {17, 20, 4}

        };

        double sum = average(array);
        int max = findMax(array);
        int min = findMin(array);
        System.out.println("The average is:" + sum);
        System.out.println("The biggest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }

    public static double average (int[][]numbers){
        double sum = 0;
        double count= 0;

       for(int i = 0; i < numbers.length; i++){
           for(int j = 0; j < numbers[i].length; j++){
               sum = sum + numbers[i][j];
               count++;

           }
       }

        return sum / count;
    }

    public static int findMax(int [][]numbers){
        int max = numbers[0][0];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(numbers[i][j] > max){
                    max = numbers[i][j];
                }
            }
            }
        return max;
    }

    public static int findMin(int [][] numbers){
        int min = numbers[0][0];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(numbers[i][j] < min){
                    min = numbers[i][j];
                }
            }
            }
        return min;

    }
}
