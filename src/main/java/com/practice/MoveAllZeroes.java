package com.practice;

import java.util.Arrays;

/*Move Zeroes
Move all 0s to the end of array while maintaining order.*//*
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]*/
public class MoveAllZeroes {

    public static void main(String[] args) {
        int[] input= {0,1,0,3,12};
        int[] output = result(input);
        System.out.println("OUTPUT: "+Arrays.toString(output));
    }
    public static int[] result(int[] arr){
        int j =0;
      for(int i =0; i<arr.length; i++){
          if(arr[i] !=0){
              int k = arr[i];
              arr[i] = arr[j];
              arr[j] = k;
              j++;
          }
      }
      return arr;
    }
}
