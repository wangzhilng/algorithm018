import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int [] ints=new int [2];
        for (int i=0;i<nums.length;i++){
           ints[0]=i;
         int  newtarget=target-nums[i];
            for (int j=i+1;j<nums.length;j++){
                if (newtarget==nums[j]){
                    ints[1]=j;
                    return ints;
                }
            }
        }
        return ints;
    }


}
