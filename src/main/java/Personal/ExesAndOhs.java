package Personal;

import java.util.Locale;
import java.util.Objects;

public class ExesAndOhs {
    public static void main(String[] args) {
// Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
        System.out.println(getXO("xxoo"));
        System.out.println(getXO("xoo"));
        System.out.println(getXO("zzpppjj"));

    }
    public static boolean getXO (String str) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x'){
                countX++;
            }else if (str.toLowerCase().charAt(i) == 'o'){
                countO++;
            }
        }
        if (countX == countO){
            return true;
        } else if((countX == 0) && (countO > 0) || (countX > 0) && (countO == 0)){
            return false;
        }
        return false;
    }
}
