import lesson54.Task2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class Lesson54Task2Test {
    @DisplayName("Test for lesson 54, task 2. Using \"/\".")
    @Test
    public void testFirstAction() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent, false, StandardCharsets.UTF_8));
        Task2.action("C:/Users/username/Documents/file.txt", 27);
        String expectedOutput = "Путь: C:/Users/username/Documents/\r\n" +
                "Имя файла: file.txt\r\n";
        String actualOutput = outContent.toString(StandardCharsets.UTF_8);
        assertEquals(expectedOutput, actualOutput);
    }

    @DisplayName("Test for lesson 54, task 2. Using \"/\".")
    @Test
    public void testSecondAction() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent, false, StandardCharsets.UTF_8));
        Task2.action("/bin/java", 4);
        String expectedOutput = "Путь: /bin/\r\n" +
                "Имя файла: java\r\n";
        String actualOutput = outContent.toString(StandardCharsets.UTF_8);
        assertEquals(expectedOutput, actualOutput);
    }
}
