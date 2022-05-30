package Personal;

public class StringRepeat {

    public static void main(String[] args) {
        System.out.println(repeatStr(6, "Dennis"));
    }
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            builder.append(string);
        }
        return builder.toString();
    }
}
