package Arrays_and_cycles;

import java.util.Arrays;

public class seven {
    public static void main(String[] args) {

        int [] nums = {1, 4, 3, 6, 8, 2, 5, 10};

        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count = count  + 1;

            }
        }
        System.out.println("Count is :"  + count);

        int [] chetnNums = new int [count];

        int k = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                chetnNums[k] = nums[i];

                k++;

            }


        }
        System.out.println(Arrays.toString(chetnNums));




    }
}
