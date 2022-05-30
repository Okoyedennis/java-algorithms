package Personal;

import java.util.HashSet;

public class ShifterWord {

    public static void main(String[] args) {
        System.out.println(count("SOS IN THE HOME"));
    }
    public static int count(String st){
        HashSet<String> set = new HashSet();
//        "H", "I", "N", "O", "S", "X", "Z", "M" and "W".
        int num = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.equals("H") || st.equals("I") || st.equals("O") || st.equals("S") || st.equals("X") || st.equals("Z")
                    || st.equals("M") || st.equals("W")
            ) {
                set.add(st);
                num++;
            }
        }
        return num;
    }
}
