package Personal;

public class WellOfIdeas {
//    For every good kata idea there seem to be quite a few bad ones!
//
//    In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.
    public static void main(String[] args) {
        System.out.println(well(new String[]{"bad", "bad", "bad"}));
        System.out.println(well(new String[]{"good", "bad", "bad", "bad", "bad"}));
    }

    public static String well(String[] x) {
        // TODO
        
        int num = 0;
        String words = "";
        for (String s : x) {
            int word = s.equals("good") ? num++ : num;
            if (num >= 1 && num <= 2) {
                words = "Publish!";
            } else if (num > 2) {
                words = "I smell a series!";
            } else {
                words = "Fail!";
            }

        }
        return words;
    }
}
