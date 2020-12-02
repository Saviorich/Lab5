package by.bntu.fitr.poisit.lab05.model.logic;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberParserTest {

    private static NumberParser np = new NumberParser();

    @Test
    public void testCalculateDigitsSum1() {
        int expected = 13;
        int actual = np.calculateDigitsSum(1552);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateDigitsSum2(){
        int expected = 29;
        int actual = np.calculateDigitsSum(-42599);

        assertEquals(expected, actual);
    }

    @Test
    public void testHasDuplicates1() {
        assertTrue(np.hasDuplicates(123456719));
    }

    @Test
    public void testHasDuplicates2() {
        assertFalse(np.hasDuplicates(123456789));
    }

    @Test
    public void testHasDuplicates3() {
        assertFalse(np.hasDuplicates(1230987654));
    }

    @Test
    public void testIsAscending1() {
        assertTrue(np.isAscending(-12345));
    }

    @Test
    public void testIsAscending2() {
        assertFalse(np.isAscending(123457689));
    }

    @Test
    public void testCountUniqueDigits1() {
        int expected = 6;
        int actual = np.countUniqueDigits(123456);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountUniqueDigits2() {
        int expected = 2;
        int actual = np.countUniqueDigits(12345543);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountUniqueDigits3() {
        int expected = 0;
        int actual = np.countUniqueDigits(1111111111);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsPowerOf1() {
        assertTrue(np.isPowerOf(8, 2));
    }

    @Test
    public void testIsPowerOf2() {
        assertFalse(np.isPowerOf(123, 2));
    }

    @Test
    public void testIsPowerOf3() {
        assertTrue(np.isPowerOf(2187, 3));
    }

    @Test
    public void testIsPowerOf4() {
        assertTrue(np.isPowerOf(4913, 17));
    }
}