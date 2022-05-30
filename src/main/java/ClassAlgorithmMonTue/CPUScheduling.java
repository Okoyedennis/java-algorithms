package ClassAlgorithmMonTue;

import java.util.ArrayList;
import java.util.Collections;

public class CPUScheduling {
    public static void main(String[] args) {
//        System.out.println(sjf(1,2, 3, 4, 4));
    }

    public static int sjf(ArrayList<Integer> jobs, int index) {
        int minimum = 0;

        for (int i = 0; i < jobs.size(); i++) {
            if ( jobs.get(index) > jobs.get(i) || jobs.get(i) == jobs.get(index) && index >= i){
                minimum += jobs.get(i);
            }
        }
        return minimum;
    }
}
