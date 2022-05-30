package ClassAlgorithmMonTue;

public class BinaryNumbers {

//    Let's write a function called highOrderBitmask that, when given a word size in bits, will return us the decimal value for the bitmask we'll need to extract the higher order bits out of a word of that same bit size.
//    In our example above, the word size was 8 bits and we wanted to extract the most signficiant half or the left-most 4 bits.
//    All given word sizes will be even
public static void main(String[] args) {

}


    public static int highOrderBitmask(int wordSize) {
        int wordSizeDividedBy2 = wordSize/2;
        String numberOfBits = "1".repeat(wordSizeDividedBy2)+"0".repeat(wordSizeDividedBy2);
        return Integer.parseInt(numberOfBits,2);

    }
}

