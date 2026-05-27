package com.practice;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s,
find the length of the longest substring without repeating characters
*/
 class LongestSubstring {
    public static void main(String[] args){
        String s = "abcabcbb";
        int longestSubString = checkLongestSubString(s);
        System.out.println("Output: "+longestSubString);
    }

      static int checkLongestSubString(String s) {
          if (s.length() == 0)
              return 0;
          int left = 0;
          int right = 0;
          int longestSubstring = 0;
          Set<Character> setOfCharacter = new HashSet<Character>();
          while(right<=s.length()-1){
              char currentCharacter = s.charAt(right);
             //If Set contains duplicate than shrink window
              while(setOfCharacter.contains(s.charAt(right))){
                  setOfCharacter.remove(s.charAt(left));
                  left ++;
              }
              //Does not contains duplicate
              setOfCharacter.add(currentCharacter);
              longestSubstring=  Math.max(longestSubstring, right -left +1);
              right++;

          }
          return longestSubstring;
      }
}
