package Personal;

public class JustCountSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(5));
    }
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += (i + 1) + " sheep...";
        }
        return result;
    }
}
