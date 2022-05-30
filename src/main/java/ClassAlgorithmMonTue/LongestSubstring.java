package ClassAlgorithmMonTue;
import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
//        System.out.println(longestSubstringWithoutDuplication("abcdeabcdefc"));
        System.out.println(100 + 100 + "Decagon");

    }

//    Write a function that takes in a string and returns its longest substring without duplicate characters.
//
//    You can assume that there will only be one longest substring without duplication.

    public static String longestSubstringWithoutDuplication(String str) {
        // Write your code here
        int index;
        int lengthOfStr = str.length();
        int indexOfSubstring = 0;
        int currentLengthOfSubstring = 0;
        int maxlengthOfSubStringWithoutRepeating = 0;
        int startPointOfMaxLengthOfSubstring = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        map.put(str.charAt(0), 0);
        for (index = 0; index < lengthOfStr; index++) {
            if (!map.containsKey(str.charAt(index))){
                map.put(str.charAt(index), index);
            } else {
                if (map.get(str.charAt(index)) >= indexOfSubstring){
                    currentLengthOfSubstring = index - indexOfSubstring;
                    if (maxlengthOfSubStringWithoutRepeating < currentLengthOfSubstring){
                        maxlengthOfSubStringWithoutRepeating = currentLengthOfSubstring;
                        startPointOfMaxLengthOfSubstring = indexOfSubstring;
                    }
                    indexOfSubstring = map.get(str.charAt(index)) + 1;
                }

                map.replace(str.charAt(index), index);
            }

        }
        if(maxlengthOfSubStringWithoutRepeating < index - indexOfSubstring){
            maxlengthOfSubStringWithoutRepeating = index - indexOfSubstring;
            startPointOfMaxLengthOfSubstring = indexOfSubstring;
        }

            return str.substring(startPointOfMaxLengthOfSubstring, startPointOfMaxLengthOfSubstring + maxlengthOfSubStringWithoutRepeating);
    }









}
