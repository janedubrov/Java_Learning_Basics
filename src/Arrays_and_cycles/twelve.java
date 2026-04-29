package Arrays_and_cycles;

public class twelve {
    public static void main(String[] args) {

        String [][] array1 = {
                {"A", "B", "C", "D"},
                {"E", "F", "G", "H"},
                {"J", "K", "L", "M"},
        };

        System.out.print("  "); // dva pustuh probela

        for (int j = 0; j < array1[0].length; j++ ){
            System.out.print(j + " ");
        }
        System.out.println();
        printArray(array1);

    }

    public static void printArray(String [][] array2){

        for(int i = 0; i < array2.length; i++){ // stroki
            System.out.print(i + " ");

            for(int j = 0; j < array2[i].length; j++){  // stolbcu
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();

        }

    }
}
