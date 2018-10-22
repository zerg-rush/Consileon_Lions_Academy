package pl.aszul.consileon.lionsacademy;

import java.util.Arrays;

class Task1 {

    /**
     * https://codingbat.com/prob/p124620
     * <p>
     * Given an array of strings, return the count of the number of strings with the given length.
     * <p>
     * wordsCount(["a", "bb", "b", "ccc"], 1) → 2
     * wordsCount(["a", "bb", "b", "ccc"], 3) → 1
     * wordsCount(["a", "bb", "b", "ccc"], 4) → 0
     *
     * @param words array of words which have to be analyzed
     * @param len   length of words to be counted
     * @return number of words with specified length
     */
    public static int wordsCount(String[] words, int len) {
        var result = 0;

        for (String word : words) {
            if (word.length() == len) {
                result++;
            }
        }

        return result;
    }

    /**
     * Extended implementation
     */
    public static int wordsCountExt(String[] words, int len) {
        return (int) Arrays.stream(words)
                .filter(word -> word.length() == len)
                .count();
    }

}
