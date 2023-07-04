import lesson54.Task6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Lesson54Task6Test {
    @DisplayName("Test for positive numbers.")
    @Test
    void testToIntPositiveNumber() {
        String str = "123";
        int actual = Task6.toInt(str);
        Assertions.assertEquals(123, actual);
    }

    @DisplayName("Test for negative numbers.")
    @Test
    void testToIntNegativeNumber() {
        String str = "-456";
        int actual = Task6.toInt(str);
        Assertions.assertEquals(-456, actual);
    }

    @DisplayName("Testing using 0.")
    @Test
    void testToIntZero() {
        String str = "0";
        int actual = Task6.toInt(str);
        Assertions.assertEquals(0, actual);
    }

    @DisplayName("Test for numbers in 0012 format.")
    @Test
    void testToIntZeroBeforeNumber() {
        String str = "0012";
        int actual = Task6.toInt(str);
        Assertions.assertEquals(12, actual);
    }

}