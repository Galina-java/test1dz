import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user = new User();

    @Test
    void testEvenNumber() {
        assertTrue(user.evenOddNumber(4));
    }

    @Test
    void testOddNumber() {
        assertFalse(user.evenOddNumber(5));
    }

    @Test
    void testZero() {
        assertTrue(user.evenOddNumber(0));
    }

    @Test
    void testNegativeEvenNumber() {
        assertTrue(user.evenOddNumber(-6));
    }

    @Test
    void testNegativeOddNumber() {
        assertFalse(user.evenOddNumber(-7));
    }

    @Test
    void testNumberInInterval() {
        assertTrue(user.numberInInterval(50));
    }

    @Test
    void testNumberBelowInterval() {
        assertFalse(user.numberInInterval(20));
    }

    @Test
    void testNumberAboveInterval() {
        assertFalse(user.numberInInterval(120));
    }

    @Test
    void testNumberAtLowerBoundary() {
        assertFalse(user.numberInInterval(25));
    }

    @Test
    void testNumberAtUpperBoundary() {
        assertFalse(user.numberInInterval(100));
    }

    @Test
    void testNumberJustAboveLowerBoundary() {
        assertTrue(user.numberInInterval(26));
    }

    @Test
    void testNumberJustBelowUpperBoundary() {
        assertTrue(user.numberInInterval(99));
    }
}