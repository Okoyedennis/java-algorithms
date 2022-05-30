package Personal;

import java.util.Arrays;

public class WhatIsBetween {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(23, 37)));

    }


    public static int[] between(int a, int b) {
        // your code here

        //Method 1
        int length = b - a;
        int[] num = new int[length + 1];
        int count = 0;
        for (int i = a; i <= b ; i++) {
            num[count] = i;
            count++;
        }

        return num;

        //Method 2
//       return  java.util.stream.IntStream.rangeClosed(a, b).toArray();
    }
}

