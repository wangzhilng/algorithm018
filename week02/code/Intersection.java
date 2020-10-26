import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>     list   =new ArrayList<Integer>();;

        List<Integer> list1 = Arrays.stream(nums1).boxed().collect( Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        for (Integer integer:list1){
                if (list2.contains( integer )&&!list.contains( integer )){
                    list.add(integer);
                }
        }

     return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
