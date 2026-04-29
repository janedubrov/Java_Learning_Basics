package Arrays;

public class thirteen {
    public static void main(String[] args) {
        String [][] array1 = {
                {"A", "B", "C", "D"},
                {"E", "F", "G", "H"},
                {"J", "K", "L", "M"},
        };

        System.out.print("  ");
        for(int i = 0; i < array1[0].length; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        printArray(array1);
        
    }
    public static void printArray (String [][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(i + " ");
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
    }

}
