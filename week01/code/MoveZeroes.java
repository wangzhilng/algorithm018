public class MoveZeroes {
    public void moveZeroes(int[] nums) {


        int number=0;
        for (int index=0;index<nums.length;index++){
            if (nums[index]==0){
                number++;
            }else {
                nums[index-number]=nums[index];
                if (number!=0)
                    nums[index]=0;
            }
        }

    }
}
