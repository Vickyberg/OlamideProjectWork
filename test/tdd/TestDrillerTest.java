package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    @Test
    public void rangeOneTest() {
        Driller utmeBook = new Driller();
        int copies = utmeBook.numberOFCopies(4);
        assertEquals(8000, copies);
        assertEquals(1800*5, utmeBook.numberOFCopies(5));

    }

    @Test
    public void rangeTwoTest() {
        Driller utmeBook = new Driller();
        int copies = utmeBook.numberOFCopies(7);
        assertEquals(12_600, copies);

    }
    @Test
    public void rangeThreeTest() {
        Driller utmeBook = new Driller();
        int copies = utmeBook.numberOFCopies(11);
        assertEquals(17_600, copies);

    }
    @Test
    public void rangeFourTest() {
        Driller utmeBook = new Driller();
        int copies = utmeBook.numberOFCopies(40);
        assertEquals(60_000, copies);

    }
    @Test
    public void rangeFiveTest() {
        Driller utmeBook = new Driller();
        int copies = utmeBook.numberOFCopies(61);
        assertEquals(79_300, copies);

    }
    @Test
    public void rangeSixTest() {
        Driller utmeBook = new Driller();
        int copies = utmeBook.numberOFCopies(121);
        assertEquals(145_200, copies);

    }
    @Test
    public void rangeSevenTest() {
        Driller utmeBook = new Driller();
        int copies = utmeBook.numberOFCopies(301);
        assertEquals(331_100, copies);

    }
    @Test
    public void rangeEightTest() {
        Driller utmeBook = new Driller();
        int copies = utmeBook.numberOFCopies(600);
        assertEquals(600_000, copies);

    }

}
