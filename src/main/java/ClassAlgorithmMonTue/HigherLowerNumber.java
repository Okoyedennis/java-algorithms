package ClassAlgorithmMonTue;

import java.util.Collection;

public class HigherLowerNumber {
    public static void main(String[] args) {


    }






    public static String HighAndLow(String numbers) {
        // Code here or
//        String[] numberSplited = numbers.split(" "); // split by " "
//        int lowestNumber = Integer.parseInt(numberSplited[0]); //lowest number init;
//        int highestNumber = Integer.parseInt(numberSplited[0]); // highest number init;
//        for(int i=1; i<numberSplited.length; i++){//compare
//            if(lowestNumber>Integer.parseInt(numberSplited[i]))
//                lowestNumber = Integer.parseInt(numberSplited[i]);
//            if(highestNumber<Integer.parseInt(numberSplited[i]))
//                highestNumber = Integer.parseInt(numberSplited[i]);
//        }
//
//        //"hNum lNum";
//        return  String.valueOf(highestNumber)+" "+ String.valueOf(lowestNumber);

        String[] numberSplited = numbers.split(" ");
        int lowestNumber = Integer.parseInt(numberSplited[0]);
        int highestNumber = Integer.parseInt(numberSplited[0]);
        for (int i = 0; i < numberSplited.length; i++) {
            if (lowestNumber > Integer.parseInt(numberSplited[i]));
            lowestNumber = Integer.parseInt(numberSplited[i]);
            if (highestNumber < Integer.parseInt(numberSplited[i]));
            highestNumber = Integer.parseInt(numberSplited[i]);
        }
return String.valueOf(highestNumber) + String.valueOf(lowestNumber);
    }

}
