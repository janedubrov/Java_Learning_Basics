package Arrays_and_cycles;

import java.util.Arrays;

public class four {
    public static void main(String[] args) {

        String [] message = {"Kiwi" , "Mango"};
        String [] message2 = {"Banana" , "Pineapple"};
        String [] result = new String [message.length * 2];

        for (int i = 0; i < message.length; i++){
            result[i] = message[i];


            }
        for(int i = 0; i < message2.length; i++){
            result[i + message.length] = message2[i];

        }
        System.out.println(Arrays.toString(result));




    }

}


