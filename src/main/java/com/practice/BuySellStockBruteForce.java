package com.practice;

public class BuySellStock {
    public static void main(String[] args) {
//        int[] input = {7,1,5,3,6,4};
        int[] input = {7,6,4,3,1};
        int output = findProfit(input);
        System.out.println("OUTPUT: "+output);
    }
    static int findProfit(int[] arr){
        int maximumProfit = 0;
        if(arr.length==0)
            return -1;
        for(int i =0; i< arr.length; i++){
            for(int k =i+1; k<=arr.length-1; k++){
                if(arr[k] - arr[i] > maximumProfit)
                    maximumProfit = arr[k] - arr[i];
            }
        }
        if(maximumProfit <=0)
            return 0;
      return maximumProfit;
    }
}
