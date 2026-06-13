package com.practice;

import java.util.stream.Collectors;

public class SortedCharacters {
    public static void main(String[] args) {
        String str = "debca";
        String sorted =str.chars().sorted().mapToObj(c ->String.valueOf((char) c)).
                collect(Collectors.joining());
        System.out.println("OUTPUT: "+sorted);
    }
}
