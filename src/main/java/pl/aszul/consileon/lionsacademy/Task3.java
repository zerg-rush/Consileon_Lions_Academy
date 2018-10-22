package pl.aszul.consileon.lionsacademy;

import java.util.stream.IntStream;

class Task3 {

    /**
     * https://codingbat.com/prob/p120633
     * <p>
     * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
     * the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
     * the result is 10.
     * <p>
     * greenTicket(1, 2, 3) → 0
     * greenTicket(2, 2, 2) → 20
     * greenTicket(1, 1, 2) → 10
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return 0 if all numbers are uniq, 20 if all the same and 10 if two of them are equal
     */
    public static int greenTicket(int a, int b, int c) {
        var equals = 0;

        if (a == b) equals++;
        if (b == c) equals++;
        if (a == c) equals++;

        switch (equals) {
            case 0:
                return 0;
            case 1:
                return 10;
            default:
                return 20;
        }
    }

    /**
     * Extended implementation
     */
    public static int greenTicketExt(int a, int b, int c) {
        var uniqCount = (int) IntStream.of(a, b, c)
                .distinct()
                .count();

        switch (uniqCount) {
            case 3:
                return 0;
            case 2:
                return 10;
            default:
                return 20;
        }
    }

}
