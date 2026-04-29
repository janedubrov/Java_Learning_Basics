package Arrays_and_cycles;

public class ten {
    public static void main(String[] args) {
        String [][] array = {
                {"a", "b", "c"},
                {"a", "b", "c"},
                {"a", "b", "c"}
        };

        // numeraciya stolbcov (j):

        System.out.print("  ");
        for(int j = 0; j <= array[0].length; j++){
            System.out.print(j + " ");
        }
        System.out.println();

        printArr(array); // vuzuvaem Metod!

        }

    public static void printArr (String [][] arr) {

        //numeraciya strok:

        for(int i = 0; i < arr.length; i++){
            System.out.print(i + " ");

            for(int j = 0; j <arr[i]. length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


    }

    }
}


