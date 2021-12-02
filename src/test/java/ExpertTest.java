import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpertTest {

    @Test
    void reverseString() {
        assertEquals("gnirtS", Expert.reverseString("String"));
    }

    @Test
    void sortArray() {
        int[] arr = {6, 2, 8, 3, 9, 6};
        int[] sortedArr = {2, 3, 6, 6, 8, 9};
        assertArrayEquals(sortedArr, Expert.sortArray(arr));
    }

    @Test
    void testSeparatingString() {
        String[] arr = {"Turtle", "Meep", "Bootcamp"};
        assertArrayEquals(arr, Expert.seperateString("Turtle,Meep,Bootcamp"));
    }

    @Test
    void checkCalcChecksum() {
        assertEquals(6, Expert.calcChecksum(123));
    }

    @Test
    void checkDecimalToRoman() {
        assertEquals("XII", Expert.decimalToRoman((12)));
    }
}