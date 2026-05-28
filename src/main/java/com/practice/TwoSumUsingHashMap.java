package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {
    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int target = 18;
        System.out.println("OUTPUT: "+ Arrays.toString(resultant(input, target)));
    }
    static int[] resultant(int[] arr, int target){
        if (arr.length == 0)
             return new int[]{0,0};
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i =0; i < arr.length ; i++){
            int needed = target - arr[i];
            if(hashMap.containsKey(needed))
                return new int[]{i, hashMap.get(needed)};
            hashMap.put(arr[i],i);
        }
        return new int[]{0,0};
    }
}
