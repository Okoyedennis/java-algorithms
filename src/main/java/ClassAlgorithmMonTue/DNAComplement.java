package ClassAlgorithmMonTue;

public class DNAComplement {
    public static void main(String[] args) {
        System.out.println(dnaComplement("A"));
    }

    public static String dnaComplement(String dna) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (dna.charAt(i) == 'T') {
                stringBuilder.append('A');
            }
            if (dna.charAt(i) == 'A') {
                stringBuilder.append('T');
            }
            if (dna.charAt(i) == 'C') {
                stringBuilder.append('G');
            }
            if (dna.charAt(i) == 'G') {
                stringBuilder.append('C');
            }
        }
        return stringBuilder.toString();

    }
}
