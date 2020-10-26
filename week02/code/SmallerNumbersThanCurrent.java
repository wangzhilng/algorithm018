import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
     int[] targer=   Arrays.copyOf( nums,nums.length );
        Arrays.sort( nums );
        int [] total= new int[nums.length];
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i=0;i<nums.length;i++){
           if (!map.containsKey( nums[i] )){
               map.put( nums[i],i );
           }else {
               continue;
           }

        }
        System.out.println( map.toString() );
        for (int i=0;i<targer.length;i++){

            total[i]=map.get( targer[i] );

        }
        return total;
    }

}
