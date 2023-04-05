import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalToHexaDecimalTest {

    @Test
    public void testPositiveDecimal() {
        String result = DecimalToHexaDecimal.decToHex(298);
        assertEquals("0000012a", result);
    }


    @Test
    public void testNegativeDecimal() {
        String result = DecimalToHexaDecimal.decToHex(-72);
        assertEquals("ffffffb8", result);
    }

    @Test
    public void testSingleDecimal() {
        String result = DecimalToHexaDecimal.decToHex(6);
        assertEquals("00000006", result);
    }

    @Test
    public void testNonNumericInput() {
        try {
            DecimalToHexaDecimal.decToHex(Integer.parseInt("abc"));
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }


    @Test
    public void testDecimalWithDecimalPoint() {
        String result = DecimalToHexaDecimal.decToHex((int) 12.3);
        assertEquals("0000000c", result);
    }
}

