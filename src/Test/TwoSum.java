/*
package Test;
import java.util.HashMap;

public class TwoSum {


    public  int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums1 = {2, 4,6,8};
        int target1 = 10;
        int[] indices1 = solution.twoSum(nums1, target1);
        System.out.println("Example 1 Output: [" + indices1[0] + ", " + indices1[1] + "]");
    }
}*/

package Test;

import java.util.HashMap;

public class TwoSum{
    public int[] twosum(int[] nums,int target){



        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int complement=target- nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};

            }
            map.put(nums[i],i);

        }
        return new int[0];

    }

    public static void main(String[] args) {
        TwoSum solution=new TwoSum();
        int[] nums1={2,4,5,7};
        int target1=9;
int[] indicase1=solution.twosum(nums1,target1);
       System.out.println(indicase1[0]+","+indicase1[1]);

    }

}