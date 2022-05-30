package Personal;

public class ReplaceWord {
    public static void main(String[] args) {
        System.out.println(wordReplace(" Mr John i eating banana "));
    }

    public static String wordReplace(String word){
        return word.trim().replace(" ", "20%");
    }
}
