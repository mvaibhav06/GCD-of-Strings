import java.math.BigInteger;
import java.util.Arrays;

public class GcdOfString {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }


    public static String findGcd(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcd = gcd(str1.length(), str2.length());

        return str1.substring(0,gcd);
    }

    public static void main(String[] args) {
        findGcd("ABABAB", "ABAB");
    }
}
