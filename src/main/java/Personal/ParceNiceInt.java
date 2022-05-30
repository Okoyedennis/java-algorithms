package Personal;

public class ParceNiceInt {
    public static void main(String[] args) {
        System.out.println(howOld("2 years old"));
    }
    public static int howOld(final String herOld) {
      return Character.getNumericValue(herOld.charAt(0));
    }
}
