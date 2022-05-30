package Personal;

public class PrintError {
    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
        System.out.println(printerError("aaabbbbhaijjjm"));
    }

    public static String printerError(String s) {
        // your code
        int num = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'n') {
//                builder.append("n");
                num++;
            } else if (s.charAt(i) == 'o') {
//                builder.append("0");
                num++;
            } else if (s.charAt(i) == 'p') {
//                builder.append("p");
                num++;
            } else if (s.charAt(i) == 'q') {
//                builder.append("q");
                num++;
            } else if (s.charAt(i) == 'r') {
//                builder.append("r");
                num++;
            } else if (s.charAt(i) == 's') {
//                builder.append("s");
                num++;
            } else if (s.charAt(i) == 't') {
//                builder.append("t");
                num++;
            } else if (s.charAt(i) == 'u') {
//                builder.append("u");
                num++;
            } else if (s.charAt(i) == 'v') {
//                builder.append("v");
                num++;
            } else if (s.charAt(i) == 'w') {
//                builder.append("w");
                num++;

            } else if (s.charAt(i) == 'x') {
//                builder.append("x");
                num++;

            } else if (s.charAt(i) == 'y') {
//                builder.append("y");
                num++;

            } else if (s.charAt(i) == 'z') {
//                builder.append("z");
                num++;

            }
        }
        return num + "/" + s.length();
    }
}
