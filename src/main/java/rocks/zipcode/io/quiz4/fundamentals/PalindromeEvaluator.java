package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> aList = new ArrayList<>();
        if (isPalindrome(string)) {
            aList.add(string);
        }
       return aList.toArray(new String[aList.size()]);
}

    public static Boolean isPalindrome(String string) {

        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        return sb.reverse().toString();
    }
}

