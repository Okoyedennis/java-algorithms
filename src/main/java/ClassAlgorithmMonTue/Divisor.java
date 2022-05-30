package ClassAlgorithmMonTue;

import java.util.ArrayList;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(divisors(7));
    }


    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                arrayList1.add(i);
            }
        }
        return arrayList1;
    }

}

//    Create a function named divisors that takes a non-negative integer and returns an array with all of the integer's divisors (except for 1 and the number itself). If the number is prime return an empty array.
