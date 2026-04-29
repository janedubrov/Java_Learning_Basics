package Arrays_and_cycles;
import java.util.Arrays;
public class eight {
    public static void main(String[] args) {

        int [] nums = {120, 0, 450, 0, 0, 890, 15 };
        int zeroCount = 0;
        int newLength = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                zeroCount++;
                newLength = nums.length - zeroCount;

            }
        }
//        System.out.println(zeroCount);
//        System.out.println(newLength);

        int [] result = new int [newLength];
        int j = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                result[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
