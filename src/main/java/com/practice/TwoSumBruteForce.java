package com.practice;

/*Given an array of integers nums and an integer target,
return the indices of the two numbers such that they add up to target.*/

import java.util.Arrays;

/*nums = [2,7,11,15], target = 9,
        [0,1],
nums[0] + nums[1] = 2 + 7 = 9*/
public class TwoSumBruteForce {
    public static void main(String[] args) {
       int[] input = {2,7,11,15};
       int target = 177;
       System.out.println("OUTPUT: "+ Arrays.toString(result(input, target)));
    }
    static int[] result(int[] arr, int target){
        int[] output =  new int[2];
        if (arr.length == 0)
            return new int[]{0,0};
        for(int i =0; i<arr.length; i++){
            for(int k =i+1; k<arr.length; k++){
                if(arr[i]+arr[k]==target)
                    return new int[]{i,k};
            }
        }
        return new int[]{0,0};
    }
}
