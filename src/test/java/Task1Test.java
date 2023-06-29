import lesson54.Task1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


        public class Task1Test {
            @DisplayName("Test for lesson 54, task 1.")
            @Test
            public void testFindIndex() {
                assertEquals(2, Task1.findIndex("к"));
            }
        }