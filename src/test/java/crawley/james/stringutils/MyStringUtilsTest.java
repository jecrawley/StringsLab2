package crawley.james.stringutils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jamescrawley on 10/11/16.
 */
public class MyStringUtilsTest {

    MyStringUtils utils = new MyStringUtils();

    @Test
    public void combineCharsTest () {

        String actual = utils.combine(new char[] {'A', 'B', 'Z'});

        assertEquals("The string should be \"A,B,Z\".", "A,B,Z", actual);
    }

    @Test
    public void combineStringTest () {

        String[] ehbeezee = {"eh", "bee", "zee"};
        String actual = utils.combine(ehbeezee);

        assertEquals("The string should be \"eh,bee,zee\".", "eh,bee,zee", actual);

    }

    @Test
    public void breakByLineTest () {

        String[] actual = utils.breakByLine("This\nis\na\nstring");

        assertArrayEquals("The string array should be \"[This, is, a, string].",new String[] {"This", "is", "a", "string"} , actual);

    }

    @Test
    public void reverseCapitalizeTest () {

        assertEquals("The string should be \"tHIS iS a sTRING\"", "tHIS iS a   sTRING",utils.reverseCapitalize("This is a   string"));

    }

    @Test
    public void reverseAllTest () {

        assertEquals("The string should be \"sihT si a gnirts\"", "sihT si a gnirts", utils.reverseAll("This is a string"));

    }

    @Test
    public void whitespaceToNewlineTest () {

        assertEquals("The string should be \"This\nis\na\nstring\"", "This\nis\na\nstring", utils.whitespaceToNewline("This is a string"));

    }

    @Test
    public void substringArrayTest () {

        String[] expected = {"a", "s", "st", "str", "stri", "strin", "string", "t", "tr", "tri", "trin", "tring", "r", "ri", "rin", "ring", "i", "in", "ing", "n", "ng", "g"};

        assertEquals("The string should be \"[" + expected + "]\"", expected, utils.substringArray("a string"));

    }

}
