package WhiteBoarding;

public class IsAPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number){
        String str = Integer.toString(number);
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)){
            return true;
        }else{
            return false;
        }

    }
}
