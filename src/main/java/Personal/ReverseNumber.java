package Personal;

public class ReverseNumber {
    public static int reverse(int x) {
        StringBuilder word = new StringBuilder(Math.abs(x)).reverse();
        if (x<0) word = new StringBuilder(Math.abs(x) + "-").reverse();
        if (Long.parseLong(word.toString())> Integer.MAX_VALUE || Long.parseLong(word.toString()) < Integer.MIN_VALUE) return 0;
        return Integer.parseInt(String.valueOf(word));

    }

    public static void main(String[] args) {
        System.out.println(reverse(-1234543));
        reverse(-1234586999);
        System.out.println(reverse(-1234586999));
    }
}
