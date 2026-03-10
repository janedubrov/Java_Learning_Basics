package Arrays;

import java.util.Arrays;

public class nine {
    public static void main(String[] args) {

        int [][] arr = {
                {1, 2, 3, 5, 9},
                {4, 5, 6, 5, 8},
                {7, 8, 9, 5, 7}

        };

        System.out.println(new2DArray(arr));

            }

        public static int new2DArray(int [][] array){
            int sum = 0;
            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array[i].length; j++){
                    sum += array [i][j];
                }
            }
            return sum;
        }
    }

