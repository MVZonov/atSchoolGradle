import lesson54.Task1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


        public class Lesson54Task1Test {
            @DisplayName("Test for lesson 54, task 1. Positive scenario.")
            @Test
            public void testFindIndex() {
                assertEquals(2, Task1.findIndex("к"));
            }
            @DisplayName("Test for lesson 54, task 1. Negative scenario.")
            @Test
            public void testFindWrongIndex() {
                assertEquals(-1, Task1.findIndex("d"));
            }
        }