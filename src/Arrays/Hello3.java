package Arrays;
public class Hello3 {
    public static void main(String[] args) {
        int sales[][] = {
                {15, 20, 10, 4, 9},
                {25, 5, 99, 54, 10},
                {17, 55, 20, 38, 24}
        };

        int max = findMax(sales);
        int min = findMin(sales);

        System.out.println("The biggest sales is: " + max);

        System.out.println("The smalles sales is: " + min);
    }

    public static int findMax(int[][] numbers) {
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];

                }

            }

        }
        return max;


    }

    public static int findMin(int[][] numbers) {
        int min = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < min) {
                    min = numbers[i][j];

                }

            }

        }
        return min;

    }
}

