package Personal;

import java.util.Arrays;

public class convertStringToArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Love you")));
    }
    public static String[] stringToArray(String s) {
        //your code;
        String[] word = s.split(" ");
        return word;
    }
}
