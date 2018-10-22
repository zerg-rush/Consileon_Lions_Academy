package pl.aszul.consileon.lionsacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task2Test {

    @ParameterizedTest
    @CsvSource({
            "'a, b, c, d', 1, a",
            "'a, b, c, d', 2, 'a, b'",
            "'a, b, c, d', 3, 'a, b, c'"
    })
    @DisplayName("Unit test for recruitment Task #2 (basic implementation)")
    void wordsFrontShouldProvideValidResult(String words, int n, String expected) {
        assertArrayEquals(Task2.wordsFront(words.split(", "), n), expected.split(", "));
    }

    @ParameterizedTest
    @CsvSource({
            "'a, b, c, d', 1, a",
            "'a, b, c, d', 2, 'a, b'",
            "'a, b, c, d', 3, 'a, b, c'"
    })
    @DisplayName("Unit test for recruitment Task #2 (advanced implementation)")
    void wordsFrontExtShouldProvideValidResult(String words, int n, String expected) {
        assertArrayEquals(Task2.wordsFrontExt(words.split(", "), n), expected.split(", "));
    }

}
