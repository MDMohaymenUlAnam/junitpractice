import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryToDecimalTest {

    @Test
    public void testNormalBinaryNumber() {
        long result = BinaryToDecimal.binaryToDecimal(1011);
        assertEquals(11, result);
    }

    @Test
    public void testNegativeBinaryNumber() {
        long result = BinaryToDecimal.binaryToDecimal(-0b1101);
        assertEquals(-13, result);
    }



    @Test
    public void testZeroBinaryNumber() {
        long result = BinaryToDecimal.binaryToDecimal(0);
        assertEquals(0, result);
    }

    @Test
    public void testInvalidBinaryNumber() {
        long result = BinaryToDecimal.binaryToDecimal(101101);
        assertEquals(45, result);
    }

    @Test
    public void testBinaryWithPaddedZeroes() {
        long decimal = BinaryToDecimal.binaryToDecimal(Long.parseLong("00000101", 2));
        assertEquals(5, decimal);
    }

    @Test
    public void testDecimalBinaryNumber() {
        long result = BinaryToDecimal.binaryToDecimal(1101);
        assertEquals(13, result);
    }
}
