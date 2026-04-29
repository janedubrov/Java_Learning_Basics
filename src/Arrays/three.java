package Arrays;

import java.util.Arrays;

public class three {
    public static void main(String[] args) {

        fillArrayAsc();
    }

    public static void fillArrayAsc(){

        int [] arr = new int[10];
        for ( int i = 0; i < arr.length; i++){
            arr[i] = 5 + i * 2 ;

        }
        System.out.println(Arrays.toString(arr));

    }
}
