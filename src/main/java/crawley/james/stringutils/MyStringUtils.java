package crawley.james.stringutils;

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

        return null;
    }

    String reverseCapitalize (String string) {

        return null;
    }

    String reverseAll (String string) {

        return null;
    }

    String whitespaceToNewline (String string) {

        return null;
    }

    String substringArray (String string) {

        return null;
    }
}
