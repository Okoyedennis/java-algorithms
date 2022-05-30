package Personal;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("Peter Dennis"));
    }

    public static String reverseString(String reverseWord){

        StringBuilder builder = new StringBuilder();
            builder.append(reverseWord);
            builder.reverse();
        return builder.toString();
    }
}
