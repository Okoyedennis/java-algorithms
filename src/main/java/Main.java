import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        minMax(new int[]{1, 2, 3, 4, 5});

        String word = "Dennis";

        word.split(" ");
        System.out.println();
//        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
//        System.out.println(removeBang("you and my boss i like me you"));

//        System.out.println(word("hello world"));

// capitalize first letter
        System.out.println();


    }

    public static String word(String str){

        String output = str.substring(0, 1).toUpperCase() + str.substring(1);
return output;
    }

//    public static String toJadenCase(String phrase) {
//        // TODO put your code below this comment
//        String result = "";
//        String[] word = phrase.split(" ");
//        String firstLetter = "";
//        String lastLetter = "";
//
////        System.out.println("word " + word);
//
//        for (String capitalizedWord : word){
//            firstLetter = capitalizedWord.substring(0,1);
//            lastLetter = capitalizedWord.substring(1);
//        }
//        result += firstLetter.toUpperCase() + lastLetter + " ";
//
//        return result.trim();
//    }

    public static int[] minMax(int[] arr) {
//         Your awesome code here
//        int min = (Integer) Collections.min(arr);
//        System.out.println(min);
//        String temp = Integer.toString(min);
//        int[] numbs = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++) {
//            numbs[i] = temp.charAt(i) - '0';
//        }

        List<Integer> list2 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        Integer max = Collections.max(list2);
        System.out.println(max);
//        String temp2 = Integer.toString(max);
//        int[] numbs2 = new int[temp2.length()];
//        for (int i = 0; i < temp2.length(); i++) {
//            numbs2[i] = temp2.charAt(i) - '0';
//        }
//        System.out.println(max);

//        return new int[] {min, max};
        return new int[] {};

//        Arrays.sort(arr);
//        return new int[] {arr[0], arr.length -1};
    }

//    public static int packArray(ArrayList<Integer> integers) {
//        ArrayList<Integer> sumArray = new ArrayList<>();
//        ArrayList<Integer> sumArray2 = new ArrayList<>();
//        int sum = 0;
//        for (int i = 0; i < integers.size(); i += 2) {
//            sumArray.add(integers.get(i) + integers.get(i + 1));
//        }
//        for (int i = 0; i < sumArray.size() - 1; i+=2) {
//            sum += sumArray.get(i) * sumArray.get(i + 1);
//        }
//        return sum;
//    }
//
//    public boolean isPalindrome(String s) {
//        StringBuilder str = new StringBuilder(s);
//        StringBuilder reverseString = str.reverse();
//        return s.equals(str.toString().toLowerCase());
//    }
//    public static String createPhoneNumber(int[] numbers) {
//        // Your code here!
//        String arr = Arrays.toString(numbers);
//        System.out.println(arr);
//
//        return "(" + arr.substring(0, 3) + ") " + arr.substring(3, 6) + "-" + arr.substring(6, arr.length());
//    }


//}

//    public static String numberToOrdinal(Integer number) {
//        String result = "";
//        if (number == 1) {
//            result = number + "st";
//        } else if (number == 2) {
//            result = number + "nd";
//        }
//        return result;
//    }

//    public static int lengthOfLastWord(String s) {
//      String[] word =  s.trim().split(" ");
//        return word[word.length - 1].length();
//    }

//    public static int singleNumber(int[] nums) {
//        int[] numberArray= {};
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums.equals(i) ){
//                count++;
//                }
//                if (nums.equals(1)){
//                    break;
//                } else {
//                    continue;
//                }
//            }
//        }
//        return count;
//    }

//    public static int sum(int[] arr){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0){
//               count += arr[i];
//            }
//        }
//
//        return count;
//    }

   // public static int opposite(int number) {
        // your code here
//        String word = String.valueOf(new StringBuffer());
//        if (number > 0){
//
//        }


    //}

//    public static String highAndLow(String numbers) {
//        // Code here or
//        String[] word = numbers.split(" ");
//        int num1 = 0;
//        int num2 = 0;
//        int max = 0;
//
//        for (int i = 0; i < word.length -1; i++) {
//           num1 =  Math.max(Integer.parseInt(word[i]), Integer.parseInt(word[i + 1]));
//           max = Math.max(max, num1);
//
//            num2 =  Math.min(Integer.parseInt(word[i]), Integer.parseInt(word[i + 1]));
//            int min = num2;
//
//        }
//        return min +" "+ max;
//    }

//    public static String removeBang(String str) {
//        // your code here
//        String word = "";
//        for (int i = 0; i <= str.length() ; i++) {
//            word = str.replaceAll("you", "your client");
//        }
//        return word;
//    }

//    public static String[] wave(String str) {
//        // Your code here
//        String word = "";
//        for (int i = 0; i < str.length(); i++) {
//            char character1 = str.charAt(i);
//            char character2 = Character.toUpperCase(character1);
//            if (i == 0){
//               word = character2 + str.substring(i + 1);
//            }else{
////                word = str.substring(0,i) + character2 + str.substring(i + 1);
//            }
//        }
//        return new word[];
//    }




//    public static String noSpace(final String x) {
//        String word = "";
//        for (int i = 0; i < x.length(); i++) {
//            word = x.replaceAll(" ", "");
//        }
//        return word;
//    }

//    public int countSheeps(Boolean[] arrayOfSheeps) {
//        // TODO May the force be with you
//        int trueCount = 0;
//        int falseCount = 0;
//      if (arrayOfSheeps.equals(true) ){
//          return trueCount++;
//      }else{
//          return falseCount++;
//      }
//    }

//    public boolean isValid(String s) {
//        Map<Character,Character> map = new HashMap<>();
//        map.put(')','(');
//        map.put(']','[');
//        map.put('}','{');
//
//        Stack<Character> stack = new Stack<>();
//        for(char ch: s.toCharArray()){
//            if(ch == '(' || ch == '[' || ch == '{'){
//                stack.push(ch);
//            }else{
//                char pair = map.get(ch);
//                if (stack.isEmpty() || stack.peek()!= pair){
//                    return false;
//                } else {
//                    stack.pop();
//                }
//            }
//        }
//        return stack.isEmpty();
//
//    }

//        public static int breakChocolate(int n, int m) {
//            if((n>1 && m>1) || (n>1 && m==1) || (n==1 && m>1))
//                return m*n-1;
//            else
//                return 0;
//        }

//
//        public static int breakChocolate(int n, int m) {
//            if (n <= 0 || m <= 0) {
//                return 0;
//            } else {
//                return n * m - 1;}
//        }

//    public static int makeNegative(final int x) {
//
//        String tempNumber = Integer.toString(x);
//        int number = 0;
//
//        for(int i = 0; i < tempNumber.length(); i++){
//            if(tempNumber[i] > 0){
//                number *= -x;
//            }
//        }
//
//        return number; // Your code here.
//
//    }
}


//    Finish the function numberToOrdinal, which should take a number and return it as a string with the correct ordinal indicator suffix (in English). For example, 1 turns into "1st".
//
//        For the purposes of this challenge, you may assume that the function will always be passed a non-negative integer. If the function is given 0 as an argument, it should return the string "0" without a suffix.
//
//        To help you get started, here is an excerpt from Wikipedia's page on Ordinal Indicators:
//
//        st is used with numbers ending in 1 (e.g. 1st, pronounced first)
//        nd is used with numbers ending in 2 (e.g. 92nd, pronounced ninety-second)
//        rd is used with numbers ending in 3 (e.g. 33rd, pronounced thirty-third)
//        As an exception to the above rules, all the "teen" numbers ending with 11, 12 or 13 use -th (e.g. 11th, pronounced eleventh, 112th, pronounced one hundred [and] twelfth)
//        th is used for all other numbers (e.g. 9th, pronounced ninth).
