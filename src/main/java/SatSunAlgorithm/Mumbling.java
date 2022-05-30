package SatSunAlgorithm;

import java.util.Locale;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        // your code
        String lowercase = s.toLowerCase();
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
           char singleWord = lowercase.toUpperCase().charAt(i);
           word.append(singleWord).append(Character.toString(lowercase.charAt(i)).repeat(i)).append("-");
        }
        return word.toString().substring(0,word.length()-1);
    }
}
