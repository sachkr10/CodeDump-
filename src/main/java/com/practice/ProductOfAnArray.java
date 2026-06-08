package com.practice;

import java.util.Arrays;

public class ProductOfAnArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println("OUTPUT:" + Arrays.toString(output(array)));
    }
    public static int[] output(int[] arr){
        if(arr.length==0)
            return new int[]{};
        int[] output = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            int product =1;
            for(int j=0; j<arr.length; j++){
                if(i==j){
                    continue;
                }
                //multiply logic and adding to new array
                product = arr[j] * product;
            }
            output[i]= product;
        }
        return output;
    }
}
