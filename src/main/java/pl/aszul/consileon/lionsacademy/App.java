package pl.aszul.consileon.lionsacademy;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        System.out.println("\nTask #1\n" +
                "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 1) → 2\n" +
                "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 3) → 1\n" +
                "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 4) → 0");
        System.out.println("\nbasic implementation:");
        System.out.println(Task1.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(Task1.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(Task1.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));

        System.out.println("\nextended implementation:");
        System.out.println(Task1.wordsCountExt(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(Task1.wordsCountExt(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(Task1.wordsCountExt(new String[]{"a", "bb", "b", "ccc"}, 4));


        System.out.println("\nTask #2\n" +
                "wordsFront([\"a\", \"b\", \"c\", \"d\"], 1) → [\"a\"]\n" +
                "wordsFront([\"a\", \"b\", \"c\", \"d\"], 2) → [\"a\", \"b\"]\n" +
                "wordsFront([\"a\", \"b\", \"c\", \"d\"], 3) → [\"a\", \"b\", \"c\"]");
        System.out.println("\nbasic implementation:");
        System.out.println(Arrays.toString(Task2.wordsFront(new String[]{"a", "b", "c", "d"}, 1)));
        System.out.println(Arrays.toString(Task2.wordsFront(new String[]{"a", "b", "c", "d"}, 2)));
        System.out.println(Arrays.toString(Task2.wordsFront(new String[]{"a", "b", "c", "d"}, 3)));

        System.out.println("\nextended implementation:");
        System.out.println(Arrays.toString(Task2.wordsFrontExt(new String[]{"a", "b", "c", "d"}, 1)));
        System.out.println(Arrays.toString(Task2.wordsFrontExt(new String[]{"a", "b", "c", "d"}, 2)));
        System.out.println(Arrays.toString(Task2.wordsFrontExt(new String[]{"a", "b", "c", "d"}, 3)));


        System.out.println("\nTask #3\n" +
                "greenTicket(1, 2, 3) → 0\n" +
                "greenTicket(2, 2, 2) → 20\n" +
                "greenTicket(1, 1, 2) → 10");
        System.out.println("\nbasic implementation:");
        System.out.println(Task3.greenTicket(1, 2, 3));
        System.out.println(Task3.greenTicket(2, 2, 2));
        System.out.println(Task3.greenTicket(1, 1, 2));

        System.out.println("\nextended implementation:");
        System.out.println(Task3.greenTicketExt(1, 2, 3));
        System.out.println(Task3.greenTicketExt(2, 2, 2));
        System.out.println(Task3.greenTicketExt(1, 1, 2));
    }

}
