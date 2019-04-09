package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> resultList = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                resultList.add(string.substring(i, j));
            }
        }
        return resultList.toArray(new String[resultList.size()]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        Set<String> blah = new HashSet<>();
        Set<String> blah2 = new HashSet<>();
        Set<String> commons = new HashSet<>();
       ;

        for (String s : blah) {
            return null;

        }

        return null;

    }


    public static String getLargestCommonSubstring(String string1, String string2) {

        return null;
    }
}

