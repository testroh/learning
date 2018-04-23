import java.util.HashMap;

/**
 * Created by Rohith on 12/7/2017.
 */
public class twosum {

    public static void main(String[] args) {
        int nums [] = {2,7,11,15};
        int target = 9;
        int res [] ;
        res = twooSum(nums,target);
        System.out.println(res);
    }

    public static int[] twooSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
