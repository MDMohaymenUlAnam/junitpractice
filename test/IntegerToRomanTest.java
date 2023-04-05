import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testIntegerToRoman() {
        assertEquals("III", IntegerToRoman.integerToRoman(3));
        assertEquals("IV", IntegerToRoman.integerToRoman(4));
//        assertEquals("IX", IntegerToRoman.integerToRoman(9));
//        assertEquals("LVIII", IntegerToRoman.integerToRoman(58));
//        assertEquals("MCMXCIV", IntegerToRoman.integerToRoman(1994));
    }

//    @Test
//    public void testIntegerToRomanWithLargeNumber() {
//        assertEquals("M", IntegerToRoman.integerToRoman(1000));
//        assertEquals("MMMCMXCIX", IntegerToRoman.integerToRoman(3999));
//        assertEquals("MCMXC", IntegerToRoman.integerToRoman(1990));
//        assertEquals("CMXCIX", IntegerToRoman.integerToRoman(999));
//        assertEquals("CM", IntegerToRoman.integerToRoman(900));
//        assertEquals("MMMDCCCLXXXVIII", IntegerToRoman.integerToRoman(3888));
//    }
@Test
public void testLargeInteger() {
    String expected = "M\u0305";
    String result = IntegerToRoman.integerToRoman(1000000000);
    assertEquals(expected, result, "Failed for large integer input");
}



    @Test
    public void testIntegerToRomanWithNegativeNumber() {
        assertEquals("", IntegerToRoman.integerToRoman(-10));
//        assertEquals("", IntegerToRoman.integerToRoman(0));
//        assertEquals("", IntegerToRoman.integerToRoman(-100));
        assertEquals("", IntegerToRoman.integerToRoman(-3999));
    }
}
