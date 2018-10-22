package pl.aszul.consileon.lionsacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @ParameterizedTest
    @CsvSource({
            "'a, bb, b, ccc', 1, 2",
            "'a, bb, b, ccc', 3, 1",
            "'a, bb, b, ccc', 4, 0"
    })
    @DisplayName("Unit test for recruitment Task #1 (basic implementation)")
    void wordsCountShouldProvideValidResult(String words, int len, int expected) {
        assertEquals(Task1.wordsCount(words.split(", "), len), expected);
    }

    @ParameterizedTest
    @CsvSource({
            "'a, bb, b, ccc', 1, 2",
            "'a, bb, b, ccc', 3, 1",
            "'a, bb, b, ccc', 4, 0"
    })
    @DisplayName("Unit test for recruitment Task #1 (advanced implementation)")
    void wordsCountExtShouldProvideValidResult(String words, int len, int expected) {
        assertEquals(Task1.wordsCountExt(words.split(", "), len), expected);
    }

}
