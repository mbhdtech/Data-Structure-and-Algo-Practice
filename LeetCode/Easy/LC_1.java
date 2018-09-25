//Two Sum
//Find 2 numbers that add up to the sum of the target

import java.util.*;
public class LC_1{
    public static void main(String[] args){
        //LeetCode #1 - Two Sum
        int[] nums = {2, 9, 11, 7};
        int target = 9;
        int[] arr = twoSum(nums, target);

        for(int n : arr){
            System.out.println(n);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        int[] arr = {0,0};
        for(int i = 0; i < nums.length; i++){
            if(complementMap.containsKey(target - nums[i])){
                arr[0] = i;
                arr[1] = complementMap.get(target - nums[i]); 
                return arr;
            }
            else{
                complementMap.put(nums[i], i);
            }
        }
        return arr;
    }
}