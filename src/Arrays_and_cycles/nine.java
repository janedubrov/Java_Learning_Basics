package Arrays_and_cycles;

public class nine {
    public static void main(String[] args) {

        int [][] arr = {
                {1, 2, 3, 5, 9},
                {4, 5, 6, 5, 8},
                {7, 8, 9, 5, 7}

        };

        for(int i = 0; i < arr[0].length; i++){ // eto zagolovok tablicu
            System.out.print(i + " ");

        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();


        }

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

