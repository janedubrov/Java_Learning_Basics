package Arrays_and_cycles;

public class eleven {
    public static void main(String[] args) {

        String [][] array1 = {
                {"A", "B", "C", "D"},
                {"E", "F", "G", "H"},
                {"J", "K", "L", "M"},
        };
        System.out.print("  ");  // = dva pustuh probela v 1 stroke

        for(int j = 0; j < array1[0].length; j++){ // numeraciya stolbcov
            System.out.print(j + " ");
        }
        System.out.println();

        printArray(array1);

    }

    public static void printArray(String [][] arr){

        for(int i = 0; i < arr.length; i++){ // numeraciya strok
            System.out.print(i + " ");

            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }

    }
}
