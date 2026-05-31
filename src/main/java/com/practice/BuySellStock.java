package com.practice;

public class BuySellStock {
    public static void main(String[] args) {
    //    int[] input = {7,1,5,3,6,4};
       int[] input = {7,6,4,3,1};
        int output = findActualProfit(input);
        System.out.println("OUTPUT: "+output);
    }
    static int findActualProfit(int[] arr){
        int fix = arr[0];
        int max = 0;
        int i =0;
        for (i =i+1; i< arr.length; i++){
            if(arr[i]< fix)
                fix = arr[i];
           if(arr[i]-fix>max)
               max = arr[i]-fix;
        }
          return max;
        }
    }

