import block4lesson4.Task1.*;
import block4lesson4.Task1.Double;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Lesson4Tack1Test {
    @DisplayName("Test for function Square.")
    @Test
    void applyFunctionForSquare() {
        int[] arr = {1, 2, 3, 4};
        Function function = new Square();
        int[] result = Main.applyFunction(arr, function);
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, result);
    }

    @DisplayName("Test for function Half.")
    @Test
    void applyFunctionForHalf() {
        int[] arr = {1, 2, 4, 8};
        Function function = new Half();
        int[] result = Main.applyFunction(arr, function);
        int[] expected = {0, 1, 2, 4};
        assertArrayEquals(expected, result);
    }

    @DisplayName("Test for function Double.")
    @Test
    void applyFunctionForDouble() {
        int[] arr = {1, 2, 4, 8};
        Function function = new Double();
        int[] result = Main.applyFunction(arr, function);
        int[] expected = {2, 4, 8, 16};
        assertArrayEquals(expected, result);
    }

    @DisplayName("Test for function without arguments.")
    @Test
    public void testNoArguments() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] args = {};
        Main.main(args);
        assertEquals("Не передано название операции.", outContent.toString().trim());
    }

    @DisplayName("Test for function with unsupported operation.")
    @Test
    public void testForUnsupportedOperation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] args = {"Hello world", "1", "2", "ав", "8"};
        Main.main(args);
        assertEquals("Операция Hello world не поддерживается.", outContent.toString().trim());
    }

    @DisplayName("Testing a function without passing numbers to the operation.")
    @Test
    public void testOneArgument() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] args = {"Half"};
        Main.main(args);
        assertEquals("Не переданы числа для операции.", outContent.toString().trim());
    }

    @DisplayName("Testing a Function with an Invalid Argument.")
    @Test
    public void testForException() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] args = {"Half", "1", "2", "ав", "8"};
        Main.main(args);
        assertEquals("Аргумент \"ав\" не является числом.", outContent.toString().trim());
    }
}