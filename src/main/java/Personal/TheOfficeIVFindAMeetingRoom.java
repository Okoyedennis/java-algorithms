package Personal;

import java.util.Arrays;

public class TheOfficeIVFindAMeetingRoom {
    public static void main(String[] args) {
//        Your job at E-Corp is both boring and difficult. It isn't made any easier by the fact that everyone constantly wants to have a meeting with you, and that the meeting rooms are always taken!
//        In this kata, you will be given an array. Each value represents a meeting room. Your job? Find the first empty one and return its index (N.B. There may be more than one empty room in some test cases).
    }
    public static Object meeting(char[] x) {

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'O')
                return i;
        }
        return "None available!";
    }
}
