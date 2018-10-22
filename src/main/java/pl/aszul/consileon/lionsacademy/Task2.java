package pl.aszul.consileon.lionsacademy;

import java.util.Arrays;

class Task2 {

    /**
     * https://codingbat.com/prob/p183837
     * <p>
     * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
     * <p>
     * wordsFront(["a", "b", "c", "d"], 1) → ["a"]
     * wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
     * wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
     *
     * @param words array of strings to copy from
     * @param n     length of expected result array
     * @return new arrays of string with specified length
     */
    public static String[] wordsFront(String[] words, int n) {
        var result = new String[n];

        for (var i = 0; i < n; i++) {
            result[i] = words[i];
        }

        return result;
    }

    /**
     * Extended implementation
     */
    public static String[] wordsFrontExt(String[] words, int n) {
        return Arrays.copyOf(words, n);
    }

}
