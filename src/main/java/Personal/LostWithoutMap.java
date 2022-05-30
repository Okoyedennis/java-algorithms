package Personal;

import java.util.Arrays;

public class LostWithoutMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{2, 4, 2, 3, 5, 6, 6})));
    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
