import lesson54.Task2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void testAction() {
        // Создать поток для сохранения значений System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // Установить поток вывода нашим потоком для сохранения результатов
        System.setOut(new PrintStream(outContent, false, StandardCharsets.UTF_8));

        // Вызвать метод
        Task2.action("C:/Users/username/Documents/file.txt", 27);

        // Получить строку вывода из нашего потока
        String expectedOutput = "Путь: C:/Users/username/Documents/\r\n" +
                "Имя файла: file.txt\r\n";
        String actualOutput = outContent.toString(StandardCharsets.UTF_8);

        // Проверить значения
        assertEquals(expectedOutput, actualOutput);
    }
}
