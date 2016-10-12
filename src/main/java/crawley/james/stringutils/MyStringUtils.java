package crawley.james.stringutils;

import java.util.regex.*;

/**
 * Created by jamescrawley on 10/11/16.
 */
public class MyStringUtils {

    String combine (char[] chars) {

        StringBuilder result = new StringBuilder();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            result.append(chars[i] + ",");
        }

        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    String combine (String[] strings) {

        StringBuilder result = new StringBuilder();
        int length = strings.length;

        for (int i = 0; i < length; i++) {
            result.append(strings[i] + ",");
        }

        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    String[] breakByLine (String string) {

        return string.split("[\n\f\r]");
    }

    String reverseCapitalize (String string) {
        
        Pattern p = Pattern.compile("[\\w]+?(\\s+|$)");
        Matcher m = p.matcher(string);
        StringBuilder result = new StringBuilder();

        while (m.find()) {
            result.append(m.group().substring(0, 1).toLowerCase());
            result.append(m.group().substring(1).toUpperCase());

        }

        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    String reverseAll (String string) {

        string.replaceAll("[,!?.]", "");
        String[] arr = string.split("[\\s]+");
        int length = arr.length;
        StringBuilder result = new StringBuilder();
        StringBuilder entry = new StringBuilder();

        for (int i = 0; i < length; i++) {
            entry.append(arr[i]);
            result.append(entry.reverse());
            result.append(" ");
            entry.delete(0, entry.length());
        }

        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    String whitespaceToNewline (String string) {

        return string.replaceAll("[\\s]+", "\n");
    }

    String substringArray (String string) {

        return null;
    }
}
