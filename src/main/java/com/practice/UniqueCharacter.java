package com.practice;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "cat";
        System.out.println("OUTPUT s1: "+checkUnique(s1));
        System.out.println("OUTPUT s1: "+checkUnique(s2));
    }
     static boolean checkUnique(String s){
        return s.chars().distinct().count() == s.length();
    }
}
