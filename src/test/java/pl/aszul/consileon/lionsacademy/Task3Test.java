package pl.aszul.consileon.lionsacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 0",
            "2, 2, 2, 20",
            "1, 1, 2, 10"
    })
    @DisplayName("Unit test for recruitment Task #3 (basic implementation)")
    void greenTicketShouldProvideValidResult(int a, int b, int c, int expected) {
        assertEquals(Task3.greenTicket(a, b, c), expected);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 0",
            "2, 2, 2, 20",
            "1, 1, 2, 10"
    })
    @DisplayName("Unit test for recruitment Task #3 (advanced implementation)")
    void greenTicketExtShouldProvideValidResult(int a, int b, int c, int expected) {
        assertEquals(Task3.greenTicketExt(a, b, c), expected);
    }

}
