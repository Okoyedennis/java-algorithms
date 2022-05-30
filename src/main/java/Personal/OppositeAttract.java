package Personal;

public class OppositeAttract {
    public static void main(String[] args) {
        System.out.println(isLove(2, 5));
    }
    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0) && (flower2 % 2 != 0 ) || (flower1 % 2 != 0) && (flower2 % 2 == 0)) {
            return true;
        } else {
            return false;
        }

    }
}
